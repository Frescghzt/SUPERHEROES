import java.util.Random;;

public class Trampa {
    
    public static boolean isTrampa(Random rand){
        int probabilidadTrampa = 5;
        int numeroAleatorio = rand.nextInt(10) +1 ;
        return probabilidadTrampa >= numeroAleatorio;
    }

}
