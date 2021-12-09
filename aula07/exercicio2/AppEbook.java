package exercicio2;

public class AppEbook {
    public static void main(String[] args) {
        Ebook livro = new Ebook("Java", "Deitei", 300);

        livro.exibirCapa();

        System.out.println("Pagina atual: " + livro.exibirPagina());


    }
    
}
