package entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ColecaoMoedas {
    private Map<TipoMoeda, List<Moeda>> catalogo;
    private double valorTotal;

    public ColecaoMoedas() {
        this.catalogo = new HashMap<>();
        this.valorTotal = 0.0;

        for (TipoMoeda tipo : TipoMoeda.values()) {
            catalogo.put(tipo, new ArrayList<>());
        }
    }

    public void adicionarMoeda(Moeda moeda) {
        catalogo.get(moeda.getTipo()).add(moeda);
        System.out.println("Adicionada moeda: " + moeda);
    }

    public void calcularValorTotal() {
        valorTotal = 0.0;
        for (List<Moeda> moedas : catalogo.values()) {
            for (Moeda moeda : moedas) {
                valorTotal += moeda.getValor();
            }
        }
        System.out.println("Valor total da coleção: " + valorTotal);
    }
}
