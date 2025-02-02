package academy.devdojo.maratonajava.javacore.HHeranca.test;

import academy.devdojo.maratonajava.javacore.HHeranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.HHeranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.HHeranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("20240-180");

        Pessoa pessoa = new Pessoa("Joao");
        pessoa.setCpf("111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("-----------------");

        Funcionario funcionario = new Funcionario("Carlos");
        funcionario.setCpf("22222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(10000);
        funcionario.imprime();
        funcionario.relatorioPagamento();
    }
}
