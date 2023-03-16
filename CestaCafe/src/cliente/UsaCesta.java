package cliente;

import composite.*;

public class UsaCesta {
    public static void main(String[] args) throws Exception {
        Composite cesta = new Composite("Cesta de café");

        Component produto1 = new Leaf(0.50, "Pão");
        Component produto2 = new Leaf(12.56, "Café");
        Component produto3 = new Leaf(7.00, "Leite");
        Component produto4 = new Leaf(10.00, "Bombom de cereja");
        Component produto5 = new Leaf(15.00, "Bombom de Licor");

        Composite caixa = new Composite("Caixa de bombons");
        caixa.adicionar(produto4);
        caixa.adicionar(produto5);

        cesta.adicionar(produto1);
        cesta.adicionar(produto2);
        cesta.adicionar(produto3);
        cesta.adicionar(caixa);

        System.out.println(cesta);
        System.out.println("Total: " + cesta.getPreco());
    }
}
