package entities;

public class Moeda {
    private TipoMoeda tipo;
    private double valor;

    public TipoMoeda getTipo(){
        return tipo;
    }

    public Moeda(TipoMoeda tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Moeda de " + tipo + " com valor: " + valor;
    }
}
