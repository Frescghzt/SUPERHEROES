import java.util.Random;
public class esquiva {
    public static boolean isEsquivar(Random rand, int velocidad){
        int probabilidadEsquivar = Math.min(100, velocidad/3);
        int numeroAleatorio = rand.nextInt(100) + 1;
        return numeroAleatorio <= probabilidadEsquivar;
    }

}
