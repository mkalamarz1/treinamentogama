package exercicios;

import java.util.Scanner;

import javax.print.attribute.standard.NumberOfDocuments;

public class exercicio02 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.println(" Digite as duas notas:");
        nota1 = entrada.nextDouble();
        nota2 = entrada.nextDouble();

        media = nota1 * 0.4 + nota2 * 0.6;

        if (media >= 6) {
            System.out.println( "Aprovado com media");
        } else {
            System.out.println("Reprovado com media");
        }

        entrada.close();


    }
    
}
