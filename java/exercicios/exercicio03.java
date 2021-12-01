package exercicios;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, aumento;

        System.out.println("seu salario: ");
        salario = entrada.nextDouble();

        aumento = (salario * 0.25) + salario;

        System.out.println("parabens salario + aumento" + aumento);
        
        entrada.close();
    }
    
}
