import java.util.Scanner;

public class exercicios04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int limite, cont = 0;

        System.out.println("Digite o valor limite: ");
        limite = entrada.nextInt();

        while (cont <= limite) {
            System.out.println("");
            cont++;
        }

        entrada.close();
        
    }
    
}
