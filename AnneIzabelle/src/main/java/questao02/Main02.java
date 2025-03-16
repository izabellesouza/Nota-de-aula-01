package questao02;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha uma operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Divisão");
        System.out.println("4 - Multiplicação");

        int opcao = sc.nextInt();

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        double resultado = 0;

        if (opcao == 1) {
            resultado = num1 + num2;
        } else if (opcao == 2) {
            resultado = num1 - num2;
        } else if (opcao == 3) {
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("Erro: Divisão por zero não permitida!");
                return;
            }
        } else if (opcao == 4) {
            resultado = num1 * num2;
        } else {
            System.out.println("Opção inválida!");
            return;
        }

        System.out.println("Resultado: " + resultado);

        sc.close();
    }
}