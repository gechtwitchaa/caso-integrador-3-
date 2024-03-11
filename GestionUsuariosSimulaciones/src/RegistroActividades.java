import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public class RegistroActividades {

    // Método para insertar una nueva simulación en la base de datos
    public static void insertarSimulacion(int poblacionInicial, int duracionSimulacion, String resultado) {
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:registro_simulaciones.db");
             PreparedStatement stmt = conn.prepareStatement(
                     "INSERT INTO Simulaciones (poblacion_inicial, duracion_simulacion, resultado) VALUES (?, ?, ?)")) {

            stmt.setInt(1, poblacionInicial);
            stmt.setInt(2, duracionSimulacion);
            stmt.setString(3, resultado);
            stmt.executeUpdate();

            System.out.println("Simulación registrada correctamente en la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error al registrar la simulación: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Ejemplo de uso: Insertar una simulación en la base de datos
        insertarSimulacion(100, 10, "Resultado de la simulación");
    }
}
