package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = (int) 10000000000L;
        long numeroGrande = 100000L;
        double salarioDouble = 2000.0D;
        float salarioFloat =(float) 2500.0D;
        byte idadeByte = -128;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 62;
        String nome = "João";

        System.out.println("A idade é " + idade + " anos");
        System.out.println(falso);
        System.out.println(caractere);
        System.out.println("Oi, eu sou o " + nome);
    }
}
