public class Carro {
    String modelo;
    int ano;
    String cor;

    void imprimirFichaTecnica(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano do carro: " + ano);
        System.out.println("Cor do carro: " + cor);
    }

    void calcularQuantosAnosDoCarro(){
        System.out.println(2026-ano);
    }
}
