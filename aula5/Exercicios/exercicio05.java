import java.util.Scanner;

public class exercicio05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, soma = 0;

        System.out.println("Digite o número: ");
        numero = entrada.nextInt();

        while (numero != 0) {
            System.out.println("Digite o número: ");
            numero = entrada.nextInt();

            soma = soma + numero;
        } 
        System.out.println("Soma valores: " + soma); 
        
        entrada.close();
    }
}
