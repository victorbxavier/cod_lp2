public class ExecutaMediaTurma {
    public static void main(String[] args) {
        Turma turma = new Turma();
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        Prova prova = new Prova();
        //Aluno 1
        Prova prova1 = new Prova();
        prova1.setNotaParte1(3.5);
        prova1.setNotaParte2(3.0);

        aluno1.setProva1(prova1);

        Prova prova2 = new Prova();
        prova2.setNotaParte1(4.0);
        prova2.setNotaParte2(4.0);

        aluno1.setProva2(prova2);

        //Aluno 2
        Prova prova3 = new Prova();
        prova3.setNotaParte1(4.5);
        prova3.setNotaParte2(5.0);

        aluno2.setProva1(prova3);

        Prova prova4 = new Prova();
        prova4.setNotaParte1(1.5);
        prova4.setNotaParte2(1.5);

        aluno2.setProva2(prova4);

        //Aluno 3

        Prova prova5 = new Prova();
        prova5.setNotaParte1(4.5);
        prova5.setNotaParte2(3.0);

        aluno3.setProva1(prova5);

        Prova prova6 = new Prova();
        prova6.setNotaParte1(4.0);
        prova6.setNotaParte2(5.0);

        aluno3.setProva2(prova6);


        System.out.println("Media - Aluno 1 " + aluno1.calculaMedia());
        System.out.println("Media - Aluno 2 " + aluno2.calculaMedia());
        System.out.println("Media - Aluno 3 " + aluno3.calculaMedia());

        turma.setAluno1(aluno1);
        turma.setAluno2(aluno2);
        turma.setAluno3(aluno3);

        System.out.println("Media - Turma " + turma.calcularMedia());
    }
}
