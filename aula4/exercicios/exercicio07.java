package exercicios;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario;

        System.out.println("Informe seu salario: ");
        salario = entrada.nextDouble();

        if (salario <= 600) {
            System.out.println("x");
        }

           
    }
    
}
