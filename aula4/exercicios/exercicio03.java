package exercicios;

import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1, n2;

        System.out.println("Digite os dois numeros");
        n1 = entrada.nextDouble();
        n2 = entrada.nextDouble();

        if (n1 < n2) {
            System.out.println(n1 + ", " + n2);
        }else {
            System.out.println("ola");
        }

        entrada.close();
    }
    
}
