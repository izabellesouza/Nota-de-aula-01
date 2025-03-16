package questao04;

import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Banco conta1 = new Banco();
        Banco conta2 = new Banco();

        while (true) {
            System.out.println("\nSelecione uma opção a seguir:");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Transferir");
            System.out.println("5 - Sair");
            int opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Saldo atual da conta 1: R$ " + conta1.consultarSaldo());
                System.out.println("Saldo atual da conta 2: R$ " + conta2.consultarSaldo());
            } else if (opcao == 2) {
                System.out.print("Digite o valor do depósito: R$ ");
                double valorDeposito = sc.nextDouble();
                conta1.depositar(valorDeposito);
            } else if (opcao == 3) {
                System.out.print("Digite o valor do saque: R$ ");
                double valorSaque = sc.nextDouble();
                conta1.sacar(valorSaque);
            } else if (opcao == 4) {
                System.out.print("Digite o valor da transferência: R$ ");
                double valorTransferir = sc.nextDouble();
                if (conta1.consultarSaldo() >= valorTransferir) {
                    conta1.transferir(valorTransferir, conta2);
                } else {
                    System.out.println("Erro: Saldo insuficiente na conta 1 para realizar a transferência.");
                }
            } else if (opcao == 5) {
                System.out.println("Saindo do sistema...");
                break;
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }

        sc.close();
    }
}