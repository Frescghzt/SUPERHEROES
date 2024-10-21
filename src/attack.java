import java.util.Random;

public class attack {
    public static int respuesta(Random rand, int posible){
        int ataqueAleatorio = rand.nextInt(posible)+1;
        return ataqueAleatorio;
    }

}
