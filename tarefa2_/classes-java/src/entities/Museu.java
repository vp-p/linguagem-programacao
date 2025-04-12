package entities;

import java.util.ArrayList;
import java.util.List;

public class Museu {
    private String nome;
    private String endereco;
    private List<Exposicao> exposicoes;
    private String horarioAberto;
    private String horarioFechado;

    public Museu(String nome, String endereco, String horarioAberto, String horarioFechado) {
        this.nome = nome;
        this.endereco = endereco;
        this.exposicoes = new ArrayList<>();
        this.horarioAberto = horarioAberto;
        this.horarioFechado = horarioFechado;
    }

    public void adicionarExposicao(Exposicao exposicao) {
        exposicoes.add(exposicao);
        System.out.println("Exposição adicionada: " + exposicao.getNome());
    }

    public void removerExposicao(String nomeExposicao) {
        exposicoes.removeIf(exposicao -> exposicao.getNome().equalsIgnoreCase(nomeExposicao));
        System.out.println("Exposição removida: " + nomeExposicao);
    }

    public void listarExposicoes() {
        if (exposicoes.isEmpty()) {
            System.out.println("Nenhuma exposição disponível.");
        } else {
            System.out.println("Exposições no museu:");
            for (Exposicao exposicao : exposicoes) {
                System.out.println(exposicao);
            }
        }
    }

    public static void main(String[] args) {
        Museu museu = new Museu("Museu Nacional", "Rua Principal, 123", "09:00", "18:00");
        museu.adicionarExposicao(new Exposicao("Arte Moderna", "Obras do século XX"));
        museu.adicionarExposicao(new Exposicao("História Antiga", "Relíquias egípcias"));
        museu.listarExposicoes();
        museu.removerExposicao("Arte Moderna");
        museu.listarExposicoes();
    }
}