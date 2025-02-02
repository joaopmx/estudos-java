package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // Imprima o dia da semana, considerando 1 como domingo

        byte dia = 32;

        // char, int, byte, short, enum, String

        switch (dia) {
            case 1:
                System.out.println("Dom");
                break;
            case 2:
                System.out.println("Seg");
                break;
            case 3:
                System.out.println("Ter");
                break;
            case 4:
                System.out.println("Qua");
                break;
            case 5:
                System.out.println("Qui");
                break;
            case 6:
                System.out.println("Sex");
                break;
            case 7:
                System.out.println("Sab");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }

        char sexo = 'M';

        switch (sexo) {
            case 'M':
                System.out.println("Mulher");
                break;
            case 'H':
                System.out.println("Homem");
                break;
            default:
                System.out.println("Inválido");
        }
     }
}
