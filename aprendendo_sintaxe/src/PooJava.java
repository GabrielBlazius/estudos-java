public class PooJava {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.imprimirOlaMundo();

        Calculadora calculadora = new Calculadora();

        double dobro = calculadora.retornaDobro(10);

        System.out.println(dobro);

        Musica musica = new Musica();

        musica.titulo = "Outra vida";
        musica.artista = "Armandinho";
        musica.anoDeLancamento = 2019;
        musica.avaliarMusica(8);
        musica.avaliarMusica(10);
        musica.avaliarMusica(7);
        double mediaAvaliacoes = musica.mediaAvaliacoes();

        System.out.println("Média de avaliações: " + mediaAvaliacoes);
        musica.exibirFichaTecnica();

        Carro carro = new Carro();
        carro.modelo = "Siena";
        carro.ano = 2014;
        carro.cor = "Preto";

        carro.imprimirFichaTecnica();
        carro.calcularQuantosAnosDoCarro();

        Aluno aluno = new Aluno();

        aluno.nome = "Blazius";
        aluno.idade = 22;

        aluno.exibirInformacoes();
    }
}
