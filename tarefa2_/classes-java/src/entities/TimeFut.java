package entities;

import java.util.ArrayList;
import java.util.List;

public class TimeFut {
    private String nome;
    private String cidade;
    private String treinador;
    private List<Jogador> jogadores;

    public TimeFut(String nome, String cidade, String treinador) {
        this.nome = nome;
        this.cidade = cidade;
        this.treinador = treinador;
        this.jogadores = new ArrayList<>();
    }

    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
        System.out.println("Jogador adicionado: " + jogador.getNome());
    }

    public void listarJogadores() {
        System.out.println("Jogadores:");
        for (Jogador jogador : jogadores) {
                System.out.println(jogador);
        }
    }
}
