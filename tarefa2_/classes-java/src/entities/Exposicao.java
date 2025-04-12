package entities;

public class Exposicao {
    private String nome;
    private String descricao;

    public Exposicao(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Exposição: " + nome + " - " + descricao;
    }
}
