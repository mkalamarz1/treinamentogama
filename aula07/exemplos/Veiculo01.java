package exemplos;

public class Veiculo01 {
        String marca, modelo;
        private double consumo; // só pode ser usando dentro d classe

        public Veiculo01(String marca, String modelo, double consumo){
            this.marca = marca;
            this.modelo = modelo;
            this.consumo = consumo;
            setConsumo(consumo);
        }

        public void exibirDados() {
            System.out.println("Marca: " + marca + " Modelo " + modelo);
        }
        // get = obter o valor do artributo
        public double getConsumo(){
            return consumo;

        }
        // set = 
        public void setConsumo(double novoConsumo) {
            if(novoConsumo > 0) {
                consumo = novoConsumo;
            }
        }

        
}
