package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    // Dado o valor de um carro, descubra em quantas parcelas ele pode ser parcelado
    // Condição valorPacela >= 1000
    public static void main(String[] args) {
        double valorDoCarro = 30000;

        for (int parcela = 1; parcela < valorDoCarro ; parcela++) {
            double valorParcela = valorDoCarro / parcela;

            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela: " + parcela + " no valor de R$ " + valorParcela);
        }
    }

}

