public class Simulacion extends Application {

    private TextField textFieldPoblacionInicial;
    private TextField textFieldDuracionSimulacion;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Simulación de Ecosistema");

        // Crear un panel de cuadrícula para organizar los elementos de la interfaz de usuario
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20, 20, 20, 20));
        grid.setVgap(10);
        grid.setHgap(10);

        // Agregar etiquetas y campos de texto para configurar la simulación
        Label labelPoblacionInicial = new Label("Población Inicial:");
        GridPane.setConstraints(labelPoblacionInicial, 0, 0);
        textFieldPoblacionInicial = new TextField();
        GridPane.setConstraints(textFieldPoblacionInicial, 1, 0);

        Label labelDuracionSimulacion = new Label("Duración de la Simulación:");
        GridPane.setConstraints(labelDuracionSimulacion, 0, 1);
        textFieldDuracionSimulacion = new TextField();
        GridPane.setConstraints(textFieldDuracionSimulacion, 1, 1);

        // Botón para iniciar la simulación
        Button buttonIniciarSimulacion = new Button("Iniciar Simulación");
        GridPane.setConstraints(buttonIniciarSimulacion, 0, 2);
        buttonIniciarSimulacion.setOnAction(event -> iniciarSimulacion());

        // Agregar todos los elementos al panel de cuadrícula
        grid.getChildren().addAll(labelPoblacionInicial, textFieldPoblacionInicial,
                labelDuracionSimulacion, textFieldDuracionSimulacion,
                buttonIniciarSimulacion);

        Scene scene = new Scene(grid, 400, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Método para iniciar la simulación
    private void iniciarSimulacion() {
        int poblacionInicial = Integer.parseInt(textFieldPoblacionInicial.getText());
        int duracionSimulacion = Integer.parseInt(textFieldDuracionSimulacion.getText());

        // Lógica para iniciar la simulación con los parámetros proporcionados
        // Puedes llamar a métodos de simulación y presentar resultados en esta sección
        System.out.println("Simulación iniciada con población inicial: " + poblacionInicial +
                " y duración: " + duracionSimulacion + " unidades de tiempo.");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
