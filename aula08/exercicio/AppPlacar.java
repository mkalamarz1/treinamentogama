package exercicio;

public class AppPlacar {
    public static void main(String[] args) {
        Placar placar1 = new Placar();
        Placar placar2 = new Placar("Santos", "Palmeiras");

        System.out.println(placar1.getPlacar());
        System.out.println(placar2.getPlacar());

    }
}
