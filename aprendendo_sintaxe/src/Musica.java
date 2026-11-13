public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibirFichaTecnica(){
        System.out.println("Título da música: " + titulo);
        System.out.println("Nome do artista: " + artista);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Avaliação da música: " + avaliacao);
        System.out.println("Número de avaliações: " + numAvaliacoes);
    }

    void avaliarMusica(double nota){
        avaliacao += nota;
        numAvaliacoes++;
    }

    double mediaAvaliacoes(){
        return avaliacao / numAvaliacoes;
    }



}
