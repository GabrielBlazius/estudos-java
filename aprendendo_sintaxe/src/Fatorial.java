import java.util.Scanner;

class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número e devolvo o fatorial: ");
        int numUsuario = scanner.nextInt();
        long formulaFatorial = 1;
        int i = numUsuario;

        if (numUsuario < 0) {
            System.out.println("Não existe fatorial de número negativo.");
        } else {
            while (i > 1) {
                formulaFatorial = formulaFatorial * i;
                i--;
            }

            System.out.println("O fatorial é: " + formulaFatorial);
        }

        scanner.close();
    }
}