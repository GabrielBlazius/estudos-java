public class ConversorDeTemperatura {
    public static void main(String[] args){
        double temperatura= 30.2;
        double formula = (temperatura * 1.8) + 32;
        int farhrenheitSemCasaDecimal = (int) formula;
        String mensagem = """
                ======================================
                Convertendo grau celsius em fahrenheit
                ======================================
                Grau celcius: %.2f
                Em fahrenheit: %.2f
                Fahrenheit sem casa decimais: %d
                """.formatted(temperatura, formula, farhrenheitSemCasaDecimal);
        System.out.println(mensagem);

    }
}
