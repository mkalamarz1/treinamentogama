import java.text.ParseException;
import java.util.Scanner;

public class exercicio06 { 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int TOTAL_NUMEROS = 10;
        int numero, pares;

        pares = 0;
        for (int i = 0; i <= TOTAL_NUMEROS; i++) {
            System.out.printf("Digite o %d numero: ", i);
            numero = entrada.nextInt();

            System.out.println("O total de pares é" + pares);
            System.out.println("O total de imapres é " + (TOTAL_NUMEROS - pares));

        }

     
    }
    
}
