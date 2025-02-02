package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        double valorDoCarro = 30000;

        for (int parcela = 1; parcela < valorDoCarro ; parcela++) {
            double valorParcela = valorDoCarro / parcela;

            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela: " + parcela + " no valor de R$ " + valorParcela);
        }
    }
}
