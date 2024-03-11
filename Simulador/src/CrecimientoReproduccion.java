import java.util.Random;

public class Organismo {
    // Atributos y métodos como se definió anteriormente
}

public class Planta extends Organismo {
    // Atributos y métodos como se definió anteriormente

    // Método para simular la reproducción de plantas
    public void reproducirse() {
        Random random = new Random();
        if (random.nextDouble() < 0.5) { // Probabilidad de reproducción del 50%
            System.out.println("La planta se ha reproducido.");
            // Lógica para crear una nueva instancia de Planta o aumentar la población
        } else {
            System.out.println("La planta no ha podido reproducirse en esta ocasión.");
        }
    }
}

public class Animal extends Organismo {
    // Atributos y métodos como se definió anteriormente

    // Método para simular la reproducción de animales
    public void reproducirse() {
        Random random = new Random();
        if (random.nextDouble() < 0.3) { // Probabilidad de reproducción del 30%
            System.out.println("El animal se ha reproducido.");
            // Lógica para crear una nueva instancia de Animal o aumentar la población
        } else {
            System.out.println("El animal no ha podido reproducirse en esta ocasión.");
        }
    }
}
