import java.util.Random;

class Charge {
    int chargePrincipal;
    int chargeSecundario;
    int chargeFinal;
    
    
    
    public Charge(
        int chargePrincipal,
        int chargeSecundario,
        int chargeFinal){
            this.chargePrincipal = chargePrincipal;
            this.chargeSecundario = chargeSecundario;
            this.chargeFinal = chargeFinal;
        }


    public static int carga(Random rand, int chargemax){
        int cargaAleatorio = rand.nextInt(chargemax) + 1;
        final int CARGA_MIN = 5;
        int cargaSalida= cargaAleatorio*CARGA_MIN;
        return cargaSalida;

    }
}

