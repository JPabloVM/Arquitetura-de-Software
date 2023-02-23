package cenario;

import recursos.*;

public class BatalhaTanques {
    public static void main(String[] args) throws Exception {
        Tanque meteBala = new Tanque();

        meteBala.movNorte();
        
        meteBala.atirar();
        meteBala.movOeste();
        
        meteBala.movSul();
        meteBala.movLeste();
        System.out.println(meteBala.retPosX());
        System.out.println(meteBala.retPosY());
    }
}
