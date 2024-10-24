import java.util.Scanner;
public class Lore {

    public static void introduccion(Scanner input, SuperHero selectedHero ) {
        
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
                    System.out.println("Despues de un rato de que "+selectedHero.nombre+" estubiera investigando por el sombrio bosque");
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
    }





    public static void primero(Scanner input, SuperHero selectedHero, Villano[] villano){
        //dialogo derrota villano
        System.out.println("-NOOOO, COMO ES POSIBLE QUE ME HALLAS DERROTADO-");
        System.out.println("-Habla de una ves donde se encuentra tu jefe");
        System.out.println("-JAJAJAJAJAJA, estas loco si crees que lo vas a derrotar, es mas te esta esperando en");
        System.out.println( "la montaña donde se libero el sello, pero para llegar a el tendras que derrotar a los demas y son-");
        System.out.println("mucho mas fuerte que tu-");
        System.out.println("-Eso lo veremos-");
        System.out.println("Despues de decir esto "+selectedHero.nombre+" Procede a acabar con la vida del villano");
        
        //confirma que la entrada sea valida
        while (true) {
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
        //segundo villano
        System.out.println("luego de prepararse correctamente "+selectedHero.nombre+" se dirige a la montaña donde alguna");
        System.out.println("vez estos villanos fueron pricioneros, no paso mucho tiemo desde que comenzo a explorar la montaña");
        System.out.println("que se encontro a "+villano[1].nombre+" este parecia una persona realmente normal y "+selectedHero.nombre);
        System.out.println("incluso llego a pensar que era un rehen, pero a penas se acerco a la persona a preguntarle si");
        System.out.println("estaba bien este se quito la tunica que lo cubria y dejo ver en su cuerpo grandes cantidades de hierro");
        
        //confirma que la entrada sea valida
        while (true) {
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

        //se pone tensa la historia
        System.out.println("-supe que derrotaste a "+villano[0].nombre+" nunca crei que duraria mucho");
        System.out.println("Lo que me sorprende es que muriera en manos de una persona tan debil como tu-");
        System.out.println(selectedHero.nombre+" se pone en pocision de ataque y le dice");
        System.out.println("-y a ti te espera el mismo destino-");

        while (true) {
        
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
    } 
    







    public static void segundo(Scanner input, SuperHero selectedHero, Villano[] villano){
        System.out.println("-JAJAAJJAJAJAJ, me has vencido felicidades, disfruta tu vistoria mientras puedas, porque de ");
        // System.out.println("ahora en adelante no te va a tocar tan facil-");
        System.out.println(selectedHero.nombre+" no le quedo otra alternativa mas que verlo morir. ");
        
        //confirma que la entrada sea valida
        while (true) {
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

        //caminando por la montaña
        System.out.println("despues de un rato explorando la montaña logro a lo lejos ver una fabrica en muy mal estado");
        System.out.println("la curiosidad le gano y decidio acercarce a esta fabrica presuntamente abandonada");
        System.out.println("al entrar en esta se dio cuenta que habian muchos restos de desperdicios toxicos por todos lados");
        System.out.println("ignorando este detallo decidio explorar la fabrica, esto sin excito ya que no logro encontrar nada util");
        System.out.println("pero saliendo de la fabrica se encontro un gran tanque con desperdicios toxicos ");
        System.out.println("del cual logro escuchar una voz ");
        System.out.println("-Llevo dias absorviendo las toxinas de este tanque con un unico objetivo, ser el mas poderoso");
        System.out.println("y sumir este mundo en desperdicios toxicos,¿un mundo perfecto no te parece?");
        System.out.println("pero para que mi sueño se haga realidad primero debo acabar contigo asi que preparate-");
                
        while (true) {
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
    }




    public static void tercero(Scanner input, SuperHero selectedHero, Villano[] villano){
        System.out.println("-Lograste vencerme, acabaste con la ilusion de mi mundo perfecto, espero que lo que intentes lograr no sea el camino equicado-");
            System.out.println(selectedHero.nombre+" sale del lugar despues de cuestionarse la razon por la cual quieren sumir el mundo en oscuridad");
            while (true) {
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
            
            //encuentro con dark
            System.out.println("llegando a la cima de la montaña, la oscuridad comenzo a ser cada ves mas grande y densa");
            System.out.println("hasta que llego un punto en el cual no podia ni ver sus manos");
            System.out.println("pero en esa oscuridad se logro escuchar una voz");
            System.out.println("-De aqui no pasaras al jefe no le gustan los intrusos-");
            System.out.println("despues de eso viste como el lugar se ilumino y lograste ver una mancha negra en el cielo");
            while (true) {
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
    }





    public static void cuarto(Scanner input, SuperHero selectedHero, Villano[] villano){
        System.out.println("\033[2J");
            System.out.println("-Espero que estes preparado, HAS DESPERTADO AL JEFE-");
            System.out.println("Escuchas un gran estruendo detras tullo, cuando te volteas ves a un lobo gigante con el poder del espacio en su mano");
            System.out.println("antes de que pueda reaccionar este te lleva a otra dimencion donde te encuetras flotando en el espacio con un monton de algoritmos");
            System.out.println("pero afortunadamente para ti logras descubir que puedes usar los algoritmos como plataformas para poder atacar a "+villano[4].nombre);
            while (true) {
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
    }




    public static void quinto(Scanner input, SuperHero selectedHero, Villano[] villano){

        System.out.println("-w:Es increible lo que has logrado, yo solo seguia la profesia");
            System.out.println("-W:aquel que me derrote tendra el poder del vacio");
            System.out.println("-w: ahora te pertenece-");
            System.out.println("-Tu: ¡¡Espera!! ¿cual es este poder que ahora me ah sido dado?");
            System.out.println("-W:No puedo decirtelo es tu deber buscar su potencial ahora,");
            System.out.println("-W:pero lo que si debes saber es que eres parte de esta profecía");
            System.out.println("-W:desde el momento en el que te incursaste en este camino y solo es el inicio...");
            System.out.println("-W:...de los cinco mejores o peores años de tu vida, que de ti depende que sean solo esa cantidad y no mas");
            System.out.println("-W: puede que nos encontremos mas adelante en el camino y ya no como contrincantes");
            System.out.println("-W: sino como amigos y compañeros");
            System.out.println("-W: HAPPY CODING (chasquea los dedos)");
            System.out.println("Luego de esto despertaste saliendo de la dimensión, pero recuerda");
            System.out.println("nada fue un sueño...y una nueva misión se encuentra en tus hombros...");
            System.out.println("¿estas dispuesto a continuar?");
            System.out.println("██╗    ██╗██╗███╗   ██╗███╗   ██╗███████╗██████╗ ");
            System.out.println("██║    ██║██║████╗  ██║████╗  ██║██╔════╝██╔══██╗");
            System.out.println("██║ █╗ ██║██║██╔██╗ ██║██╔██╗ ██║█████╗  ██████╔╝");
            System.out.println("██║███╗██║██║██║╚██╗██║██║╚██╗██║██╔══╝  ██╔══██╗");
            System.out.println("╚███╔███╔╝██║██║ ╚████║██║ ╚████║███████╗██║  ██║");
            System.out.println(" ╚══╝╚══╝ ╚═╝╚═╝  ╚═══╝╚═╝  ╚═══╝╚══════╝╚═╝  ╚═╝");

    }



}
