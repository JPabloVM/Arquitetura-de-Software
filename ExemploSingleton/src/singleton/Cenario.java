package singleton;

public class Cenario {

    private static Cenario cenario;

    private Cenario() {
    }

    /**
     * retorna uma instancia do tipo cenário;
     * 
     * @return Cenario
     */
    public static Cenario getCenario() {
        if (cenario == null) {
            cenario = new Cenario();
        }
        return cenario;
    }

}
