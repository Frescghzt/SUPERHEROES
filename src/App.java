//Juan José Zambrano Manzano - 192327
//Nicoll Sofia Arevalo Caballero - 192316


import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        //creamos un Scanner
        Scanner input = new Scanner(System.in);

        //creamos el random
        Random rand = new Random();

        //carga de poder 
        int thecharge ;

        //sanarse
        int sanacion ;

        //ataque villano
        int respuesta;

        //trampa villano
        boolean laTrampa;

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
        SuperHero selectedHero = null;
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

                    //confirmamos que la entrada sea valida
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
                        System.out.println("---------------");
                        System.out.println("ATAQUES");
                        System.out.println("");
                        System.out.println("Principal: \"Golpe Relámpago\" ");
                        System.out.println("Secundario: \"Torbellino Veloz\"");
                        System.out.println("Final: \"Explosión Sónica\"");
                        System.out.println("Descripción: SPEED FLASH es un héroe que se especializa en la velocidad. ");
                        System.out.println("Su agilidad le permite esquivar ataques y atacar rápidamente.");
                        System.out.println("Sin embargo, su fuerza es menor, lo que limita el daño que puede infligir en cada golpe.");
                        System.out.println("-----------------------------------------------------------------------------------------");
                        System.out.println("INGRESE EL CODIGO DE LA ACCION QUE DESEA REALIZAR");
                        System.out.println("------------------------------------------------------------------------------------------");
                        System.out.println("1. SELECCIONAR PERSONAJE");
                        System.out.println("2. SELECCIONAR OTRO PERSONAJE"); 
                        
                        //confirmamos que la entrada sea valida
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

                        //si es valida elige a speed flash
                        if (codeSeleccion == 1) {                    
                            selectedHero = new SuperHero("SPEED FLASH", 70, 95, 60,"Golpe Relámpago",28,"Torbellino Veloz",42,"Explosión Sónica",70,0);

                            //sale del bucle
                            isSeleccion = false;
                        }                          
                        break;

                        //descripcion iron hammer
                        case 2:
                        System.out.println("IRON HAMMER");
                        System.out.println("-----------");
                        System.out.println("ATRIBUTOS");
                        System.out.println("");
                        System.out.println("FUERZA: 90");
                        System.out.println("VELOCIDAD: 50");
                        System.out.println("VIDA: 80");
                        System.out.println("---------------");
                        System.out.println("ATAQUES");
                        System.out.println("Principal: \"Martillazo de Acero\"");
                        System.out.println("Secundario: \"Golpe Triturador\"");
                        System.out.println("Final: \"Impacto Colosal\"");
                        System.out.println("Descripción: Iron hammer es un héroe fuerte y resistente. Su fuerza le permite causar grandes");
                        System.out.println("daños, pero su velocidad es baja, lo que lo hace más vulnerable a ataques rápidos. Tiene una buena");
                        System.out.println("cantidad de vida que le permite aguantar más tiempo en batalla.");
                        System.out.println("-----------------------------------------------------------------------------------------");
                        System.out.println("INGRESE EL CODIGO DE LA ACCION QUE DESEA REALIZAR");
                        System.out.println("------------------------------------------------------------------------------------------");
                        System.out.println("1. SELECCIONAR PERSONAJE");
                        System.out.println("2. SELECCIONAR OTRO PERSONAJE"); 
                        
                        //confirma que la entrada sea valida
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
                        //si es valida elige si usar el personaje

                        if (codeSeleccion == 1) {                    
                            selectedHero = new SuperHero("IRON HAMMER", 90, 50, 80,"Martillazo de Acero",36,"Golpe Triturador",54,"Impacto Colosal",90,0);

                            //si usa el personaje sale del bucle
                            isSeleccion = false;
                        }           
                            break;

                            //descripcion silent shadow
                        case 3:
                        System.out.println("SILENT SHADOW");
                        System.out.println("-----------");
                        System.out.println("ATRIBUTOS");
                        System.out.println("");
                        System.out.println("FUERZA: 65");
                        System.out.println("VELOCIDAD: 85");
                        System.out.println("VIDA: 70");
                        System.out.println("---------------");
                        System.out.println("ATAQUES");
                        System.out.println("");
                        System.out.println("Principal: \"Corte Silencioso\"");
                        System.out.println("Secundario: \"Emboscada Mortal\"");
                        System.out.println("Final: \"Desgarro de las Sombras\"");
                        System.out.println("Descripción: Silent shadow es una maestra del sigilo y la agilidad. Tiene una velocidad superior que");
                        System.out.println("le permite moverse rápidamente y atacar desde las sombras. Su fuerza es moderada, lo que le");
                        System.out.println("permite hacer un daño decente, y tiene una cantidad razonable de vida para sobrevivir en combate.");
                        System.out.println("-----------------------------------------------------------------------------------------");
                        System.out.println("INGRESE EL CODIGO DE LA ACCION QUE DESEA REALIZAR");
                        System.out.println("------------------------------------------------------------------------------------------");
                        System.out.println("1. SELECCIONAR PERSONAJE");
                        System.out.println("2. SELECCIONAR OTRO PERSONAJE"); 
                        
                        //confirma que la entrada sea valida
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

                        //si es valida elige si usar el personaje
                        if (codeSeleccion == 1) {                    
                            selectedHero = new SuperHero("SILENT SHADOW", 65, 85, 70,"Corte Silencioso",26,"Emboscada Mortal",39,"Desgarro de las Sombras",65,0);

                            //si elige el personaje sale del bucle
                            isSeleccion = false;
                        }                    
                            break;

                            // descripcion stone colossus
                        case 4:
                        System.out.println("STONE COLOSSUS");
                        System.out.println("-----------");
                        System.out.println("ATRIBUTOS");
                        System.out.println("");
                        System.out.println("FUERZA: 95");
                        System.out.println("VELOCIDAD: 40");
                        System.out.println("VIDA: 100");
                        System.out.println("---------------");
                        System.out.println("ATAQUES");
                        System.out.println("");
                        System.out.println("Principal: \"Golpe de Roca\"");
                        System.out.println("Secundario: \"Terremoto\"");
                        System.out.println("Final: \"Avalancha Imparable\"");
                        System.out.println("Descripción: Stone colossus es un gigante imponente con una fuerza sobrehumana. Puede resistir");
                        System.out.println("mucho daño gracias a su alta vida, pero su velocidad es muy baja. Esto significa que es un tanque en");
                        System.out.println("el campo de batalla, ideal para absorber golpes y proteger a sus aliados.");
                        System.out.println("-----------------------------------------------------------------------------------------");
                        System.out.println("INGRESE EL CODIGO DE LA ACCION QUE DESEA REALIZAR");
                        System.out.println("------------------------------------------------------------------------------------------");
                        System.out.println("1. SELECCIONAR PERSONAJE");
                        System.out.println("2. SELECCIONAR OTRO PERSONAJE"); 
                        
                        //confirma que la entrada sea valida
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

                        //si es valida elige si usar el personaje
                        if (codeSeleccion == 1) {                    
                        selectedHero= new SuperHero("STONE COLOSSUS", 95, 40, 100,"Golpe de Roca",38,"Terremoto",57,"Avalancha Imparable",95,0);

                            //si usa el personaje sale del bucle
                            isSeleccion = false;
                        }   
                            break;

                        //descripcion radiant flash
                        case 5:
                        System.out.println("RADIANT FLASH");
                        System.out.println("-----------");
                        System.out.println("ATRIBUTOS");
                        System.out.println("");
                        System.out.println("FUERZA: 80");
                        System.out.println("VELOCIDAD: 75");
                        System.out.println("VIDA: 65");
                        System.out.println("---------------");
                        System.out.println("ATAQUES");
                        System.out.println("");
                        System.out.println("Principal: \"Rayo Luminoso\"");
                        System.out.println("Secundario: \"Destello Radiante\"");
                        System.out.println("Final: \"Explosión Solar\"");
                        System.out.println("Descripción: Radiant flash combina un equilibrio entre fuerza y velocidad. Es capaz de infligir un");
                        System.out.println("daño considerable mientras se mueve ágilmente por el campo de batalla. Su vida es moderada, lo");
                        System.out.println("que le permite ser efectivo tanto en ataque como en defensa.");
                        System.out.println("-----------------------------------------------------------------------------------------");
                        System.out.println("INGRESE EL CODIGO DE LA ACCION QUE DESEA REALIZAR");
                        System.out.println("------------------------------------------------------------------------------------------");
                        System.out.println("1. SELECCIONAR PERSONAJE");
                        System.out.println("2. SELECCIONAR OTRO PERSONAJE"); 

                        //confirma si la entrada es valida
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

                        //si es valida decide si usar el personage
                        if (codeSeleccion == 1) {                    
                        selectedHero= new SuperHero("RADIANT FLASH", 80, 75, 65,"Rayo Luminoso",32,"Destello Radiante",48,"Explosión Solar",80,0);

                            //si usa el personaje sale del bucle
                            isSeleccion = false;
                        }  
                            break;
                    }
                }

                //seccion reglas
                System.out.print("\033[2J");
                int codeConfirmacion = 0;
                boolean isReglas = true;
                while (isReglas) {                                            
                    while (true) {

                        //confirma si la entrada es valida
                        try{
                            System.out.println("como jugar:");
                            System.out.println("");
                            System.out.println("EL juego consiste en un combate por turnos, tu objetivo es vencer a todos los villanos");
                            System.out.println("El juego consta de 5 niveles tu objetivo final es vencer a Oblivion Lord");
                            System.out.println("Cada vez que sea tu turno podras elejir si atacar, cargar tu energia o recuperar vida");
                            System.out.println("Dependiendiendo la velocidad de tu personaje podra esquivar los ataques de los enemigos aleatoriamente");
                            System.out.println("Entre mas veloz tu personaje mas probabilidad tendra de esquivar los ataques");
                            System.out.println("Los villanos son tramposos de ves en cuando robaran tu turno");
                            System.out.println("---------------------------------------------------------------------------------------------------------");
                            System.out.println("Ingrese el codigo de lo que desea realizar");
                            System.out.println("");
                            System.out.println("1.A JUGAR");
                            System.out.println("");
                            System.out.println("2.No entendi las reglas");  
                        
                            codeConfirmacion= Integer.parseInt(input.nextLine()); 
                            if (codeConfirmacion < 1 || codeConfirmacion >2) {
                                System.out.println("");
                                System.out.println("DEBE INGRESAR UN CODIGO VALIDO");
                            }else{
                                break;
                            }
                        }  catch(NumberFormatException error){
                            System.out.println("");
                            System.out.println("DEBE INGRESAR UN CODIGO VALIDO");
                        }   
                    } 

                    //si es valida decide si jugar o volverlas a leer
                    while (true) {
                        if (codeConfirmacion == 1) {

                            //sale del while principal
                            isReglas = false;
                            break;                            
                        }else{

                            //pues vuelvelas a leer xd
                            System.out.println("");
                            System.out.println("Pues vuelvelas a leer xd");
                            System.out.println("");
                            break;
                        }   
                        
                    }                          
                }
                System.out.println("\033[2J");
                
                //creamos llos villanos

                //Shadow crawler
                Villano shadowCrawler = new Villano("SHADOW CRAWLER", 50, 70, 60,"Golpe de Sombra", 20,"Ataque Oscuro", 30,"Emboscada Nocturna", 50, 0);
                
                //Iron Fist
                Villano ironFist = new Villano("IRON FIST", 65, 60, 80,"Puño de Hierro", 26,"Impacto Aplastante", 39,"Golpe Destructor", 65, 0);
                
                //Toxic Viper
                Villano toxicViper = new Villano("TOXIC VIPER", 75, 55, 100,"Mordida Tóxica", 30,"Chorro Venenoso", 45,"Nube Letal", 75, 0);
                
                //Dark Sorcerer
                Villano darkSorcerer = new Villano("DARK SORCERER", 85, 50, 120,"Bola de Fuego Oscura", 34,"Rayo Maligno", 51,"Invocación de la Oscuridad", 85, 0);
                
                //Oblivion Lord (Jefe Final)
                Villano oblivionLord = new Villano("OBLIVION LORD", 100, 45, 150,"Garra del Vacío", 40,"Onda de Caos", 60,"Apocalipsis Oscuro", 100, 0);
                
                //definimos la carga de los poderes
                charge carga = new charge(0, 30, 60);

                //definimos la capacidad de esquivar de el heroe
                boolean isHeroEsquiva;
                
                //definimos la capacidad de esquivar de shadow
                boolean isShadowEsquiva;
                
                //definimos la capacidad de esquivar de iron fist
                boolean isIronEsquiva ;

                //definimos la capacidad de esquivar de toxic viper
                boolean isToxicEsquiva ;

                //definimos la capacidad de esquivar de dark socerer
                boolean isDarkEsquiva ;

                //definimos la capacidad de esquivar de oblivion lord
                boolean isOblivionEsquiva ; 

                

                //lore
                while (true) {
                    System.out.println("Un antiguo mal ha despertado y la oscuridad comienza a extenderse por el mundo. Los villanos más");
                    System.out.println("peligrosos han escapado de sus prisiones y ahora amenazan con sumir al planeta en el caos. Solo un");
                    System.out.println("grupo de héroes con habilidades extraordinarias puede detenerlos y restaurar la paz.");
                    
                    //confirma que la entrada sea valida
                    try{
                        System.out.println("");
                        System.out.println("ingrese 1 para continuar");
                        int continuar = Integer.parseInt(input.nextLine());
                        if (continuar == 1) {
                            break;
                        }else{
                            System.out.println("codigo no valido");
                        }
                    }catch (NumberFormatException error){
                        System.out.println("");
                        System.out.println("codigo no valido");
                    }
                    
                }
                System.out.println("\033[2J");
                //encuentro con el primer villano
                while (true) {
                    System.out.println("Despues de muchos dias investigando lograron encontrar la guarida del oscuro Shadow Crawler");
                    System.out.println("un ser que segun la historia tiene el poder de controlar las sombras y sembrar terror a traves de ellas");
                    System.out.println("este se encontraba en un bosque sombrio y puede hacechar desde la oscuridad aprovechandoce de esta y haciendose mas fuerte.");
                    System.out.println("Despues de un rato de que "+selectedHero.Snombre+" estubiera investigando por el sombrio bosque");
                    System.out.println("escuchan muy cerca de ellos un");
                    System.out.println("-no se si eres muy valiente o muy estupido por atreverte a desafiarme, ese pecado solo hara que seas");
                    System.out.println("consumido por mis sombras-");
                    System.out.println("");
                    //confirma que la entrada sea valida
                    try{
                        System.out.println("");
                        System.out.println("ingrese 1 para continuar");
                        int continuar = Integer.parseInt(input.nextLine());
                        if (continuar == 1) {
                            break;
                        }else{
                            System.out.println("codigo no valido");
                        }
                    }catch (NumberFormatException error){
                        System.out.println("");
                        System.out.println("codigo no valido");
                    }
                    
                }
                System.out.println("\033[2J");

                //batalla shadow
                System.out.println("has iniciado una batalla con Shadow crawler");
                int codeAccion;
                boolean batalla = true;
                int codeAtaque = 0;
                //gameover
                boolean gameOver = false;
                
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
                    isHeroEsquiva = esquiva.isEsquivar(rand, selectedHero.Svelocidad);

                    //definimos la capacidad de esquivar de shadow
                    isShadowEsquiva = esquiva.isEsquivar(rand, shadowCrawler.velocidad);
                    
                    //definimos la carga del poder
                    thecharge= charge.carga(rand, 40);

                    //definimos la recuperacion de vida
                    sanacion = sanar.heal(rand, 40);
                    
                    //definimos el ataque
                    respuesta =atack.respuesta(rand,10);

                    //contador para que no robe mas de un turno
                    int contador = 0;


                    //dependiendo de la eleccion decide que accion tomar                    
                    switch (codeAccion) {
                        //atacar
                        case 1:

                        //menu de ataque
                            System.out.println("Que ataque decea usar");
                            System.out.println("1. "+selectedHero.SnombrePrincipal+" es necesario una carga de "+carga.chargePrincipal);
                            System.out.println("2. "+selectedHero.SnombreSecundario+" es necesario una carga de "+carga.chargeSecundario);
                            System.out.println("3. "+selectedHero.SnombreFinal+" es necesario una carga de "+carga.chargeFinal);
                            System.out.println("Recuerda que si eliges un poder y no tienes la carga necesaria pierdes turno");
                            System.out.println("Su carga es de "+selectedHero.Soverload);

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
                                if (selectedHero.Soverload >= carga.chargePrincipal) {
                                    if (isShadowEsquiva == true) {
                                        System.out.println("");
                                        System.out.println(shadowCrawler.nombre+" logro esquivar el golpe ");
                                    }else{
                                        System.out.println("");
                                        System.out.println(shadowCrawler.nombre+" recibio el golpe");
                                        shadowCrawler.vida_hp-=selectedHero.Sataque_principal;
                                    }
                                }else{
                                    System.out.println("");
                                    System.out.println("Carga insuficiente, pierdes turno");
                                }
                                break;
                            
                            // Ataque secundario
                            case 2:
                            if (selectedHero.Soverload >= carga.chargeSecundario) {
                                if (isShadowEsquiva == true) {
                                    System.out.println("");
                                    System.out.println(shadowCrawler.nombre+" logro esquivar el golpe ");
                                }else{
                                    System.out.println("");
                                    System.out.println(shadowCrawler.nombre+" recibio el golpe");
                                    shadowCrawler.vida_hp-=selectedHero.Sataque_secundario;
                                }
                            }else{
                                System.out.println("");
                                System.out.println("Carga insuficiente, pierdes turno");
                            }
                            break;


                            //Ataque final
                            case 3:
                                if (selectedHero.Soverload >= carga.chargeFinal) {
                                    if (isShadowEsquiva == true) {
                                        System.out.println("");
                                        System.out.println(shadowCrawler.nombre+" logro esquivar el golpe ");
                                    }else{
                                        System.out.println("");
                                        System.out.println(shadowCrawler.nombre+" recibio el golpe");
                                        shadowCrawler.vida_hp-=selectedHero.Sataque_final;
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
                            selectedHero.Soverload += thecharge; 
                            System.out.println("");  
                            System.out.println("Ahora la carga es de "+selectedHero.Soverload);                         
                            break;
                        //recuperarse 
                        case 3:
                            selectedHero.Svida_hp += sanacion;
                            System.out.println("");
                            System.out.println("Ahora la vida es de "+selectedHero.Svida_hp);
                            break;
                    }
                    System.out.println("Ahora es turno de que "+shadowCrawler.nombre+" ataque");
                    do {
                        //segun el numero aleatrio deside el ataque
                        if (respuesta <= 2) {
                            System.out.println(shadowCrawler.nombre+" lanza su ataque final: "+shadowCrawler.nombreFinal);
                            if (isHeroEsquiva == true) {
                                System.out.println("");
                                System.out.println(selectedHero.Snombre+" logro esquivar el golpe ");
                            }else{
                                System.out.println("");
                                System.out.println(selectedHero.Snombre+" recibio el golpe");
                                selectedHero.Svida_hp-=shadowCrawler.ataque_final;
                            }
                        }else if (respuesta > 2 && respuesta <= 5 ) {
                            System.out.println(shadowCrawler.nombre+" lanza "+shadowCrawler.nombreSecundario);
                            if (isHeroEsquiva == true) {
                                System.out.println("");
                                System.out.println(selectedHero.Snombre+" logro esquivar el golpe ");
                            }else{
                                System.out.println("");
                                System.out.println(selectedHero.Snombre+" recibio el golpe");
                                selectedHero.Svida_hp-=shadowCrawler.ataque_secundario;
                            }
                        }else{
                            System.out.println(shadowCrawler.nombre+" lanza "+shadowCrawler.nombrePrincipal);
                            if (isHeroEsquiva == true) {
                                System.out.println("");
                                System.out.println(selectedHero.Snombre+" logro esquivar el golpe ");
                            }else{
                                System.out.println("");
                                System.out.println(selectedHero.Snombre+" recibio el golpe");
                                selectedHero.Svida_hp-=shadowCrawler.ataque_principal;
                            }
                        }
                        
                        //la trampa verdadero
                        laTrampa = true; 
                        if (laTrampa == true) {
                            contador++;
                        }
                        //definimos la trampa 
                        laTrampa = trampa.isTrampa(rand);
                        
                            
                        
                        if (contador>1) {
                            laTrampa = false;
                        }
                        if (laTrampa == true) {
                            System.out.println(shadowCrawler.nombre+" te ha robado tu turno");
                        }
                        System.out.println("Estadisticas del heroe:");
                        System.out.println("vida: "+selectedHero.Svida_hp+" carga: "+selectedHero.Soverload);
                        System.out.println("");
                        System.out.println("Estadisticas del villano");
                        System.out.println("vida: "+shadowCrawler.vida_hp);
                        System.out.println("");
                        
                    } while (laTrampa);
                    if (shadowCrawler.vida_hp <= 0) {
                        System.out.println("has ganado");
                        batalla = false;
                    }else if (selectedHero.Svida_hp <=0) {
                        System.out.println("Has perdido");
                        gameOver = true;
                        batalla = false;}
                        
                    
                }
                if(gameOver == true){
                    break;
                }

                break;
            //configuracion
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
