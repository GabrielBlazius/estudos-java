public class Casting {
    public static void main(String[] args) {
        double peso = 70.8;
        int pesoInt = (int) peso;
        System.out.println(pesoInt);

        char letra = 'B';
        String palavra = "Gabriel";

        System.out.println(palavra + " " + letra);

        double precoProduto = 14.90;
        int quantidade = 22;
        double resultado = precoProduto * quantidade;
        System.out.println("Valor total de todos produtos em estoque: " + resultado);
    }
}
