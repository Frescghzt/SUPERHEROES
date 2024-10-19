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
// Método para obtener el nombre


public class App {
    public static void main(String[] args) throws Exception {
        //creamos un Scanner
        Scanner input = new Scanner(System.in);
        //bienvenida al programa
        System.out.print("\033[2J");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("███████╗██╗   ██╗██████╗ ███████╗██████╗       ██╗  ██╗███████╗██████╗  ██████╗");
        System.out.println("██╔════╝██║   ██║██╔══██╗██╔════╝██╔══██╗      ██║  ██║██╔════╝██╔══██╗██╔═══██╗");
        System.out.println("███████╗██║   ██║██████╔╝█████╗  ██████╔╝█████╗███████║█████╗  ██████╔╝██║   ██║");
        System.out.println("╚════██║██║   ██║██╔═══╝ ██╔══╝  ██╔══██╗╚════╝██╔══██║██╔══╝  ██╔══██╗██║   ██║");
        System.out.println("███████║╚██████╔╝██║     ███████╗██║  ██║      ██║  ██║███████╗██║  ██║╚██████╔╝");
        System.out.println("╚══════╝ ╚═════╝ ╚═╝     ╚══════╝╚═╝  ╚═╝      ╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝ ╚═════╝ ");
        System.out.println("--------------------------------------------------------------------------------");//al usuario se le da las opciones
        System.out.println("");
        System.out.println("                                    1 JUGAR");
        System.out.println("");
        System.out.println("                               2 CONFIGURACION");
        System.out.println("");
        System.out.println("                                    3 SALIR");
        
        int code;
        //entrara en un bucle para que el codigo que ingrese sea valido
        while (true) {
            //colocamos un try-catch por si el usuario ingresa un dato no valido
            try{
                System.out.println("");
                System.out.println("             INGRESE EL CODIGO DE LA ACCION QUE DESEA REALIZAR");
                System.out.println("");
                code = Integer.parseInt(input.nextLine());
                if (code < 1 || code > 3) {//si ingresa un entero no valido le pedira que ingrese otro
                    System.out.println("");
                    System.out.println("DEBE INGRESAR UN CODIGO VALIDO");
                }else{//si ingresa un numero valido sale del bucle
                    break;
                }
            }catch (NumberFormatException error){//si ingresa un dato no valido le pedira que lo ingrese de nuevo
                System.out.println("");
                System.out.println("DEBE INGRESAR UN CODIGO VALIDO");
            }
            
        }
        System.out.print("\033[2J");
        //seleccionar el caso
        switch (code) {
            //jugar
            case 1:
            //creamos una variable apra el while
        Boolean isSeleccion = true;
        while (isSeleccion) {
            //menu de personajes
            System.out.println("");
            System.out.println("INGRESE EL CODIGO DEL PERSONAJE QUE DESEA VER LAS CARACTERISTICAS");
            System.out.println("1. SPEED FLASH");
            System.out.println("2. IRON HAMMER");
            System.out.println("3. SILENT SHADOW");
            System.out.println("4. STONE COLOSSUS");
            System.out.println("5. RADIANT FLASH");
            int codePersonajes;
            while (true) {
                try{
                    codePersonajes = Integer.parseInt(input.nextLine());
                    if (codePersonajes < 1 || codePersonajes > 5) {//si ingresa un entero no valido le pedira que ingrese otro
                        System.out.println("");
                        System.out.println("DEBE INGRESAR UN CODIGO VALIDO");
                    }else{//si ingresa un numero valido sale del bucle
                        break;
                    }
                }catch (NumberFormatException error){//si ingresa un dato no valido le pedira que lo ingrese de nuevo
                    System.out.println("");
                    System.out.println("DEBE INGRESAR UN CODIGO VALIDO");
                }
            }
            System.out.print("\033[2J");
            //descripcion
            switch (codePersonajes) {
                //descrpcion speed flash
                case 1:
                System.out.println("SPEED FLASH");
                System.out.println("-----------");
                System.out.println("ATRIBUTOS");
                System.out.println("");
                System.out.println("FUERZA: 70");
                System.out.println("VELOCIDAD: 95");
                System.out.println("VIDA: 60");
                System.out.println("Descripción: SPEED FLASH es un héroe que se especializa en la velocidad. ");
                System.out.println("Su agilidad le permite esquivar ataques y atacar rápidamente.");
                System.out.println("Sin embargo, su fuerza es menor, lo que limita el daño que puede infligir en cada golpe.");
                System.out.println("-----------------------------------------------------------------------------------------");
                System.out.println("INGRESE EL CODIGO DE LA ACCION QUE DESEA REALIZAR");
                System.out.println("------------------------------------------------------------------------------------------");
                System.out.println("1. SELECCIONAR PERSONAJE");
                System.out.println("2. SELECCIONAR OTRO PERSONAJE"); 
                int codeSeleccion;
                while (true) {
                    try {
                        codeSeleccion = Integer.parseInt(input.nextLine());
                        if (codeSeleccion < 1 || codeSeleccion >2) {
                            System.out.println("");
                            System.out.println("DEBE INGRESAR UN CODIGO VALIDO");
                        }else{
                            break;
                        }
    
                    } catch (NumberFormatException error) {
                        System.out.println("");
                        System.out.println("DEBE INGRESAR UN CODIGO VALIDO");                        
                    }                   
                }
                if (codeSeleccion == 1) {                    
                    SuperHero speedFlash = new SuperHero("SPEED FLASH", 70, 95, 60);
                } else{
                    isSeleccion = false;
                }           
                break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
            }
        }
                
                break;
            //configuracion
            case 2:
                
                break;
            //salir
            case 3:
                
                break;
        }
    }
}
