
import java.util.Scanner;

class Reglas {
    public static void reglas(Scanner input){

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
                            System.out.println("El juego consta de 5 niveles tu objetivo final es vencer al jefe final");
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

    
    }


        
        
    

}
