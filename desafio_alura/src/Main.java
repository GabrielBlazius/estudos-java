import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int opcaoUsuario = 0;
        String nomeUsuario = "Gabriel Blazius";
        String tipoConta = "Corrente";
        double saldo = 2500;
        double valorReceber = 0;
        double valorSaque = 0;

        System.out.println(String.format("""
                ====================================
                Dados iniciais do cliente:         
                ====================================
                                                   
                Nome:             %s               
                Tipo conta:       %s               
                Saldo inicial:    R$ %.2f          
                ====================================
                """, nomeUsuario, tipoConta, saldo));

        while(opcaoUsuario != 4){
            System.out.println("""
                    Operações
                    
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    
                    Digite a opção desejada: 
                    """);
            opcaoUsuario = scanner.nextInt();

            switch(opcaoUsuario){
                case 1:
                    System.out.println("O saldo atual é R$ " + saldo + "\n");
                    break;
                case 2:
                    System.out.println("Informe o valor a receber: ");
                    valorReceber = scanner.nextDouble();

                    saldo += valorReceber;

                    System.out.println("Saldo atualizado R$ " + saldo + "\n");
                    valorReceber = 0;
                    break;
                case 3:
                    System.out.println("Informe o valor que deseja transferir: ");
                    valorSaque = scanner.nextInt();

                    if (valorSaque > saldo){
                        System.out.println("Não há saldo suficiente para essa transferência!");
                    }
                    else {
                        saldo -= valorSaque;
                        System.out.println("Saldo atualizado R$ " + saldo + "\n");
                        valorSaque = 0;
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!\n");
            }
        }

    }
}