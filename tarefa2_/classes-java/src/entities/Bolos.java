package entities;


public class Bolos{
    private String massa;
    private String cobertura;
    private String recheio;

    public Bolos(String massa, String cobertura, String recheio){
        this.massa = massa;
        this.cobertura = cobertura;
        this.recheio = recheio;
        System.out.println("Novo bolo de "+ massa + " com cobertura de " + cobertura + " e recheio de "+ recheio);
    }

    public void setMassa (String massa){
        this.massa = massa;
    }
    public String getMassa(){
        return massa;
    }
    public void setCobertura (String cobertura){
        this.cobertura = cobertura;
    }
    public String getCobertura(){
        return cobertura;
    }

    public void setRecheio (String recheio){
        this.recheio = recheio;
    }
    public String getRecheio(){
        return recheio;
    }


}

