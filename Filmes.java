public class Filmes extends Publicacao {

    private String diretor;
    private String autorPrincipal;
    private String sinopse;
    private int tempoDeDuracao;

    public Filmes(String titulo, String autor, String anoDePublicacao, String genero,
                  String editora, int quantidadeDisponivel, String diretor, String autorPrincipal, String sinopse, int tempoDeDuracao) {
        super(titulo, autor, anoDePublicacao, genero, editora, quantidadeDisponivel);
        this.diretor = diretor;
        this.autorPrincipal = autorPrincipal;
        this.sinopse = sinopse;
        this.tempoDeDuracao = tempoDeDuracao;
    }
}
