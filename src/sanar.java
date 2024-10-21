import java.util.Random;

public class sanar {
    public static int heal(Random rand, int healMax ){
        int healAleatorio = rand.nextInt(healMax)+1;
        final int RECUPERACION_MIN = 5;
        int healSalida = healAleatorio*RECUPERACION_MIN;
        return healSalida;
    }

}
