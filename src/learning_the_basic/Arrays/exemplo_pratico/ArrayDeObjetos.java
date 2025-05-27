package learning_the_basic.Arrays.exemplo_pratico;

public class ArrayDeObjetos {
    public static void main(String[] args) {
        Aluno[] turma = new Aluno[3];
        turma[0] = new Aluno("João", 20);
        turma[1] = new Aluno("Maria", 22);
        turma[2] = new Aluno("Pedro", 19);

        for (Aluno aluno : turma) {
            System.out.println(aluno.nome + " - " + aluno.idade + " anos");
        }
    }
}
