package academy.devdojo.maratonajava.exercicios.test;

import academy.devdojo.maratonajava.exercicios.dominio.Aluno;
import academy.devdojo.maratonajava.exercicios.dominio.Local;
import academy.devdojo.maratonajava.exercicios.dominio.Professor;
import academy.devdojo.maratonajava.exercicios.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua guilherme Marconi");
        Professor professor = new Professor("Jurema", "Fisica");
        Aluno aluno = new Aluno("João", 16);
        Aluno aluno2 = new Aluno("David", 17);
        Aluno[] alunosParaSeminario = {aluno, aluno2};
        Seminario seminario = new Seminario("Fisica quatica", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
