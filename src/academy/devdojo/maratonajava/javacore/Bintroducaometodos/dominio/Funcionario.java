package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private float[] salarios;
    private float mediaSalario;

    public void imprimeDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            System.out.println("salario: R$ " + salario);
        }

        calculaMediaSalarios();
    }

    public void calculaMediaSalarios() {
        if (salarios == null) {
            return;
        }

        for (float salario : salarios) {
            mediaSalario += salario;
        }

        mediaSalario /= salarios.length;

        System.out.println("A média dos salários é: R$ " + mediaSalario);
    }

    public float getMediaSalario() {
        return mediaSalario;
    }

    public float[] getSalarios() {
        return salarios;
    }

    public void setSalarios(float[] salarios) {
        this.salarios = salarios;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
