import java.util.Random;

public class atack {
    public static int respuesta(Random rand, int posible){
        int ataqueAleatorio = rand.nextInt(posible);
        return ataqueAleatorio;
    }

}