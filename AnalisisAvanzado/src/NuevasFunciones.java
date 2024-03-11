// Interfaz para definir un modelo genérico
interface Modelo {
    void simular(int pasos);
}

// Clase abstracta que implementa parte de la funcionalidad común a todos los modelos
abstract class ModeloBase implements Modelo {
    protected double poblacionInicial;
    protected double parametroX;
    protected double parametroY;

    public ModeloBase(double poblacionInicial, double parametroX, double parametroY) {
        this.poblacionInicial = poblacionInicial;
        this.parametroX = parametroX;
        this.parametroY = parametroY;
    }

    // Método común que podría ser útil para todos los modelos
    protected void imprimirResultado(double resultado) {
        System.out.println("Resultado de la simulación: " + resultado);
    }
}

// Clase que implementa un modelo específico personalizado
class ModeloPersonalizado extends ModeloBase {
    public ModeloPersonalizado(double poblacionInicial, double parametroX, double parametroY) {
        super(poblacionInicial, parametroX, parametroY);
    }

    @Override
    public void simular(int pasos) {
        // Implementación específica del modelo personalizado
        double resultado
    }
}

// Clase principal que utiliza los modelos personalizados
public class NuevasFunciones {
    public static void main(String[] args) {
        // Ejemplo de uso
        Modelo modelo = new ModeloPersonalizado(100, 0.1, 0.05);
        modelo.simular(10);
    }
}
