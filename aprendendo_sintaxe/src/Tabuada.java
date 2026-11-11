import java.util.Scanner;
class Tabuada {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int numUsuario, tabuada = 0;
        System.out.println("Digite um número e retornarei a tabuada dele: ");
        numUsuario = scanner.nextInt();

        for(int i = 0; i <= 10; i++){
            tabuada = numUsuario * i;
            System.out.println(String.format("%d x %d = %d", numUsuario, i, tabuada));
        }
    }
}
