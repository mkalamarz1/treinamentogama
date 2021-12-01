package exercicios;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double nota1, nota2, resultado;

        System.out.println("nota1: ");
        nota1 = entrada.nextDouble();

        System.out.println("nota2: ");
        nota2 = entrada.nextDouble();

        resultado = (nota1 + nota2) / 2;

        System.out.println("Resultado da media: " + resultado);

        entrada.close();
    }
    
}
