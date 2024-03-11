public class Main {

    public static void main(String[] args) {
        // Crear organismos
        Planta planta = new Planta("Posición inicial", 100, 5, "Fértil", "Hierba");
        Animal animal = new Animal("Otra posición", 80, 10, "Fértil", "León", true);

        // Mostrar información de los organismos
        System.out.println(planta);
        System.out.println(animal);

        // Crear un ambiente
        Ambiente ambiente = new Ambiente("Soleado", "Montañoso", "Ríos");

        // Mostrar información del ambiente
        System.out.println(ambiente);

        // Simular interacciones
        simularInteracciones(planta, animal);
    }

    // Método para simular interacciones entre organismos en un ambiente
    public static void simularInteracciones(Planta planta, Animal animal) {
        // Implementa la lógica para simular interacciones entre plantas y animales en el ambiente
    }
}
