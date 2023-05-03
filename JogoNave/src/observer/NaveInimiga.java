package observer;

public class NaveInimiga implements Observer {
    private String nome;

    public NaveInimiga(String nome, Subject subject) {
        this.nome = nome;
        subject.adObserver(getInstance());
    }

    private NaveInimiga getInstance() {
        return this;
    }
    // public String getNome() {
    // return nome;
    // }

    // public void setNome(String nome) {
    // this.nome = nome;
    // }

    @Override
    public void atualizar(Acoes acao) {
        System.out.println(nome + "-" + acao);
    }

}
