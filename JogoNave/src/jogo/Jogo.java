package jogo;
import observer.*;
public class Jogo {
    public static void main(String[] args) throws Exception {
        NaveJogador jogador = new NaveJogador();
        NaveInimiga inimigo1 = new NaveInimiga("Bombardeador", jogador);
        jogador.adAcoes(Acoes.AVANCAR);
        NaveInimiga inimigo2 = new NaveInimiga("Atirador", jogador);

        jogador.adAcoes(Acoes.RECUAR);
        jogador.adAcoes(Acoes.VIRAR_DIR);
        jogador.adAcoes(Acoes.VIRAR_ESQ);
    }
}
