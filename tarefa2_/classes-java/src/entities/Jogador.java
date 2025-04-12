package entities;

class Jogador {
    private String nome;
    private String posicao;

    public Jogador(String nome, String posicao) {
        this.nome = nome;
        this.posicao = posicao;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Jogador: " + nome + " (" + posicao + ")";
    }
}
