import java.util.Random;

public class trampa {
  
    public static boolean isTrampa(Random rand){
        int probabilidadTrampa = 4;
        int numeroAleatorio = rand.nextInt(10) +1 ;
        return probabilidadTrampa <= numeroAleatorio;
    }

}