public class Autenticacion


public class Autenticacion extends Application {

    private TextField textFieldUsuario;
    private PasswordField passwordFieldContraseña;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Inicio de Sesión");

        // Crear un panel de cuadrícula para organizar los elementos de la interfaz de usuario
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20, 20, 20, 20));
        grid.setVgap(10);
        grid.setHgap(10);

        // Agregar etiquetas y campos de texto para ingresar usuario y contraseña
        Label labelUsuario = new Label("Usuario:");
        GridPane.setConstraints(labelUsuario, 0, 0);
        textFieldUsuario = new TextField();
        GridPane.setConstraints(textFieldUsuario, 1, 0);

        Label labelContraseña = new Label("Contraseña:");
        GridPane.setConstraints(labelContraseña, 0, 1);
        passwordFieldContraseña = new PasswordField();
        GridPane.setConstraints(passwordFieldContraseña, 1, 1);

        // Botón para iniciar sesión
        Button buttonIniciarSesion = new Button("Iniciar Sesión");
        GridPane.setConstraints(buttonIniciarSesion, 0, 2);
        buttonIniciarSesion.setOnAction(event -> autenticarUsuario());

        // Agregar todos los elementos al panel de cuadrícula
        grid.getChildren().addAll(labelUsuario, textFieldUsuario,
                labelContraseña, passwordFieldContraseña,
                buttonIniciarSesion);

        Scene scene = new Scene(grid, 300, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Método para autenticar al usuario
    private void autenticarUsuario() {
        String usuario = textFieldUsuario.getText();
        String contraseña = passwordFieldContraseña.getText();

        // Lógica para autenticar al usuario (consulta a la base de datos, etc.)
        if (validarCredenciales(usuario, contraseña)) {
            System.out.println("Inicio de sesión exitoso. Bienvenido, " + usuario + "!");
            // Aquí puedes abrir la ventana principal de tu aplicación
        } else {
            System.out.println("Error: Usuario o contraseña incorrectos.");
        }
    }

    // Método para validar las credenciales del usuario
    private boolean validarCredenciales(String usuario, String contraseña) {
        // En este ejemplo, usamos una conexión SQLite en m
        {
}
