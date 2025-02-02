package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeJapan = new Locale("ja", "JP");
        Locale localeBrasil = new Locale("pt", "BR");
        Calendar calendar = Calendar.getInstance();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeBrasil);
        System.out.println("Japão " + df.format(calendar.getTime()));
        System.out.println("Brasil " + df2.format(calendar.getTime()));

        System.out.println(localeJapan.getDisplayCountry(localeJapan));
    }
}
