import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        String nome = "Mariana";
        String tipoConta = "Corrente";
        double saldo = 2000;

        System.out.println("****************************");
        System.out.println("Dados iniciais do cliente: ");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo inicial: R$ " + saldo);
        System.out.println("****************************");

        int opcao = 0;

        while (opcao != 4) {

            System.out.println("""
                    Operações:
                    1.Consultar saldos
                    2.Recebe valor
                    3.Transferir valor
                    4.Sair
                    Digite a opção desejada:
                    """);

            opcao = leitura.nextInt();

            if (opcao == 1) { //Consulta de saldo

                System.out.println("Seu saldo é: " + saldo);

            } else if (opcao == 2) { //Recebe valor

                System.out.println("Valor que deseja adicionar: ");
                double acrescimo = leitura.nextDouble();

                double novoSaldoAdicional = saldo + acrescimo;

                System.out.println("Seu novo saldo é: " + novoSaldoAdicional);

            } else if (opcao == 3) { //Transferência

                System.out.println("Valor que deseja transferir: ");
                double decrescimo = leitura.nextDouble();

                double novoSaldoDecrescimo = saldo - decrescimo;

                System.out.println("Seu novo saldo é: " + novoSaldoDecrescimo);

                if (novoSaldoDecrescimo < 0) {

                    System.out.println("Não foi possível realizar a transferência, saldo inuficiente!");

                }

            } else if (opcao == 4) { //Sair

                System.out.println("Encerrando aplicação!");

            } else { //Nenhuma das oções

                System.out.println("Opção inválida!");

            }

        }

    }
}