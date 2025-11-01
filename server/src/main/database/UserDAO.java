package database;

import java.sql.*;

public class UserDAO {
  private Connection conn;

  public UserDAO(Connection conn) {
    this.conn = conn;
  }

  // Lấy hoặc tạo user
  public int getUserId(String username) throws SQLException {
    String sql = "SELECT id FROM users WHERE username = ? AND deleted_at IS NULL";
    PreparedStatement pstmt = conn.prepareStatement(sql);
    pstmt.setString(1, username);
    ResultSet rs = pstmt.executeQuery();
    if (rs.next()) {
      return rs.getInt("id");
    } else {
      return createUser(username);
    }
  }

  private int createUser(String username) throws SQLException {
    String sql = "INSERT INTO users (username, status, is_active) VALUES (?, 'online', TRUE)";
    PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
    pstmt.setString(1, username);
    pstmt.executeUpdate();
    ResultSet rs = pstmt.getGeneratedKeys();
    if (rs.next()) {
      int userId = rs.getInt(1);
      System.out.println(" Created new user: " + username + " (ID: " + userId + ")");
      return userId;
    }
    return -1;
  }
}
