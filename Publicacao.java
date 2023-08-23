public abstract class Publicacao {

    private String titulo;
    private String autor;
    private String anoDePublicacao;
    private String genero;
    private String editora;
    private int quantidadeDisponivel;

    public Publicacao(String titulo, String autor, String anoDePublicacao, String genero, String editora, int quantidadeDisponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
        this.genero = genero;
        this.editora = editora;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public String getGenero() {
        return genero;
    }

    public String getEditora() {
        return editora;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public abstract void imprimeDados();
}
