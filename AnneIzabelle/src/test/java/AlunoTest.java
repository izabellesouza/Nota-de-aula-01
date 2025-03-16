package questao01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlunoTest {

    @Test
    public void testAlunoAprovado() {
        /* # Cenário: Verificar se o aluno(a) está aprovado

        Dado que a aluna "Izabelle" possui as notas 8.0, 7.5 e 9.0
        Quando ela consulta seu status
        Então valido que o status retornado deve ser "Aprovado! Parabéns, não fez mais que sua obrigação!!"*/

        Aluno aluno = new Aluno();
        aluno.cadastrarAluno("Izabelle", 8.0, 7.5, 9.0);

        String status = aluno.consultarStatus();

        assertEquals("Aprovado! Parabéns, não fez mais que sua obrigação!!", status);
    }

    @Test
    public void testAlunoReprovado() {
        /*# Cenário: Verificar se o aluno está reprovado

        Dado que a aluna "Anne" possui as notas 2.0, 3.0 e 2.5
        Quando ela consulta seu status
        Então valido que o status retornado deve ser "Reprovado! Que pena! Na próxima vai dar certo, ok?!"*/

        Aluno aluno = new Aluno();
        aluno.cadastrarAluno("Ana", 2.0, 3.0, 2.5);

        String status = aluno.consultarStatus();

        assertEquals("Reprovado! Que pena! Na próxima vai dar certo, ok?!", status);
    }

    @Test
    public void testAlunoNaFinal() {
        /* Cenário: Verificar se o Aluno(a) está na final
        Dado que o aluno "Pedro" possui as notas 5.5, 6.0 e 4.5
        Quando ele consulta seu status
        Então valido que o status retornado deve ser "Na Final, não fique triste, com um pouco mais de estudo, você passará"*/

        Aluno aluno = new Aluno();
        aluno.cadastrarAluno("Junior", 5.5, 6.0, 4.5);

        String status = aluno.consultarStatus();

        assertEquals("Na Final, não fique triste, com um pouco mais de estudo, você passará", status);
    }
}
