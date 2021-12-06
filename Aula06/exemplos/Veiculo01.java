package exemplos;

public class Veiculo01 {
        String marca, modelo;
        double consumo;

        Veiculo01(String marca, String modelo, double consumo){
            this.marca = marca;
            this.modelo = modelo;
            this.consumo = consumo;
        }

        void exibirDados() {
            System.out.println("Marca: " + marca + " modelo " + modelo);
        }

        double obterConsumo(){
            return consumo;
        }

        
}
