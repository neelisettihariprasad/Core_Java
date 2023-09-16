package Test.com;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookManagement {
    public boolean addBook(String title, String author) {
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement("INSERT INTO books (title, author) VALUES (?, ?)")) {
            statement.setString(1, title);
            statement.setString(2, author);
            return statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deleteBook(int bookId) {
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement("DELETE FROM books WHERE id = ?")) {
            statement.setInt(1, bookId);
            return statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
