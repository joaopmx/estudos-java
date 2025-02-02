package academy.devdojo.maratonajava.javacore.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        // Regra de bits
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 100;
        char charP = 'W';
        boolean booleanP = false;

        // Para virar um wrapper trocar a letra inicial por maiscula
        // com exceção do int e do char
        // Regras de polimorfismo, são objetos
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; // autoboxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW; // unboxing
        Integer intW2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean("TRue");
        System.out.println(verdadeiro);
    }
}
