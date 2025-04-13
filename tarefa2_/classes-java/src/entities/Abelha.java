package entities;

public class Abelha {
    private String tipo; // "Rainha", "Operária", etc.
    private boolean estaTrabalhando;

    public boolean getEstaTrabalhando(){
        return estaTrabalhando;
    }

    public Abelha(String tipo) {
        this.tipo = tipo;
        this.estaTrabalhando = false;
    }

    public void trabalhar() {
        estaTrabalhando = true;
        System.out.println("A abelha do tipo " + tipo + " está coletando pólen.");
    }

    @Override
    public String toString() {
        return "Abelha do tipo " + tipo;
    }
}
