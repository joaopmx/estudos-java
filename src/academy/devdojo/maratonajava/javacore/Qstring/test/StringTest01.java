package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "João"; // String constant pool
        String nome2 = "João";
        nome = nome.concat(" Maciel"); // nome += " Maciel"
        String nome3 = new String("João"); // 1 variavel de referencia, 2 objeo do tipo string, 3 uma string na pool de string
        System.out.println(nome);
        System.out.println(nome == nome2);
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
