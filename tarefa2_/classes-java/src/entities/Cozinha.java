package entities;

import java.util.ArrayList;
import java.util.List;

public class Cozinha {
    private String nome;
    public List<Cozinheiro> cozinheiros;
    private List<String> ingredientes;

    public Cozinha(String nome) {
        this.nome = nome;
        this.cozinheiros = new ArrayList<>();
        this.ingredientes = new ArrayList<>();
    }

    public void adicionarIngrediente(String ingrediente) {
        ingredientes.add(ingrediente);
        System.out.println("Adicionado ingrediente: " + ingrediente);
    }

    public void prepararRefeicao() {
        if (cozinheiros.isEmpty()) {
            System.out.println("Não há cozinheiros disponíveis para preparar a refeição.");
            return;
        }

        for (Cozinheiro cozinheiro : cozinheiros) {
            cozinheiro.cozinhar();
        }
        System.out.println("Refeição preparada com os seguintes ingredientes: " + ingredientes);
    }
}
