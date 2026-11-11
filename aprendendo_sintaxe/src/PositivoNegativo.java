import java.util.Scanner;
public class PositivoNegativo {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        double num = 0;

        System.out.println("Digite um número: ");
        num = scanner.nextDouble();

        if (num < 0){
            System.out.println("Número negativo!");
        }
        else{
            System.out.println("Número positivo!");
        }

    }
}
