import javax.xml.stream.util.EventReaderDelegate;

public class exercicio03 {

    public static void main(String[] args) {
        int cont, tab, calculo;

        cont = 0;
        tab = 5;

        while (cont <= 10) {

            calculo = tab * cont;

            System.out.println("Tabuada: " + tab + " x " + cont + " = " + calculo);

            cont++;
        }
        
        
        
    }
    
}
