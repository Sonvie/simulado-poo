// Questão 03:

class Autor {
    public String nome;
    public String nacionalidade;

    public Autor(String nome, String nacionalidade) {
        if ((nome != null && !(nome.isBlank())) && (nacionalidade != null && !(nacionalidade.isBlank()))) {
            this.nome = nome;
            this.nacionalidade = nacionalidade;
        } else System.out.println("Digite um nome ou nacionalidade válidos.");
    }
}

class Livro {
    private String titulo;
    private double preco;
    private Autor autor;

    public Livro(String titulo, double preco, Autor autor) {
        if (titulo != null && !(titulo.isBlank())) {
            this.titulo = titulo;
            this.preco = preco;
            this.autor = autor;
        } else System.out.println("Seu título não é válido.");
    }

    public void exibirDetalhes(){
        System.out.println("Título: " + titulo + 
        "  | Nome do Autor: " + autor.nome + "  | Preço: " + preco);
    }

}

public class Principal {
    public static void main(String[] args) {
        Autor autor = new Autor("Byung-Chul Han", "Sul-Coreano");

        Livro livro = new Livro("Sociedade do Cansaço", 35.0, autor);

        livro.exibirDetalhes();
    }
}