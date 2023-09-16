package Test.com;
import java.sql.*;
public class BookManager {

	private static final String DB_URL = "jdbc:mysql://localhost/library";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement statement = connection.createStatement();

            // Add a Book
            String addBookSQL = "INSERT INTO books (title, author, available) VALUES (?, ?, ?)";
            PreparedStatement addBookStatement = connection.prepareStatement(addBookSQL);
            addBookStatement.setString(1, "java");
            addBookStatement.setString(2, "hari");
            addBookStatement.setBoolean(3, true); // Available
            addBookStatement.executeUpdate();

            // List Books
            String listBooksSQL = "SELECT * FROM books";
            ResultSet resultSet = statement.executeQuery(listBooksSQL);

            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Title: " + resultSet.getString("title"));
                System.out.println("Author: " + resultSet.getString("author"));
                System.out.println("Available: " + resultSet.getBoolean("available"));
                System.out.println();
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
