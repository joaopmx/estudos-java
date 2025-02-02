package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double 0
        // char '\u0000' ' '
        // boolean false
        // String null

        String[] nomes = new String[3];
        nomes[0] = "Kurosaki";
        nomes[1] = "Goku";
        nomes[2] = "Luffy";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
