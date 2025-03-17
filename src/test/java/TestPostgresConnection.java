import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.IOException;
import java.nio.file.Path;

  public class TestPostgresConnection {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "bia123";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Conexão bem-sucedida!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
