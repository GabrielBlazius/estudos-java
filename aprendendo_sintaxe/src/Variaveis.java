public class Variaveis {
    public static void main(String[] args){
        boolean incluidoNoPlano = true;
        double notaFilme = 8.8;
        int anoLancamento= 2022;
        String sinopse = """
                ======================================
                Filme top gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                ======================================
                """;

        System.out.println("======================");
        System.out.println("Esse é o Screen Match");
        System.out.println("======================");
        System.out.println("Filme: Top Gun: Maverick");
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Nota do filme: " + notaFilme);
        System.out.println(sinopse);


    }
}
