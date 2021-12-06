package exemplos;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        p1.nome = "Márcia";
        p1.altura = 1.73;
        p1.apresentar();

        p2.nome = "Lucas Eduardo";
        p2.altura = 1.80;
        p2.apresentar();

    }
    
}
