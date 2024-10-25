import java.util.Scanner;

public class Lore {

    public static void cargando(){
        System.out.print("\u001B[34m"+"Cargando");
        String[] cargando = {
            
            "..."

    };
        try{
            for (String linea : cargando) {
                if (linea.isEmpty()) {
                    System.out.println();
                    Thread.sleep(1000);
                    continue;
                }

                for (char c : linea.toCharArray()) {
                    System.out.print(c);
                    Thread.sleep(500); // Ajusta este valor para cambiar la velocidad de escritura
                }
                System.out.println();
                Thread.sleep(200); // Pausa entre líneas
            }
        }catch(InterruptedException error){
            error.printStackTrace();
        }
        
    }

    public static void introduccion(Scanner input, SuperHero selectedHero ) {
        System.out.println("\033[2J");
        //primera parte dialogo
        String[] primeraParte ={"Un antiguo mal ha despertado y la oscuridad comienza a extenderse por el mundo. Los villanos más","peligrosos han escapado de sus prisiones y ahora amenazan con sumir al planeta en el caos. Solo un","grupo de héroes con habilidades extraordinarias puede detenerlos y restaurar la paz."};

        //segunda parte dialogo
        String[] segundaParte={"Despues de muchos dias investigando lograron encontrar la guarida del oscuro Shadow Crawler","un ser que segun la historia tiene el poder de controlar las sombras y sembrar terror a traves de ellas","este se encontraba en un bosque sombrio y puede hacechar desde la oscuridad aprovechandoce de esta y haciendose mas fuerte.","Despues de un rato de que "+selectedHero.nombre+" estubiera investigando por el sombrio bosque","escuchan muy cerca de ellos un","\u001B[31m"+"-no se si eres muy valiente o muy estupido por atreverte a desafiarme, ese pecado solo hara que seas","consumido por mis sombras-"+"\u001B[0m"

        };

       
        
                //lore
                while (true) {
                
                    // Mostrar cada línea de la historia con efecto de máquina de escribir
                    try{
                        for (String linea : primeraParte) {
                            if (linea.isEmpty()) {
                                System.out.println();
                                Thread.sleep(500);
                                continue;
                            }
            
                            for (char c : linea.toCharArray()) {
                                System.out.print(c);
                                Thread.sleep(30); // Ajusta este valor para cambiar la velocidad de escritura
                            }
                            System.out.println();
                            Thread.sleep(200); // Pausa entre líneas
                        }
                    }catch(InterruptedException error){
                        error.printStackTrace();
                    }
                    
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
                    try{
                        for (String linea : segundaParte) {
                            if (linea.isEmpty()) {
                                System.out.println();
                                Thread.sleep(500);
                                continue;
                            }
            
                            for (char c : linea.toCharArray()) {
                                System.out.print(c);
                                Thread.sleep(30); // Ajusta este valor para cambiar la velocidad de escritura
                            }
                            System.out.println();
                            Thread.sleep(200); // Pausa entre líneas
                        }
                    }catch(InterruptedException error){
                        error.printStackTrace();
                    }
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
        System.out.println("\033[2J");
        //dialogo derrota villano
        String[] primero ={"\u001B[31m"+"-NOOOO, COMO ES POSIBLE QUE ME HALLAS DERROTADO-","\u001B[35m"+"-Habla de una ves donde se encuentra tu jefe","\u001B[31m"+"-JAJAJAJAJAJA, estas loco si crees que lo vas a derrotar, es mas te esta esperando en","la montaña donde se libero el sello, pero para llegar a el tendras que derrotar a los demas y son","mucho mas fuerte que tu-","\u001B[35m"+"-Eso lo veremos-","\u001B[0m"+"Despues de decir esto "+selectedHero.nombre+" Procede a acabar con la vida del villano"+"\u001B[0m"

        };
        try{
            for (String linea : primero) {
                if (linea.isEmpty()) {
                    System.out.println();
                    Thread.sleep(500);
                    continue;
                }

                for (char c : linea.toCharArray()) {
                    System.out.print(c);
                    Thread.sleep(30); // Ajusta este valor para cambiar la velocidad de escritura
                }
                System.out.println();
                Thread.sleep(200); // Pausa entre líneas
            }
        }catch(InterruptedException error){
            error.printStackTrace();
        }
        
        
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
        String[] segundo={"luego de prepararse correctamente "+selectedHero.nombre+" se dirige a la montaña donde alguna","vez estos villanos fueron pricioneros, no paso mucho tiemo desde que comenzo a explorar la montaña","que se encontro a "+villano[1].nombre+" este parecia una persona realmente normal y "+selectedHero.nombre,"incluso llego a pensar que era un rehen, pero a penas se acerco a la persona a preguntarle si","estaba bien este se quito la tunica que lo cubria y dejo ver en su cuerpo grandes cantidades de hierro"+"\u001B[0m"

        };
        try{
            for (String linea : segundo) {
                if (linea.isEmpty()) {
                    System.out.println();
                    Thread.sleep(500);
                    continue;
                }

                for (char c : linea.toCharArray()) {
                    System.out.print(c);
                    Thread.sleep(30); // Ajusta este valor para cambiar la velocidad de escritura
                }
                System.out.println();
                Thread.sleep(200); // Pausa entre líneas
            }
        }catch(InterruptedException error){
            error.printStackTrace();
        }
        
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
        String[] tercero ={"\u001B[31m"+"-supe que derrotaste a "+villano[0].nombre+" nunca crei que duraria mucho","Lo que me sorprende es que muriera en manos de una persona tan debil como tu-","\u001B[0m"+selectedHero.nombre+" se pone en pocision de ataque y le dice","\u001B[35m"+"-y a ti te espera el mismo destino-"+"\u001B[0m"

        };
        try{
            for (String linea : tercero) {
                if (linea.isEmpty()) {
                    System.out.println();
                    Thread.sleep(500);
                    continue;
                }

                for (char c : linea.toCharArray()) {
                    System.out.print(c);
                    Thread.sleep(30); // Ajusta este valor para cambiar la velocidad de escritura
                }
                System.out.println();
                Thread.sleep(200); // Pausa entre líneas
            }
        }catch(InterruptedException error){
            error.printStackTrace();
        }

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
        System.out.println("\033[2J");
        String[] primero ={"\u001B[31m"+"-JAJAAJJAJAJAJ, me has vencido felicidades, disfruta tu vistoria mientras puedas, porque de ","ahora en adelante no te tocara tan facil","\u001B[0m"+selectedHero.nombre+" no le quedo otra alternativa mas que verlo morir. "+"\u001B[0m"

        };
        try{
            for (String linea : primero) {
                if (linea.isEmpty()) {
                    System.out.println();
                    Thread.sleep(500);
                    continue;
                }

                for (char c : linea.toCharArray()) {
                    System.out.print(c);
                    Thread.sleep(30); // Ajusta este valor para cambiar la velocidad de escritura
                }
                System.out.println();
                Thread.sleep(200); // Pausa entre líneas
            }
        }catch(InterruptedException error){
            error.printStackTrace();
        }
        
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
        String[] segundo ={"despues de un rato explorando la montaña logro a lo lejos ver una fabrica en muy mal estado","la curiosidad le gano y decidio acercarce a esta fabrica presuntamente abandonada","al entrar en esta se dio cuenta que habian muchos restos de desperdicios toxicos por todos lados","ignorando este detallo decidio explorar la fabrica, esto sin excito ya que no logro encontrar nada util","pero saliendo de la fabrica se encontro un gran tanque con desperdicios toxicos ","del cual logro escuchar una voz ","\u001B[31m"+"-Llevo dias absorviendo las toxinas de este tanque con un unico objetivo, ser el mas poderoso","y sumir este mundo en desperdicios toxicos,¿un mundo perfecto no te parece?"+"pero para que mi sueño se haga realidad primero debo acabar contigo asi que preparate-"+"\u001B[0m"

        };
        try{
            for (String linea : segundo) {
                if (linea.isEmpty()) {
                    System.out.println();
                    Thread.sleep(500);
                    continue;
                }

                for (char c : linea.toCharArray()) {
                    System.out.print(c);
                    Thread.sleep(30); // Ajusta este valor para cambiar la velocidad de escritura
                }
                System.out.println();
                Thread.sleep(200); // Pausa entre líneas
            }
        }catch(InterruptedException error){
            error.printStackTrace();
        }
                
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
        System.out.println("\033[2J");
        String[] primero ={"\u001B[31m"+"-Lograste vencerme, acabaste con la ilusion de mi mundo perfecto, espero que lo que intentes lograr no sea el camino equicado-","\u001B[0m"+selectedHero.nombre+" sale del lugar despues de cuestionarse la razon por la cual quieren sumir el mundo en oscuridad"+"\u001B[0m"

        };
        try{
            for (String linea : primero) {
                if (linea.isEmpty()) {
                    System.out.println();
                    Thread.sleep(500);
                    continue;
                }

                for (char c : linea.toCharArray()) {
                    System.out.print(c);
                    Thread.sleep(30); // Ajusta este valor para cambiar la velocidad de escritura
                }
                System.out.println();
                Thread.sleep(200); // Pausa entre líneas
            }
        }catch(InterruptedException error){
            error.printStackTrace();
        }
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
            String[] segundo ={"llegando a la cima de la montaña, la oscuridad comenzo a ser cada ves mas grande y densa","hasta que llego un punto en el cual no podia ni ver sus manos","pero en esa oscuridad se logro escuchar una voz","\u001B[31m"+"-De aqui no pasaras al jefe no le gustan los intrusos-", "\u001B[0m"+"despues de eso viste como el lugar se ilumino y lograste ver una mancha negra en el cielo"+"\u001B[0m"

            };
            try{
                for (String linea : segundo) {
                    if (linea.isEmpty()) {
                        System.out.println();
                        Thread.sleep(500);
                        continue;
                    }
    
                    for (char c : linea.toCharArray()) {
                        System.out.print(c);
                        Thread.sleep(30); // Ajusta este valor para cambiar la velocidad de escritura
                    }
                    System.out.println();
                    Thread.sleep(200); // Pausa entre líneas
                }
            }catch(InterruptedException error){
                error.printStackTrace();
            }
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
        String[] primero ={ "\u001B[31m"+"-Espero que estes preparado, HAS DESPERTADO AL JEFE-","\u001B[0m"+"Escuchas un gran estruendo detras tullo, cuando te volteas ves a un lobo gigante con el poder del espacio en su mano","antes de que pueda reaccionar este te lleva a otra dimencion donde te encuetras flotando en el espacio con un monton de algoritmos","pero afortunadamente para ti logras descubir que puedes usar los algoritmos como plataformas para poder atacar a "+villano[4].nombre+"\u001B[0m"

        };
        try{
            for (String linea : primero) {
                if (linea.isEmpty()) {
                    System.out.println();
                    Thread.sleep(500);
                    continue;
                }

                for (char c : linea.toCharArray()) {
                    System.out.print(c);
                    Thread.sleep(30); // Ajusta este valor para cambiar la velocidad de escritura
                }
                System.out.println();
                Thread.sleep(200); // Pausa entre líneas
            }
        }catch(InterruptedException error){
            error.printStackTrace();
        }
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
        System.out.println("\033[2J");
        String[] primero ={"\u001B[31m"+"Es increible lo que has logrado, yo solo seguia la profesia","aquel que me derrote tendra el poder del vacio"+"ahora te pertenece-", "\u001B[35m"+"¡¡Espera!! ¿cual es este poder que ahora me ah sido dado?","\u001B[31m"+"No puedo decirtelo es tu deber buscar su potencial ahora,","pero lo que si debes saber es que eres parte de esta profecía","desde el momento en el que te incursaste en este camino y solo es el inicio...","...de los cinco mejores o peores años de tu vida, que de ti depende que sean solo esa cantidad y no mas","puede que nos encontremos mas adelante en el camino y ya no como contrincantes","sino como amigos y compañeros","HAPPY CODING (chasquea los dedos)","\u001B[0m"+"Luego de esto despertaste saliendo de la dimensión, pero recuerda","nada fue un sueño...y una nueva misión se encuentra en tus hombros...","¿estas dispuesto a continuar?"
        };

        try{
            for (String linea : primero) {
                if (linea.isEmpty()) {
                    System.out.println();
                    Thread.sleep(500);
                    continue;
                }

                for (char c : linea.toCharArray()) {
                    System.out.print(c);
                    Thread.sleep(30); // Ajusta este valor para cambiar la velocidad de escritura
                }
                System.out.println();
                Thread.sleep(200); // Pausa entre líneas
            }
        }catch(InterruptedException error){
            error.printStackTrace();
        }
            System.out.println("\u001B[34m"+"██╗    ██╗██╗███╗   ██╗███╗   ██╗███████╗██████╗ ");
            System.out.println("██║    ██║██║████╗  ██║████╗  ██║██╔════╝██╔══██╗");
            System.out.println("██║ █╗ ██║██║██╔██╗ ██║██╔██╗ ██║█████╗  ██████╔╝");
            System.out.println("██║███╗██║██║██║╚██╗██║██║╚██╗██║██╔══╝  ██╔══██╗");
            System.out.println("╚███╔███╔╝██║██║ ╚████║██║ ╚████║███████╗██║  ██║");
            System.out.println(" ╚══╝╚══╝ ╚═╝╚═╝  ╚═══╝╚═╝  ╚═══╝╚══════╝╚═╝  ╚═╝");

    }



}
