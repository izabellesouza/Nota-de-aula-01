package questao01;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        aluno.cadastrarAluno(nome, nota1, nota2, nota3);

        double media = aluno.calcularMedia();
        String status = aluno.consultarStatus();

        System.out.println("\nAluno: " + aluno.getNome());
        System.out.println("Média: " + media);
        System.out.println("Status: " + status);

        scanner.close();
    }
}