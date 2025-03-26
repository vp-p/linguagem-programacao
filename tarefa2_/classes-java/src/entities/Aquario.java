package entities;

import java.util.ArrayList;
import java.util.List;

public class Aquario {
    private List<String> peixes = new ArrayList<>();
    private String capacidade;
    private String tipo;

    public Aquario(){
    }

    public void setCapacidade (String capacidade){
        this.tipo = tipo;
    }
    public String getCapacidade(){
        return capacidade;
    }

    public void setTipo (String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return tipo;
    }

    public List<String> getPeixes() {
        return peixes;
    }

    public void adicionarPeixe(String tipo) {
        peixes.add(tipo);
        System.out.println("Um peixe do tipo " + tipo + " foi adicionadp ao aquario.");
    }
}