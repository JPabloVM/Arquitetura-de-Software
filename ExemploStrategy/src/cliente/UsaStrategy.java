package cliente;

import strategy.*;

public class UsaStrategy {
    public static void main(String[] args) throws Exception {
        Distancia distancia = new Distancia(100);
        System.out.println(calculoDoFrete(distancia, "ABC"));
        System.out.println(calculoDoFrete(distancia, "CBA"));
        System.out.println(calculoDoFrete(distancia, "XPTO"));
    }

    public static double calculoDoFrete(Distancia distancia, String empresa) {
        double valor = -1;
        Frete frete;
        if (empresa.equals("ABC")) {
            frete = new ABC();
            valor = frete.calcFrete(distancia);
        }
        if (empresa.equals("CBA")) {
            frete = new CBA();
            valor = frete.calcFrete(distancia);
        }
        if (empresa.equals("XPTO")) {
            frete = new XPTO();
            valor = frete.calcFrete(distancia);
        }
        return valor;
    }
}
