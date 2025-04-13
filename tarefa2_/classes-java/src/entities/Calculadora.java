package entities;

public class Calculadora {
    private double display;
    private double memoria;

    public Calculadora() {
        this.display = 0.0;
        this.memoria = 0.0;
    }

    public double somar(double a, double b) {
        display = a + b;
        System.out.println("Resultado da soma: " + display);
        return display;
    }

    public double subtrair(double a, double b) {
        display = a - b;
        System.out.println("Resultado da subtração: " + display);
        return display;
    }
}
