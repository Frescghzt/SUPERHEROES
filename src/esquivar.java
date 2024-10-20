import java.util.Random;
public class esquivar {
    public static boolean esquivar(Random rand, int velocidad){
        int probabilidadEsquivar = Math.min(100, velocidad);
        int numeroAleatorio = rand.nextInt(100) + 1;
        return numeroAleatorio <= probabilidadEsquivar;
    }

}
