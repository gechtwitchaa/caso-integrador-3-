public class Organismos {
    private String position;
    private int health;
    private int age;
    private String reproductiveStatus;

    public Organismos(String position, int health, int age, String reproductiveStatus) {
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
}

public class Planta {
    private String tipo;

    public Planta(String position, int health, int age, String reproductiveStatus, String tipo) {
        this.tipo = tipo;
    }

    // Getters y setters específicos para la clase Planta
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

public class Animal  {
    private String especie;
    private boolean carnivoro;

    public Animal(String position, int health, int age, String reproductiveStatus, String especie, boolean carnivoro) {
        super
        this.especie = especie;
        this.carnivoro = carnivoro;
    }

    // Getters y setters específicos para la clase Animal
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public boolean isCarnivoro() {
        return carnivoro;
    }

    public void setCarnivoro(boolean carnivoro) {
        this.carnivoro = carnivoro;
    }
}

