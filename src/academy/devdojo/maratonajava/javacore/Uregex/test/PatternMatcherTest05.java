package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // \d = retorna todos os digitos
        // \D = tudo o que não for digito
        // \s = todos espaços em branco
        // \S = todos os caracteres menos espaço em branco
        // \w = a-ZA-Z, digitos, _
        // \W = Tudo o que nao for incluso no \w
        // []
        // Ocorrencias
        // ? zero ou uma
        // * zero ou mais
        // + uma ou mais
        // {n,m} de n até m
        // ()
        // |
        // $
        // . 1.3 = 123, 133, 1@3, 1A3
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail ";

        System.out.println("Email valido");
        System.out.println("#@!zoro@mail.br".matches(regex));
        System.out.println(Arrays.toString(texto.split(",")));

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Posições encontradas");

        while (matcher.find()) {
            System.out.print(matcher.start() + " " +matcher.group()+"\n");
        }
    }
}
