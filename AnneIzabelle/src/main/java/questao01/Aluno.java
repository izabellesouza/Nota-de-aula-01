package questao01;

public class Aluno {

    private String nome;
    private double nota1, nota2, nota3;

    public void cadastrarAluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public String consultarStatus() {
        double media = calcularMedia();
        if (media >= 7) {
            return "Aprovado! Parabéns, não fez mais que sua obrigação!!";
        } else if (media < 4) {
            return "Reprovado! Que pena! Na próxima vai dar certo, ok?!";
        } else {
            return "Na Final, não fique triste, com um pouco mais de estudo, você passará";
        }
    }

    public String getNome() {
        return nome;
    }
}