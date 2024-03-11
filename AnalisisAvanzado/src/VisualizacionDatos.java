
public class VisualizacionDatos extends JFrame {

    public VisualizacionDatos(String title, double[] poblacionPresas, double[] poblacionDepredadores) {
        super(title);

        // Crear serie de datos para población de presas
        XYSeries seriesPresas = new XYSeries("Presas");
        for (int i = 0; i < poblacionPresas.length; i++) {
            seriesPresas.add(i, poblacionPresas[i]);
        }

        // Crear serie de datos para población de depredadores
        XYSeries seriesDepredadores = new XYSeries("Depredadores");
        for (int i = 0; i < poblacionDepredadores.length; i++) {
            seriesDepredadores.add(i, poblacionDepredadores[i]);
        }

        // Crear conjunto de datos y agregar las series
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(seriesPresas);
        dataset.addSeries(seriesDepredadores);

        // Crear el gráfico de líneas
        JFreeChart chart = ChartFactory.createXYLineChart(
                "Dinámica de Poblaciones",
                "Tiempo",
                "Población",
                dataset
        );

        // Crear panel de gráfico y agregarlo al frame
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(800, 600));
        setContentPane(chartPanel);
    }

    public static void main(String[] args) {
        // Datos de ejemplo: poblaciones de presas y depredadores
        double[] poblacionPresas = {100, 120, 130, 110, 100, 90, 85, 80, 75, 70};
        double[] poblacionDepredadores = {20, 25, 30, 35, 40, 45, 50, 55, 60, 65};

        // Crear y mostrar la ventana de visualización de datos
        SwingUtilities.invokeLater(() -> {
            VisualizacionDatos example = new VisualizacionDatos("Visualización de Datos", poblacionPresas, poblacionDepredadores);
            example.setSize(800, 600);
            example.setLocationRelativeTo(null);
            example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            example.setVisible(true);
        });
    }
}
{
}
