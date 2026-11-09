public class ConversorDolarParaReal {
    public static void main(String[] args) {
        double dolar = 4.94;
        double valorDolares = 100;
        double valorReal = valorDolares * dolar;

        System.out.println(String.format("O valor de $ %.2f dolares convertido em reais fica R$ %.2f", valorDolares, valorReal));
    }
}
