package exemplos;

public class AppVeiculo01 {
    public static void main(String[] args) {
        Veiculo01 veiculo = new Veiculo01("VW", "Gol", 15.5);

        veiculo.exibirDados();
        // veiculo.consumo = -10; //erro! não é mais visivel
        veiculo.setConsumo(-20);

        System.out.println("Consumo : " + veiculo.getConsumo());

    }

}
