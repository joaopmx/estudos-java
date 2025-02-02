package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo

        byte diaDaSemana = 33;

        switch (diaDaSemana) {
            case 1:
                System.out.println("É final de semana!");
                break;
            case 2:
                System.out.println("É dia útil");
                break;
            case 3:
                System.out.println("É dia útil");
                break;
            case 4:
                System.out.println("É dia útil");
                break;
            case 5:
                System.out.println("É dia útil");
                break;
            case 6:
                System.out.println("É dia útil");
                break;
            case 7:
                System.out.println("É final de semana!");
                break;
            default:
                System.out.println("dia inválido!");
        }
    }
}
