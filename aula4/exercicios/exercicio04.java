package exercicios;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioBruto, prestacao, calculo;

        System.out.println("Seu salario: ");
        salarioBruto = entrada.nextDouble();

        System.out.println("quantas quer prestação: ");
        prestacao = entrada.nextDouble();

        calculo = salarioBruto * 0.3;

        if(prestacao <= calculo){
            System.out.println("Emprestimo concedido");
        }
        else{
            System.out.println("Emprestimo nao pode ser concedido!");
        }

        entrada.close();

    }
    
}
