package recursos;

public class Tanque implements Cor, Posicao, Canhao {
    private CoresRGB corCanhao;
    private CoresRGB corTanque;
    private int x, y;

    @Override
    public void atribCorCanhao(CoresRGB corCanhao) {
        this.corCanhao = corCanhao;

    }

    @Override
    public void atribCorTanque(CoresRGB corTanque) {
        this.corTanque = corTanque;

    }

    @Override
    public CoresRGB retCorCanhao() {

        return corCanhao;
    }

    @Override
    public CoresRGB retCorTanque() {

        return corTanque;
    }

    @Override
    public void movLeste() {
        x++;

    }

    @Override
    public void movOeste() {
        x--;

    }

    @Override
    public void movNorte() {
        y++;

    }

    @Override
    public void movSul() {
        y--;

    }

    @Override
    public int retPosX() {
        return this.x;

    }

    @Override
    public int retPosY() {
        return this.y;

    }

    @Override
    public void atirar() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Metendo bala...");
        }
    }

    @Override
    public void atirar(long cadencia) {
        for (int i = 1; i <= 5; i++) {
            esperar(cadencia * 1000);
            System.out.println("Metendo bala...");
        }
    }

    // Algo static pertence a classe, ou seja não precisa de um objeto para acessar
    // o metodo
    private static void esperar(long cadencia) {
        try {
            if(cadencia >5000){
                throw new IllegalArgumentException("O limite é de 5 segundos");
            }else{
                Thread.sleep(cadencia);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

}
