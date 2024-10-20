public class SuperHero {
    String nombre;
    int fuerza;
    int velocidad;
    int vida_hp;
    int ataque_principal;
    int ataque_secundario;
    int ataque_final;
    int overload;

    public SuperHero(
        String nombre,
        int fuerza,
        int velocidad,
        int vida_hp,
        int ataque_principal,
        int ataque_secundario,
        int ataque_final,
        int overload) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.vida_hp = vida_hp;
        this.ataque_principal = ataque_principal;
        this.ataque_secundario = ataque_secundario;
        this.ataque_final = ataque_final;
        this.overload = overload;
    }
}

