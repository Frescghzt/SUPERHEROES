//Juan José Zambrano Manzano - 192327
//Nicoll Sofia Arevalo Caballero - 192316

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //generamos el input
        Scanner input = new Scanner(System.in);

        //generamos el random
        Random rand = new Random();

        //arreglo para almacenar los villanos
        Villano[] villano = new Villano[5];

        //llenamos el arreglo 
        //Shadow crawler
        villano[0] = new Villano("SHADOW CRAWLER", 15, 40, 60,"Golpe de Sombra", 6,"Ataque Oscuro", 9,"Emboscada Nocturna", 15, 0);
                
        //Iron Fist
        villano[1]  = new Villano("IRON FIST", 20, 30, 80,"Puño de Hierro", 8,"Impacto Aplastante", 12,"Golpe Destructor", 20, 0);
        
        //Toxic Viper
        villano[2] = new Villano("TOXIC VIPER", 25, 35, 120,"Mordida Tóxica", 10,"Chorro Venenoso", 15,"Nube Letal", 25, 0);
        
        //Dark Sorcerer
        villano[3] = new Villano("DARK SORCERER", 30, 40, 140,"Bola de Fuego Oscura", 12,"Rayo Maligno", 18,"Invocación de la Oscuridad", 30, 0);
        
        //wolf yissus (Jefe Final)
        villano[4] = new Villano("WOLF YISSUS", 35, 50, 180,"Java Nullwave", 14,"Python's Blackhole Comprehension", 21,"Voidscript Overload", 35, 0);

        //bienvenida al programa
        System.out.print("\033[2J");
        System.out.println("\u001B[34m"+"--------------------------------------------------------------------------------");
        System.out.println("\u001B[34m"+"███████╗██████╗ ███████╗ ██████╗██╗ █████╗ ██╗      ██╗  ██╗███████╗██████╗  ██████╗");
        System.out.println("\u001B[34m"+"██╔════╝██╔══██╗██╔════╝██╔════╝██║██╔══██╗██║      ██║  ██║██╔════╝██╔══██╗██╔═══██╗");
        System.out.println("\u001B[34m"+"███████╗██████╔╝█████╗  ██║     ██║███████║██║█████╗███████║█████╗  ██████╔╝██║   ██║");
        System.out.println("\u001B[34m"+"╚════██║██╔═══╝ ██╔══╝  ██║     ██║██╔══██║██║╚════╝██╔══██║██╔══╝  ██╔══██╗██║   ██║");
        System.out.println("\u001B[34m"+"███████║██║     ███████╗╚██████╗██║██║  ██║███████╗ ██║  ██║███████╗██║  ██║╚██████╔╝");
        System.out.println("\u001B[34m"+"╚══════╝╚═╝     ╚══════╝ ╚═════╝╚═╝╚═╝  ╚═╝╚══════╝ ╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝ ╚═════╝ ");
        System.out.println("\u001B[34m"+"--------------------------------------------------------------------------------");//al usuario se le da las opciones
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

        

        //seleccionamos el caso

        switch (code) {

            //jugar
            case 1:
            SuperHero selectedHero =  SeleccionPersonaje.SeleccionHeroe(input); 
            Reglas.reglas(input);
            
            //definimos la carga 
            Charge carga = new Charge(0, 30, 60);
            
            //esquivar
            boolean isHeroEsquiva , isVillanoEsquiva ;

            //carga, sancion y respuesta
            int theCharge, sanacion, respuesta;

            //llamamos la introduccion de la historia
            Lore.introduccion(input, selectedHero);

            //batallas
            int codeAccion;
            boolean batalla = true;
            int codeAtaque;
            boolean isTrampa;
            int vidaInicial = selectedHero.vida_hp;
                
            //gameover
            boolean gameOver = false;

            //contador dialogo
            int codeDialogo = -1;
            for(int i = 0 ; i <5 ; i++){
                if (gameOver == true) {
                    break;
                }else{
                    batalla = true;
                    codeDialogo++;
                }
                selectedHero.vida_hp = vidaInicial;
                
                
                //dialogo personaje al morir
                switch (codeDialogo) {
                    case 1:
                        Lore.primero(input,selectedHero,villano);
                        break;
                    case 2:
                        Lore.segundo(input, selectedHero, villano);
                        break;
                    case 3:
                        Lore.tercero(input, selectedHero, villano);
                        break;
                    case 4:
                        Lore.cuarto(input,selectedHero,villano);
                        break;
                
                    default:
                        break;
                }
                System.out.println("has iniciado una batalla con "+villano[i].nombre);
                //se va a repetir la batalla hasta que alguno de los dos muera
                while (batalla) {

                    //menu de batalla
                    System.out.println("¿Que deceas hacer?");
                    System.out.println("1. Atacar");
                    System.out.println("2. Cargar Energia");
                    System.out.println("3. Recuperarse");

                    //confirma que la entrada es valida
                    while (true) {
                        try{
                            System.out.println("Ingrese el codigo de la accion que decea realizar");
                            codeAccion = Integer.parseInt(input.nextLine());
                            if (codeAccion < 1 || codeAccion > 3) {
                                System.out.println("codigo invalido");                            
                            }else{
                                break;
                            }
                        }catch(NumberFormatException error){
                            System.out.println("codigo invalido");
                        }
                    }
                    //definimos la capacidad de  esquivar del heroe 
                    isHeroEsquiva = Esquiva.isEsquivar(rand, selectedHero.velocidad);

                    //definimos la capacidad de esquivar de shadow
                    isVillanoEsquiva = Esquiva.isEsquivar(rand, villano[i].velocidad);
                    
                    //definimos la carga del poder
                    theCharge= Charge.carga(rand, 10);

                    //definimos la recuperacion de vida
                    sanacion = Sanar.heal(rand, 15);
                    
                    //definimos el ataque
                    respuesta =Attack.respuesta(rand,20);

                    //contador para que no robe mas de un turno
                    int contador = 0;


                    //dependiendo de la eleccion decide que accion tomar                    
                    switch (codeAccion) {
                        //atacar
                        case 1:

                        //menu de ataque
                            System.out.println("Que ataque decea usar");
                            System.out.println("1. "+selectedHero.nombrePrincipal+" es necesario una carga de "+carga.chargePrincipal);
                            System.out.println("2. "+selectedHero.nombreSecundario+" es necesario una carga de "+carga.chargeSecundario);
                            System.out.println("3. "+selectedHero.nombreFinal+" es necesario una carga de "+carga.chargeFinal);
                            System.out.println("Recuerda que si eliges un poder y no tienes la carga necesaria pierdes turno");
                            System.out.println("Su carga es de "+selectedHero.overload);

                            //confirma que la entrada sea valida
                        while (true) {  
                            try{
                                System.out.println("");
                                System.out.println("Ingrese el codigo de la accion que desea realizar");
                                codeAtaque = Integer.parseInt(input.nextLine());
                                if (codeAtaque < 1 || codeAtaque > 3) {
                                    System.out.println("Ingrese un codigo valido");
                                }else{
                                    break;
                                }                           
                            }catch(NumberFormatException error){
                                System.out.println("");
                                System.out.println("ingrese un codigo valido");
                            }
                        }
                        switch (codeAtaque) {
                            
                            //Ataque principal
                            case 1:
                                if (selectedHero.overload >= carga.chargePrincipal) {
                                    if (isVillanoEsquiva == true) {
                                        System.out.println("");
                                        System.out.println(villano[i].nombre+" logro esquivar el golpe ");
                                    }else{
                                        System.out.println("");
                                        System.out.println(villano[i].nombre+" recibio el golpe");
                                        villano[i].vida_hp-=selectedHero.ataque_principal;
                                        selectedHero.overload-=carga.chargePrincipal;
                                    }
                                }else{
                                    System.out.println("");
                                    System.out.println("Carga insuficiente, pierdes turno");
                                }
                                break;
                            
                            // Ataque secundario
                            case 2:
                            if (selectedHero.overload >= carga.chargeSecundario) {
                                if (isVillanoEsquiva == true) {
                                    System.out.println("");
                                    System.out.println(villano[i].nombre+" logro esquivar el golpe ");
                                }else{
                                    System.out.println("");
                                    System.out.println(villano[i].nombre+" recibio el golpe");
                                    villano[i].vida_hp-=selectedHero.ataque_secundario;
                                    selectedHero.overload-=carga.chargeSecundario;
                                }
                            }else{
                                System.out.println("");
                                System.out.println("Carga insuficiente, pierdes turno");
                            }
                            break;


                            //Ataque final
                            case 3:
                                if (selectedHero.overload >= carga.chargeFinal) {
                                    if (isVillanoEsquiva == true) {
                                        System.out.println("");
                                        System.out.println(villano[i].nombre+" logro esquivar el golpe ");
                                    }else{
                                        System.out.println("");
                                        System.out.println(villano[i].nombre+" recibio el golpe");
                                        villano[i].vida_hp-=selectedHero.ataque_final;
                                        selectedHero.overload-=carga.chargeFinal;
                                    }
                                }else{
                                    System.out.println("");
                                    System.out.println("Carga insuficiente, pierdes turno");
                                }
                            break;
                        }
                        break;
                        //cargar energia    
                        case 2:
                            selectedHero.overload += theCharge; 
                            System.out.println("");  
                            System.out.println("Ahora la carga es de "+selectedHero.overload); 
                            System.out.println("");                        
                            break;
                        //recuperarse 
                        case 3:
                            selectedHero.vida_hp += sanacion;
                            System.out.println("");
                            System.out.println("Ahora la vida es de "+selectedHero.vida_hp);
                            break;
                    }
                    
                    
                    do {
                        if (villano[i].vida_hp <= 0) {
                            System.out.println("has ganado");
                            batalla = false;
                            break;
                        }else if (selectedHero.vida_hp <=0) {
                            System.out.println("Has perdido");
                            gameOver = true;
                            batalla = false;
                            break;
                        }
                        System.out.println("");
                        System.out.println("Ahora es turno de que "+villano[i].nombre+" ataque");
                        System.out.println("");
                        //segun el numero aleatrio deside el ataque
                        if (respuesta <= 10) {
                            System.out.println(villano[i].nombre+" lanza su ataque : "+villano[i].nombrePrincipal);
                            if (isHeroEsquiva == true) {
                                System.out.println("");
                                System.out.println(selectedHero.nombre+" logro esquivar el golpe ");
                            }else{
                                System.out.println("");
                                System.out.println(selectedHero.nombre+" recibio el golpe");
                                selectedHero.vida_hp-=villano[i].ataque_principal;
                            }
                        }else if (respuesta > 10 && respuesta <= 17 ) {
                            System.out.println(villano[i].nombre+" lanza "+villano[i].nombreSecundario);
                            if (isHeroEsquiva == true) {
                                System.out.println("");
                                System.out.println(selectedHero.nombre+" logro esquivar el golpe ");
                            }else{
                                System.out.println("");
                                System.out.println(selectedHero.nombre+" recibio el golpe");
                                selectedHero.vida_hp-=villano[i].ataque_secundario;
                            }
                        }else{
                            System.out.println(villano[i].nombre+" lanza su ataque final"+villano[i].nombreFinal);
                            if (isHeroEsquiva == true) {
                                System.out.println("");
                                System.out.println(selectedHero.nombre+" logro esquivar el golpe ");
                            }else{
                                System.out.println("");
                                System.out.println(selectedHero.nombre+" recibio el golpe");
                                selectedHero.vida_hp-=villano[i].ataque_final;
                            }
                        }
                        
                        //la trampa verdadero
                        isTrampa = true; 
                        if (isTrampa == true) {
                            contador++;
                        }
                        //definimos la trampa 
                        isTrampa = Trampa.isTrampa(rand);
                        
                            
                        
                        if (contador>1) {
                            isTrampa = false;
                        }
                        if (isTrampa == true) {
                            System.out.println("");
                            System.out.println(villano[i].nombre+" te ha robado tu turno");
                            System.out.println("");
                        }
                        System.out.println("Estadisticas del heroe:");
                        System.out.println("vida: "+selectedHero.vida_hp+" carga: "+selectedHero.overload);
                        System.out.println("");
                        System.out.println("Estadisticas del villano");
                        System.out.println("vida: "+villano[i].vida_hp);
                        System.out.println("");
                        
                    } while (isTrampa);
                    if (villano[i].vida_hp <= 0) {
                        System.out.println("has ganado");
                        batalla = false;
                    }else if (selectedHero.vida_hp <=0) {
                        System.out.println("Has perdido");
                        gameOver = true;
                        batalla = false;
                    }
                        
                    
                }
                if(gameOver == true){
                    break;
                    
                }

            }

            if (gameOver == false) {
                Lore.quinto(input, selectedHero, villano);
            }
                break;
            
            // configuracion
            case 2:
                System.out.println("easter egg");
                System.out.println("https://www.youtube.com/watch?v=dQw4w9WgXcQ");    
                break;

            //salir
            case 3:
                System.out.println("Gracias por jugar");  
                break;
        }

        input.close();
        
            
    }
    
}
