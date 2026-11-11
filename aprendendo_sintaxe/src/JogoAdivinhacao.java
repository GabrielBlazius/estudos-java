import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Gera um número aleatório de 1 a 100
        int numAleatorio = new Random().nextInt(100) + 1;
        int contador = 0;
        int maxTentativas = 5;
        boolean acertou = false;

        System.out.println("=== Jogo da Adivinhação ===");

        while (contador < maxTentativas) {
            System.out.println("Tentativa " + (contador + 1) + " de " + maxTentativas + ". Digite um número de 1 a 100: ");
            int numUsuario = scanner.nextInt();
            contador++;

            if (numUsuario == numAleatorio) {
                System.out.println("Parabéns, você acertou!");
                acertou = true;
                break;
            } else if (numUsuario < numAleatorio) {
                System.out.println("O número secreto é MAIOR!");
            } else {
                System.out.println("O número secreto é MENOR!");
            }
        }

        if (!acertou) {
            System.out.println("\nSuas tentativas acabaram! O número era: " + numAleatorio);
        }

        scanner.close();
    }
}