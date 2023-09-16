package Test.com;
import java.sql.*;

public class LibrarySystem {

    private static final String DB_URL = "jdbc:mysql://localhost/library";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement statement = connection.createStatement();

            // User Registration
            String registerUserSQL = "INSERT INTO users (username, password) VALUES (?, ?)";
            PreparedStatement registerStatement = connection.prepareStatement(registerUserSQL);
            registerStatement.setString(1, "hari");
            registerStatement.setString(2, "12345");
            registerStatement.executeUpdate();

            // User Login
            String username = "hari";
            String password = "12345";
            String loginUserSQL = "SELECT * FROM users WHERE username = ? AND password = ?";
            PreparedStatement loginStatement = connection.prepareStatement(loginUserSQL);
            loginStatement.setString(1, username);
            loginStatement.setString(2, password);
            ResultSet resultSet = loginStatement.executeQuery();

            if (resultSet.next()) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Login Failed");
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

