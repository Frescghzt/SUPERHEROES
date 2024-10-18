import java.util.Scanner;

// Clase base del personaje
class Personaje {
    String nombre;
    int fuerza;
    int velocidad;
    int vida_hp;

    // Definir constructor
    public Personaje(
            String nombre,
            int fuerza,
            int velocidad,
            int vida_hp) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.vida_hp = vida_hp;
    }
}

class SuperHero extends Personaje {
    // definir el constructor
    public SuperHero(
        String nombre,
        int fuerza,
        int velocidad,
        int vida_hp){
            super(nombre, fuerza, velocidad, vida_hp);
    }
}

class Villano extends Personaje {
    // definir el constructor
    public Villano(
        String nombre,
        int fuerza,
        int velocidad,
        int vida_hp){
            super(nombre, fuerza, velocidad, vida_hp);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
