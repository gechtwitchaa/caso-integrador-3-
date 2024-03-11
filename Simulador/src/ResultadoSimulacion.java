

public class Simulacion {
    // Método para calcular la salud promedio del ecosistema
    public static double calcularSaludPromedio(List<Organismo> organismos) {
        double sumaSalud = 0;
        for (Organismo organismo : organismos) {
            sumaSalud += organismo.getHealth();
        }
        return sumaSalud / organismos.size();
    }

    // Método para calcular la tendencia poblacional
    public static String calcularTendenciaPoblacional(int poblacionInicial, int poblacionFinal) {
        if (poblacionFinal > poblacionInicial) {
            return "El ecosistema está creciendo";
        } else if (poblacionFinal < poblacionInicial) {
            return "El ecosistema está disminuyendo";
        } else {
            return "El ecosistema se mantiene estable";
        }
    }

    // Otros métodos para generar estadísticas adicionales según sea necesario
}
