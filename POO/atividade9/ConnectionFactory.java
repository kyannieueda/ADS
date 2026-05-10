import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static final String URL      = "jdbc:mysql://localhost:3306/clinica_db?useSSL=false&serverTimezone=America/Sao_Paulo";
    private static final String USER     = "root";
    private static final String PASSWORD = "123456789";

    private ConnectionFactory() {}

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void closeConnection(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                System.err.println("Erro ao fechar conexão: " + e.getMessage());
            }
        }
    }
}
