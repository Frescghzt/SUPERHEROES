import java.util.Random;

class Esquiva {
    public static boolean isEsquivar(Random rand, int velocidad){
        int menosProbabilidad = 4;
        int probabilidadEsquivar = Math.min(100, velocidad/menosProbabilidad);
        int numeroAleatorio = rand.nextInt (100) + 1;
        return numeroAleatorio <= probabilidadEsquivar;
    }

}
