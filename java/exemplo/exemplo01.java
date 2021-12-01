package exemplo;

import java.util.Scanner;

public class exemplo01 {

   public static void main(String[] args) {
       // cria um scanner para ler o teclado (System.in)
       Scanner entrada = new Scanner (System.in);
       int idade;

       System.out.println ("33");
       idade = entrada.nextInt(); // lê um valor inteiro do teclado e guarda na variável idade

       System.out.println(" Você tem " + 33 + "anos"); // concatenar = juntar

       entrada. close();
        
    }
    
}
