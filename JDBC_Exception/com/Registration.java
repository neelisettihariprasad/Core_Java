package Test.com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Registration {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/elearning";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";
    public static void main(String[] args) throws SQLException {
        // Create a connection to the database
        Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        // Create a prepared statement
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO students (username, email, password,gender,course,mobile) VALUES (?,?,?, ?, ?,?)");
        // Get the user input
        String username = "Hari Prasad";
        String email = "hariprasadn.2018@gmail.com";
        String password = "Hari@123";
        String gender = "Male";
        String course = "java full stack";
        String mobile = "6305530361";
        // Set the parameters
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, email);
        preparedStatement.setString(3, password);
        preparedStatement.setString(4, gender);
        preparedStatement.setString(5, course);
        preparedStatement.setString(6, mobile);
        // Execute the statement
        preparedStatement.executeUpdate();
        // Close the connection
        connection.close();
    }
}