import java.util.Scanner;

public class Bee1006 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1, n2, n3, media;

        System.out.println("Digite o número n1: ");
        n1 = entrada.nextDouble();

        System.out.println("Digite o número n2: ");
        n2 = entrada.nextDouble();
        
        System.out.println("Digite o número n3: ");
        n3 = entrada.nextDouble();

        media = ((n1 * 2) + (n2 * 3) + (n3 * 5))/(2 + 3 + 5);

        System.out.printf("MEDIA = %.1f/n", media);

        entrada.close();
    }
}
