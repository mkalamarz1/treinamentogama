import java.util.Scanner;

public class Bee1003 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int somaA, somaB, calculo;

        System.out.println("Número A: ");
        somaA = entrada.nextInt();

        System.out.println("Número B: ");
        somaB = entrada.nextInt();

        calculo = somaA + somaB;
        
        System.out.println("SOMA = " + calculo);


        entrada.close();
    
    }
    
    
}
