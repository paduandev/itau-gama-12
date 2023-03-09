package exercicio03;

import java.util.ArrayList;
import java.util.Scanner;

public class AppAluno {
    public static void main(String[] args) {
        final int QTDE_ALUNOS = 3;
        Scanner entrada = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();
        String nome;
        double nota, media;
        int alunosAcimaMedia;

        media = 0;
        for (int i = 0; i < QTDE_ALUNOS; i++) {
            System.out.println("Digite o nome do aluno:");
            nome = entrada.nextLine();
            System.out.println("Digite a nota:");
            nota = Double.parseDouble(entrada.nextLine());

            alunos.add(new Aluno(nome, nota));
            media += nota;
        }
        media /= QTDE_ALUNOS;       

        System.out.println("Média da turma: " + media);

        System.out.println("Alunos acima da média:");

        alunosAcimaMedia = 0;
        for (Aluno aluno : alunos) {
            if(aluno.getNota() > media) {
                System.out.println(aluno);
                alunosAcimaMedia++;
            }
        }
        System.out.println("Total de alunos acima da média: " + alunosAcimaMedia);

        entrada.close();
    }
}
