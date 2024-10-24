import java.util.Scanner;;

public class SeleccionPersonaje {

    public static SuperHero SeleccionHeroe(Scanner input){

         //creamos una variable para el while
         Boolean isSeleccion = true;
        int codeSeleccion = 0;
        SuperHero selectedHero = null;
        int codePersonajes = 0;
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
                System.out.println("");
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
                    return selectedHero;
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
                System.out.println("");
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
                    return selectedHero;
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
                System.out.println("");
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
                    return selectedHero;
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
                System.out.println("");
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
                    return selectedHero;
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
                System.out.println("");
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
                    return selectedHero;
                }  
                    break;
            }
        }
        return selectedHero;
    }
   

}

