package entities;

public class Cozinheiro {
    private String nome;
    private String especialidade;

    public Cozinheiro(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void cozinhar() {
        System.out.println("O cozinheiro " + nome + " está cozinhando com sua especialidade: " + especialidade);
    }

    @Override
    public String toString() {
        return "Cozinheiro: " + nome + " (" + especialidade + ")";
    }
}
