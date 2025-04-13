package entities;

import java.util.ArrayList;
import java.util.List;

public class Colmeia {
    private String localizacao;
    private List<Abelha> abelhas;
    private double quantidadeMiel;

    public Colmeia(String localizacao) {
        this.localizacao = localizacao;
        this.abelhas = new ArrayList<>();
        this.quantidadeMiel = 0.0;
    }

    public void adicionarAbelha(Abelha abelha) {
        abelhas.add(abelha);
        System.out.println("Adicionada uma nova abelha: " + abelha);
    }

    public void produzirMiel() {
        for (Abelha abelha : abelhas) {
            if (abelha.getEstaTrabalhando()) {
                abelha.trabalhar();
            }
        }
        quantidadeMiel += 0.5; // Simula a produção de miel
        System.out.println("Produção de miel atualizada: " + quantidadeMiel + " kg");
    }
}
