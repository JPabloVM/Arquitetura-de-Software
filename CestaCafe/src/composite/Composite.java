package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private List<Component> lista;
    private String nome;

    public Composite(String nome) {
        lista = new ArrayList<>();
        this.nome = nome;
    }

    public void adicionar(Component component) {
        lista.add(component);
    }

    public void remover(Component component) {
        lista.remove(component);
    }

    @Override
    public double getPreco() {
        double total = 0;
        // Esse for percorre a lista
        for (Component c : lista) {
            total += c.getPreco();
        }
        return total;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

}
