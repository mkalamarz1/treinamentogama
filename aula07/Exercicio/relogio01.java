package Exercicio;

public class relogio01 {
    private int hora, minuto, segundo;

    public relogio01(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if(hora >= 0 && hora  <24) {
            this.hora = hora;
        }
    }

    public int get


    public String getHoraAtual() {
        return hora + ":" + minuto + ":" + segundo;
    }
}
