package academy.devdojo.maratonajava.introducao;

/*
Prática

Crie variáveis para os campos descritos abaixo entre < > e imprima a
seguinte mensagem:

Eu <nome>, morando no endereço <endereco>,
confirmo que recebi o salário de <salario>. na data <data>

*/

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "João";
        String endereco = "Rua Guilherme Marconi";
        float salario = 2000;
        String dataRecebimentoSalario = "28/10/2024";

        System.out.println("Eu " + nome + ", morando no endereço " + endereco
        + ", confirmo que recebi o salário de " + salario + ", na data " + dataRecebimentoSalario);
    }
}
