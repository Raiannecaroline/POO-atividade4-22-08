public class Livros extends Publicacao {

    private String edicao;
    private int isbn;

    public String getEdicao() {
        return edicao;
    }

    public int getIsbn() {
        return isbn;
    }

    public Livros(String titulo, String autor, String anoDePublicacao, String genero,
                  String editora, int quantidadeDisponivel, String edicao, int isbn) {
        super(titulo, autor, anoDePublicacao, genero, editora, quantidadeDisponivel);
        this.edicao = edicao;
        this.isbn = isbn;
    }

    @Override
    public void imprimeDados() {
        System.out.println("Livros:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ano de Publicação: " + getAnoDePublicacao());
        System.out.println("Gênero: " + getGenero());
        System.out.println("Editora: " + getEditora());
        System.out.println("Quantidade Disponível: " + getQuantidadeDisponivel());
        System.out.println("Edição: " + getEdicao());
        System.out.println("ISBN: " + getIsbn());
    }

}
