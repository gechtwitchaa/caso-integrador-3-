public class Organismo {
    private String position;
    private int health;
    private int age;
    private String reproductiveStatus;

    public Organismo(String position, int health, int age, String reproductiveStatus) {
        this.position = position;
        this.health = health;
        this.age = age;
        this.reproductiveStatus = reproductiveStatus;
    }

    // Getters y setters
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getReproductiveStatus() {
        return reproductiveStatus;
    }

    public void setReproductiveStatus(String reproductiveStatus) {
        this.reproductiveStatus = reproductiveStatus;
    }

    // Método para simular predación
    public void serDepredado(int cantidad) {
        health -= cantidad;
        if (health <= 0) {
            System.out.println("El organismo ha sido depredado y ha muerto.");
        }
    }

    // Método para simular competencia por recursos
    public void competirPorRecursos() {
        // Implementación de la competencia por recursos
        // Puede afectar la salud del organismo dependiendo de la lógica de competencia
    }

    // Método para simular polinización
    public void polinizar() {
        // Implementación de la polinización
        // Puede afectar el estado reproductivo del organismo
    }
}

public class Planta extends Organismo {
    private String tipo;

    public Planta(String position, int health, int age, String reproductiveStatus, String tipo) {
        super(position, health, age, reproductiveStatus);
        this.tipo = tipo;
    }

    // Otros métodos específicos para la clase Planta
}

public class Animal  {
    private String especie;

    public Animal(String position, int health, int age, String reproductiveStatus, String especie) {
        this.especie = especie;
    }

    // Otros métodos específicos para la clase Animal
}
