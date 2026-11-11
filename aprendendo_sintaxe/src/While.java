import java.util.Scanner;

public class While {
    public static void main() {

        Scanner scanner = new Scanner(System.in);
        int opcaoMenu = 0;

        while(opcaoMenu != 3){

            System.out.println("""
                    ====================================
                              MENU DE ESTOQUE
                    ====================================
                    1- Cadastrar Produto;
                    2- Ver Estoque;
                    3- Sair
                    """);

            opcaoMenu = scanner.nextInt();
            System.out.println("Saindo...");

        }
    }
}
