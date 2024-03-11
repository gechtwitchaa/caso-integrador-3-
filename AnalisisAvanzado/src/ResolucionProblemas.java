public class ResolucionProblemas {
    private double tasaCrecimientoPresas;
    private double tasaCrecimientoDepredadores;
    private double tasaMuertePresas;
    private double tasaMuerteDepredadores;
    private double poblacionInicialPresas;
    private double poblacionInicialDepredadores;

    public ResolucionProblemas(double tasaCrecimientoPresas, double tasaCrecimientoDepredadores,
                              double tasaMuertePresas, double tasaMuerteDepredadores,
                              double poblacionInicialPresas, double poblacionInicialDepredadores) {
        this.tasaCrecimientoPresas = tasaCrecimientoPresas;
        this.tasaCrecimientoDepredadores = tasaCrecimientoDepredadores;
        this.tasaMuertePresas = tasaMuertePresas;
        this.tasaMuerteDepredadores = tasaMuerteDepredadores;
        this.poblacionInicialPresas = poblacionInicialPresas;
        this.poblacionInicialDepredadores = poblacionInicialDepredadores;
    }

    public void simular(int pasos) {
        double presas = poblacionInicialPresas;
        double depredadores = poblacionInicialDepredadores;

        for (int i = 0; i < pasos; i++) {
            double nuevaPoblacionPresas = presas * (1 + tasaCrecimientoPresas - tasaMuertePresas * depredadores);
            double nuevaPoblacionDepredadores = depredadores * (1 - tasaMuerteDepredadores + tasaCrecimientoDepredadores * presas);

            presas = nuevaPoblacionPresas;
            depredadores = nuevaPoblacionDepredadores;

            System.out.println("Paso " + (i + 1) + ": Presas = " + presas + ", Depredadores = " + depredadores);
        }
    }

    public static void main(String[] args) {
        // Parámetros del modelo
        double tasaCrecimientoPresas = 0.1;
        double tasaCrecimientoDepredadores = 0.02;
        double tasaMuertePresas = 0.01;
        double tasaMuerteDepredadores = 0.05;
        double poblacionInicialPresas = 100;
        double poblacionInicialDepredadores = 20;

        // Crear instancia del modelo
        ResolucionProblemas modelo = new ResolucionProblemas(tasaCrecimientoPresas, tasaCrecimientoDepredadores,
                tasaMuertePresas, tasaMuerteDepredadores, poblacionInicialPresas, poblacionInicialDepredadores);

        // Simular durante 10 pasos
        modelo.simular(10);
    }
}
