
public class BibliotecaXPTO {
    public static void main(String[] args) {

        Filmes filmes = new Filmes("Rei Leão", "Walt Disney", "1994", "Animação",
                "Disney", 2, "Roger Allers e Rob Minkoff", "Simba",
                "Simba é o filho de Mufasa e sucessor do trono, mas algumas coisas começam a dar errado..",85);


        Livros livros = new Livros("Maus", "Art Spiegelman", "1986", "HQ",
                "Quadrinhos & Cia", 1, "1°", 10);


        Publicacao[] publicacoes = new Publicacao[2];
        publicacoes[0] = livros;
        publicacoes[1] = filmes;

        for (Publicacao publicacao : publicacoes) {
            publicacao.imprimeDados();
        }
    }


    /**
     *   V. Explique com suas palavras porque foi possível adiciona no array de
     *   publicação um objeto do tipo Filme e um objeto tipo Livro?
     *   R: Por vieram de uma superclasse e a subclasse pode ser tratada como objetos de sua classe pai.
     *
     *   VI. Se método imprime dados é abstrato na classe Publicação, como é
     *   possível imprimir os dados do Livro e do Filme quando o loop é
     *   executado?
     *   R: Porque o método é implementado nas subclasses isso acaba permitindo que os objetos sejam poliformicamente tratados.
     */

}
