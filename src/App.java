import java.util.Scanner;

// Clase base del personaje
class Personaje {
    String nombre;
    int fuerza;
    int velocidad;
    int vida_hp;
    int ataque_principal;
    int ataque_secundario;
    int ataque_final;

    // Definir constructor
    public Personaje(
            String nombre,
            int fuerza,
            int velocidad,
            int vida_hp,
            int ataque_principal,
            int ataque_secundario,
            int ataque_final) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.vida_hp = vida_hp;
        this.ataque_principal=ataque_principal;
        this.ataque_secundario=ataque_secundario;
        this.ataque_final=ataque_final;
    }
}

class SuperHero extends Personaje {
    // definir el constructor
    public SuperHero(
            String nombre,
            int fuerza,
            int velocidad,
            int vida_hp,
            int ataque_principal,
            int ataque_secundario,
            int ataque_final){
            super(nombre, fuerza, velocidad, vida_hp, ataque_principal, ataque_secundario, ataque_final);
    }
}

class Villano extends Personaje {
    // definir el constructor
    public Villano(
            String nombre,
            int fuerza,
            int velocidad,
            int vida_hp,
            int ataque_principal,
            int ataque_secundario,
            int ataque_final){
            super(nombre, fuerza, velocidad, vida_hp, ataque_principal, ataque_secundario, ataque_final);
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
            System.out.print("\033[2J");
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
            int codeSeleccion;
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
                    SuperHero selectedHero = new SuperHero("SPEED FLASH", 70, 95, 60,28,42,70);
                    isSeleccion = false;
                }                          
                break;
                case 2:
                System.out.println("IRON HAMMER");
                System.out.println("-----------");
                System.out.println("ATRIBUTOS");
                System.out.println("");
                System.out.println("FUERZA: 90");
                System.out.println("VELOCIDAD: 50");
                System.out.println("VIDA: 80");
                System.out.println("Descripción: Iron hammer es un héroe fuerte y resistente. Su fuerza le permite causar grandes");
                System.out.println("daños, pero su velocidad es baja, lo que lo hace más vulnerable a ataques rápidos. Tiene una buena");
                System.out.println("cantidad de vida que le permite aguantar más tiempo en batalla.");
                System.out.println("-----------------------------------------------------------------------------------------");
                System.out.println("INGRESE EL CODIGO DE LA ACCION QUE DESEA REALIZAR");
                System.out.println("------------------------------------------------------------------------------------------");
                System.out.println("1. SELECCIONAR PERSONAJE");
                System.out.println("2. SELECCIONAR OTRO PERSONAJE"); 
                
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
                    SuperHero selectedHero = new SuperHero("IRON HAMMER", 70, 95, 60,36,54,90);
                    isSeleccion = false;
                }           
                    break;
                case 3:
                System.out.println("SILENT SHADOW");
                System.out.println("-----------");
                System.out.println("ATRIBUTOS");
                System.out.println("");
                System.out.println("FUERZA: 65");
                System.out.println("VELOCIDAD: 85");
                System.out.println("VIDA: 70");
                System.out.println("Descripción: Silent shadow es un maestro del sigilo y la agilidad. Tiene una velocidad superior que");
                System.out.println("le permite moverse rápidamente y atacar desde las sombras. Su fuerza es moderada, lo que le");
                System.out.println("permite hacer un daño decente, y tiene una cantidad razonable de vida para sobrevivir en combate.");
                System.out.println("-----------------------------------------------------------------------------------------");
                System.out.println("INGRESE EL CODIGO DE LA ACCION QUE DESEA REALIZAR");
                System.out.println("------------------------------------------------------------------------------------------");
                System.out.println("1. SELECCIONAR PERSONAJE");
                System.out.println("2. SELECCIONAR OTRO PERSONAJE"); 
                
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
                    SuperHero selectedHero = new SuperHero("SILENT SHADOW", 65, 85, 70,26,39,65);
                    isSeleccion = false;
                }                    
                    break;
                case 4:
                System.out.println("STONE COLOSSUS");
                System.out.println("-----------");
                System.out.println("ATRIBUTOS");
                System.out.println("");
                System.out.println("FUERZA: 95");
                System.out.println("VELOCIDAD: 40");
                System.out.println("VIDA: 100");
                System.out.println("Descripción: Stone colossus es un gigante imponente con una fuerza sobrehumana. Puede resistir");
                System.out.println("mucho daño gracias a su alta vida, pero su velocidad es muy baja. Esto significa que es un tanque en");
                System.out.println("el campo de batalla, ideal para absorber golpes y proteger a sus aliados.");
                System.out.println("-----------------------------------------------------------------------------------------");
                System.out.println("INGRESE EL CODIGO DE LA ACCION QUE DESEA REALIZAR");
                System.out.println("------------------------------------------------------------------------------------------");
                System.out.println("1. SELECCIONAR PERSONAJE");
                System.out.println("2. SELECCIONAR OTRO PERSONAJE"); 
                
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
                    SuperHero selectedHero= new SuperHero("STONE COLOSSUS", 95, 40, 100,38,57,95);
                    isSeleccion = false;
                }   
                    break;

                case 5:
                System.out.println("RADIANT FLASH");
                System.out.println("-----------");
                System.out.println("ATRIBUTOS");
                System.out.println("");
                System.out.println("FUERZA: 80");
                System.out.println("VELOCIDAD: 75");
                System.out.println("VIDA: 65");
                System.out.println("Descripción: Radiant flash combina un equilibrio entre fuerza y velocidad. Es capaz de infligir un");
                System.out.println("daño considerable mientras se mueve ágilmente por el campo de batalla. Su vida es moderada, lo");
                System.out.println("que le permite ser efectivo tanto en ataque como en defensa.");
                System.out.println("-----------------------------------------------------------------------------------------");
                System.out.println("INGRESE EL CODIGO DE LA ACCION QUE DESEA REALIZAR");
                System.out.println("------------------------------------------------------------------------------------------");
                System.out.println("1. SELECCIONAR PERSONAJE");
                System.out.println("2. SELECCIONAR OTRO PERSONAJE"); 
                
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
                    SuperHero selectedHero= new SuperHero("RADIANT FLASH", 80, 75, 65,32,48,80);
                    isSeleccion = false;
                }  
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
        input.close();
    }
}
