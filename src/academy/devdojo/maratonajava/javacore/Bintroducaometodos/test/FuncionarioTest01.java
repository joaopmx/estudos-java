package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("João");
        funcionario.setIdade(26);
        funcionario.setSalarios(new float[]{3500, 2800, 4200});

        funcionario.imprimeDados();
    }
}
