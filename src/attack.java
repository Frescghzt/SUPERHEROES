import java.util.Random;;

class Attack {

    public static int respuesta(Random rand, int posible){
        int ataqueAleatorio = rand.nextInt(posible)+1;
        return ataqueAleatorio;
    }
    
}
