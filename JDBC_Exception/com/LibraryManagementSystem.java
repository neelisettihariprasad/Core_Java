package Test.com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.*
;public class LibraryManagementSystem {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/hariprasad";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD);
            
            
            // User Registration
            registerUser(connection, "prasad", "prasad111");
            
            // User Login
            if (loginUser(connection, "prasad", "prasad111")) {
            	
                // Book Management
                addBook(connection, "Java-Full-Stack", "James Gosling");
                updateBook(connection, 1, "Python", "Van Guido Rossum");
                deleteBook(connection, 1);
                
                // Issue and Return Books
                issueBook(connection, 101,101);
                returnBook(connection, 103);
            } else {
                System.out.println("Login failed.");
                
            }        
            
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    

    public static void registerUser(Connection connection, String username, String password) throws SQLException {
        String sql = "INSERT INTO users (username, password) VALUES (?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            preparedStatement.executeUpdate();
            System.out.println("User registered successfully.");
        }
    }

    public static boolean loginUser(Connection connection, String username, String password) throws SQLException {
        String sql = "SELECT id FROM users WHERE username = ? AND password = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("User login successfully.Welcome,"+ username);
            return resultSet.next();
        }
    }

    public static void addBook(Connection connection, String title, String author) throws SQLException {
        String sql = "INSERT INTO books (title, author, available) VALUES (?, ?, 1)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, title);
            preparedStatement.setString(2, author);
            preparedStatement.executeUpdate();
            System.out.println("Book added successfully.");
        }
    }

    public static void updateBook(Connection connection, int bookId, String title, String author) throws SQLException {
        String sql = "UPDATE books SET title = ?, author = ? WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, title);
            preparedStatement.setString(2, author);
            preparedStatement.setInt(3, bookId);
            preparedStatement.executeUpdate();
            System.out.println("Book updated successfully.");
        }
    }

    public static void deleteBook(Connection connection, int bookId) throws SQLException {
        String sql = "DELETE FROM books WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, bookId);
            preparedStatement.executeUpdate();
            System.out.println("Book deleted successfully.");
        }
    }

    public static void issueBook(Connection connection, int userId, int bookId) throws SQLException {
        // Implement logic to issue a book and update the transactions table.
        try {
            // Check if the book is available
            String checkAvailabilitySQL = "SELECT available FROM books WHERE id = ?";
            try (PreparedStatement checkAvailabilityStatement = connection.prepareStatement(checkAvailabilitySQL)) {
                checkAvailabilityStatement.setInt(1, bookId);
                ResultSet availabilityResult = checkAvailabilityStatement.executeQuery();
                if (availabilityResult.next()) {
                    int available = availabilityResult.getInt("available");
                    if (available > 0) {
                        // Book is available, proceed with issuing
                        String issueBookSQL = "INSERT INTO transactions (user_id, book_id, issue_date) VALUES (?, ?, CURDATE())";
                        try (PreparedStatement issueBookStatement = connection.prepareStatement(issueBookSQL)) {
                            issueBookStatement.setInt(1, userId);
                            issueBookStatement.setInt(2, bookId);
                            int rowsAffected = issueBookStatement.executeUpdate();
                            if (rowsAffected > 0) {
                                // Update book availability
                                String updateAvailabilitySQL = "UPDATE books SET available = available - 1 WHERE id = ?";
                                try (PreparedStatement updateAvailabilityStatement = connection.prepareStatement(updateAvailabilitySQL)) {
                                    updateAvailabilityStatement.setInt(1, bookId);
                                    updateAvailabilityStatement.executeUpdate();
                                    System.out.println("Book issued successfully.");
                                }
                            }
                        }
                    } else {
                        System.out.println("Book is not available for issue.");
                    }
                } else {
                    System.out.println("Book not found.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void returnBook(Connection connection, int transactionId) throws SQLException {
        // Implement logic to return a book and update the transactions table.
        try {
            // Get return_date if it's not already set
            String checkReturnDateSQL = "SELECT return_date FROM transactions WHERE id = ?";
            try (PreparedStatement checkReturnDateStatement = connection.prepareStatement(checkReturnDateSQL)) {
                checkReturnDateStatement.setInt(1, transactionId);
                ResultSet returnDateResult = checkReturnDateStatement.executeQuery();
                if (returnDateResult.next()) {
                    Date returnDate = returnDateResult.getDate("return_date");
                    if (returnDate == null) {
                        // Set the return date
                        String returnBookSQL = "UPDATE transactions SET return_date = CURDATE() WHERE id = ?";
                        try (PreparedStatement returnBookStatement = connection.prepareStatement(returnBookSQL)) {
                            returnBookStatement.setInt(1, transactionId);
                            int rowsAffected = returnBookStatement.executeUpdate();
                            if (rowsAffected > 0) {
                                // Update book availability
                                String updateAvailabilitySQL = "UPDATE books SET available = available + 1 WHERE id = (SELECT book_id FROM transactions WHERE id = ?)";
                                try (PreparedStatement updateAvailabilityStatement = connection.prepareStatement(updateAvailabilitySQL)) {
                                    updateAvailabilityStatement.setInt(1, transactionId);
                                    updateAvailabilityStatement.executeUpdate();
                                    System.out.println("Book returned successfully.");
                                }
                            }
                        }
                    } else {
                        System.out.println("Book has already been returned.");
                    }
                } else {
                    System.out.println("Transaction not found.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
