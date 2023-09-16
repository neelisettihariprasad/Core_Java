package Test.com;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentRegistration {
    public static void registerStudent(String name, String email, String course) {
        Connection connection = DBConnections.getConnection();
        if (connection == null) {
            System.out.println("Failed to connect to the database.");
            return;
        }

       // String query = "INSERT INTO student (name, email, course) VALUES (?, ?, ?)";
      //  PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO student (name, email, course) VALUES (?,?,?)");
       /* try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, course);
            preparedStatement.executeUpdate();
            System.out.println("Student registered successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to register student.");
        }*/
        try {
        	 PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO student (name, email, course) VALUES (?,?,?)");
        String n= "Hari Prasad";
        String e = "hariprasadn.2018@gmail.com";
        String co = "java full stack";
        preparedStatement.setString(1, n);
        preparedStatement.setString(2, e);
        preparedStatement.setString(2, co);
        preparedStatement.executeUpdate();
        connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to register student.");
        }
        
    }
}