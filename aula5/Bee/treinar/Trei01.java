package treinar;

import java.util.Scanner;

/**
 * Trei01
 */
public class Trei01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int somaA, somaB, calculo;

        System.out.println("Digite a soma A: ");
        somaA = entrada.nextInt();

        System.out.println("Digite a soma B");
        somaB = entrada.nextInt();

        calculo = somaA + somaB;

        System.out.println("SOMA = " + calculo);

        entrada.close();
   }

}
