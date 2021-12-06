package treinar;

import java.util.Scanner;

public class trei02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int v1, v2, calculo;

        System.out.println("Digite o valor v1: ");
        v1 = entrada.nextInt();

        System.out.println("Digite o valor v2: ");
        v2 = entrada.nextInt();

        calculo = v1 * v2;

        System.out.println("PROD = " + calculo);

        entrada.close();
    }
}
