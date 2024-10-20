import java.util.Random;

public class charge {
    int chargePrincipal;
    int chargeSecundario;
    int chargeFinal;
    
    
    
    public charge(
        int chargePrincipal,
        int chargeSecundario,
        int chargeFinal){
            this.chargePrincipal = chargePrincipal;
            this.chargeSecundario = chargeSecundario;
            this.chargeFinal = chargeFinal;
        }


    public static int carga(Random rand, int chargemax){
        int cargaAleatorio = rand.nextInt(chargemax) + 1;
        return cargaAleatorio;

    }
}
