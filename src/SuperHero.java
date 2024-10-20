public class SuperHero {
    String nombre;
    int fuerza;
    int velocidad;
    int vida_hp;
    String nombrePrincipal;
    int ataque_principal;
    String nombreSecundario;
    int ataque_secundario;
    String nombreFinal;
    int ataque_final;
    int overload;

    public SuperHero(
        String nombre,
        int fuerza,
        int velocidad,
        int vida_hp,
        String nombrePrincipal,
        int ataque_principal,
        String nombreSecundario,
        int ataque_secundario,
        String nombreFinal,
        int ataque_final,
        int overload) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.vida_hp = vida_hp;
        this.nombrePrincipal = nombrePrincipal;
        this.ataque_principal = ataque_principal;
        this.nombreSecundario = nombreSecundario;
        this.ataque_secundario = ataque_secundario;
        this.nombreFinal = nombreFinal;
        this.ataque_final = ataque_final;
        this.overload = overload;
    }
}

