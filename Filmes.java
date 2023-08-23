public class Filmes extends Publicacao {

    private String diretor;
    private String atorPrincipal;
    private String sinopse;
    private int tempoDeDuracao;

    public String getDiretor() {
        return diretor;
    }

    public String getAtorPrincipal() {
        return atorPrincipal;
    }

    public String getSinopse() {
        return sinopse;
    }

    public int getTempoDeDuracao() {
        return tempoDeDuracao;
    }

    public Filmes(String titulo, String autor, String anoDePublicacao, String genero,
                  String editora, int quantidadeDisponivel, String diretor, String atorPrincipal, String sinopse, int tempoDeDuracao) {
        super(titulo, autor, anoDePublicacao, genero, editora, quantidadeDisponivel);
        this.diretor = diretor;
        this.atorPrincipal = atorPrincipal;
        this.sinopse = sinopse;
        this.tempoDeDuracao = tempoDeDuracao;
    }

    @Override
    public void imprimeDados() {
        System.out.println("Fimes:");
        System.out.println("Diretor: " + getDiretor());
        System.out.println("Ano de Publicação: " + getAnoDePublicacao());
        System.out.println("Gênero: " + getGenero());
        System.out.println("Editora: " + getEditora());
        System.out.println("Quantidade Disponível: " + getQuantidadeDisponivel());
        System.out.println("Diretor: " + diretor);
        System.out.println("Autor Principal: " + getAtorPrincipal());
        System.out.println("Sinopse: " + getSinopse());
        System.out.println("Tempo de Duração: " + getTempoDeDuracao());
    }
}
