package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import academy.devdojo.maratonajava.exercicios.dominio.Local;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale LocaleFR = Locale.FRANCE;
        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeBR);
        nfa[2] = NumberFormat.getInstance(localeJP);
        nfa[3] = NumberFormat.getInstance(LocaleFR);

        double valor = 1_000;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }
        String valorString = "1000.2390";
        try {
            System.out.println(nfa[0].parse(valorString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
