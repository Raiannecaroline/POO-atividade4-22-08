public class Livros extends Publicacao {

    private String edicao;
    private int isbn;

    public Livros(String titulo, String autor, String anoDePublicacao, String genero,
                  String editora, int quantidadeDisponivel, String edicao, int isbn) {
        super(titulo, autor, anoDePublicacao, genero, editora, quantidadeDisponivel);
        this.edicao = edicao;
        this.isbn = isbn;
    }

}
