import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numUsuario = 0;

        System.out.println("Digite um número: ");
        numUsuario = scanner.nextInt();

        if (numUsuario % 2 == 0){
            System.out.println("Número par!");
        }
        else{
            System.out.println("Número impar!");
        }
    }
}
