package exercicio;

public class Placar {
    private String nomeTime1, nomeTime2;
    private int golsTime1, golsTime2;

    public Placar() {
        nomeTime1 = "Time da casa";
        nomeTime2 = "Visitante";
    }

    public Placar (String nomeTime1, String nomeTime2) {
        this.nomeTime1 = nomeTime1;
        this.nomeTime2 = nomeTime2;
    }

    public String getPlacar() {
        return nomeTime1 + " " + golsTime1 + " x " + golsTime2 + " " + nomeTime2;
                
    }

    
}