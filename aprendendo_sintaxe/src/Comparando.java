import java.util.Scanner;
public class Comparando {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int num1,num2 = 0;

        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextInt();

        if (num1 == num2){
            System.out.println("Os dois números são iguais!");
        }
        else if (num1 > num2){
            System.out.println("O número: " + num1 + " é maior que o segundo número");
        }
        else if (num2 > num1){
            System.out.println("O número: " + num2 + " é maior que o primeiro número");
        }





    }
}
