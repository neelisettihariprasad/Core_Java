package Test.com;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionManagement {
    public boolean borrowBook(int userId, int bookId) {
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement("INSERT INTO transactions (user_id, book_id, borrowed_date) VALUES (?, ?, NOW())")) {
            statement.setInt(1, userId);
            statement.setInt(2, bookId);
            return statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean returnBook(int transactionId) {
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement("UPDATE transactions SET returned_date = NOW() WHERE id = ?")) {
            statement.setInt(1, transactionId);
            return statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}

