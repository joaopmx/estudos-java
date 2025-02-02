package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salario = 35000;
        String resultado;

        if (salario > 0 && salario <= 34712) {
            resultado = "Voce tem que pagar 9.70% de taxa";
        } else if (salario >= 34713 && salario <= 68507) {
            resultado = "Voce tem que pagar 37.35% de taxa";
        } else {
            resultado = "Voce tem que pagar 49.50% de taxa";
        }

        System.out.println(resultado);
    }
}
