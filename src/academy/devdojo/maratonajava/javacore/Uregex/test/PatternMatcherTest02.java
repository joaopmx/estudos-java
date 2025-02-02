package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = retorna todos os digitos
        // \D = tudo o que não for digito
        // \s = todos espaços em branco
        // \S = todos os caracteres menos espaço em branco
        // \w = a-ZA-Z, digitos, _
        // \W = Tudo o que nao for incluso no \w
        String regex = "\\W";
//        String texto = "abaaba";
        String texto2 = "&%h3_jkj 3hk43hj";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  " + texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Posições encontradas");

        while (matcher.find()) {
            System.out.print(matcher.start() + " " +matcher.group()+"\n");
        }
    }
}
