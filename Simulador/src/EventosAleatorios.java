import java.util.Random;

public class Organismo {
    // Atributos y métodos como se definió anteriormente

    // Método para simular un evento aleatorio
    public void eventoAleatorio() {
        Random random = new Random();
        double probabilidadEvento = random.nextDouble();

        if (probabilidadEvento < 0.1) { // Por ejemplo, 10% de probabilidad de evento aleatorio
            // Ejemplo de un evento aleatorio que afecta a la salud
            int saludAfectada = random.nextInt(10) + 1; // Se afecta la salud en un rango de 1 a 10
            this.setHealth(this.getHealth() - saludAfectada);

            System.out.println("¡Se ha producido un evento aleatorio! La salud se ha reducido en " + saludAfectada);
        }
    }
}

public class Planta extends Organismo {
    // Atributos y métodos como se definió anteriormente

    // Método para simular la reproducción de plantas
    public void reproducirse() {
        // Lógica de reproducción como se definió anteriormente

        // Llamar al evento aleatorio después de la reproducción
        eventoAleatorio();
    }
}

public class Animal extends Organismo {
    // Atributos y métodos como se definió anteriormente

    // Método para simular la reproducción de animales
    public void reproducirse() {
        // Lógica de reproducción como se definió anteriormente

        // Llamar al evento aleatorio después de la reproducción
        eventoAleatorio();
    }
}
