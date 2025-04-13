package entities;

public class Filhote {
    private String nome;
    private double peso;

    public Filhote(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Filhote: " + nome + " (Peso: " + peso + " kg)";
    }
}
