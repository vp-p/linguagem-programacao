package entities;

import java.util.ArrayList;
import java.util.List;

public class Vaca {
    private int identificador;
    private String raca;
    private double peso;
    private String dataNascimento;
    private List<Filhote> filhotes;

    public Vaca(int identificador, String raca, double peso, String dataNascimento) {
        this.identificador = identificador;
        this.raca = raca;
        this.peso = peso;
        this.dataNascimento = dataNascimento;
        this.filhotes = new ArrayList<>();
    }

    public void adicionarFilhote(Filhote filhote) {
        filhotes.add(filhote);
        System.out.println("Filhote adicionado: " + filhote);
    }

    public void listarFilhotes() {
        if (filhotes.isEmpty()) {
            System.out.println("Nenhum filhote registrado.");
        } else {
            System.out.println("Filhotes da vaca:");
            for (Filhote filhote : filhotes) {
                System.out.println(filhote + " - Raça: " + raca + " - Data de nascimento: " + dataNascimento);
            }
        }
    }
}
