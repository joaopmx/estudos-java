package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "João";
        nome.concat(" Maciel");
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("João");
        sb.append(" Maciel");
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
