import java.util.Scanner;
public class LeituraDados {
    public static void main() {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filmeFavorito = leitura.nextLine();
        System.out.println("Qual é o ano de lançamento do seu filme? ");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Seu filme favorito é: " + filmeFavorito);
        System.out.println("O ano de lançamento é: " + anoDeLancamento);
    }
}
