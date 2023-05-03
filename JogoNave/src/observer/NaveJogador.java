package observer;

import java.util.ArrayList;
import java.util.List;

public class NaveJogador implements Subject {
    private List<Observer> listaObservers = new ArrayList<>();
    private List<Acoes> listaAcoes = new ArrayList<>();

    @Override
    public void adObserver(Observer observer) {
        listaObservers.add(observer);
    }

    @Override
    public void adAcoes(Acoes acao) {
        listaAcoes.add(acao);
        notificar();
    }

    @Override
    public void notificar() {
        for (Observer obs : listaObservers) {
            obs.atualizar(listaAcoes.get(listaAcoes.size()-1));
        }
    }

}
