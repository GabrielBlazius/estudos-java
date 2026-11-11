import java.util.Scanner;
class CalculoDeArea {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        double lado1,lado2, raio = 0;

        while(opcao != 3){
            System.out.println("""
                    =============
                        MENU
                    =============
                    1- Calcular área do quadrado;
                    2- Calcular área do círculo;
                    3- Sair;
                    """);
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o primeiro lado do quadrado: ");
                    lado1 = scanner.nextDouble();

                    System.out.println("Digite o segundo lado do quadrado: ");
                    lado2 = scanner.nextDouble();

                    double formulaquadrado = lado1 * lado2;
                    System.out.println("A área do quadrado é: " + formulaquadrado);
                    break;
                case 2:
                    System.out.println("Digite o raio do círculo: ");
                    raio = scanner.nextDouble();

                    double formulaCirculo = 3.14 * (raio * raio);
                    System.out.println("A área do círculo é: " + formulaCirculo);
                    break;
                case 3:
                    System.out.println("Saindo...");
            }
        }
    }
}
