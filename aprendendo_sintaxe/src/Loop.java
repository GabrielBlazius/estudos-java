import java.util.Scanner;

public class Loop {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++){
            System.out.println("Diga sua avaliação para o filme: ");
            nota = scanner.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println(String.format("A média das avaliações é %.2f", mediaAvaliacao/3));
    }
}
