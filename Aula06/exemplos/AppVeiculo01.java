package exemplos;

public class AppVeiculo01 {
    public static void main(String[] args) {

        Veiculo01 veiculo = new Veiculo01("VW", "Gol", 15.5);

        veiculo.exibirDados();
        System.out.println("Consumo : " + veiculo.obterConsumo());

    }

}
