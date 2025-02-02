package academy.devdojo.maratonajava.javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());

        ResourceBundle bundle = ResourceBundle.getBundle("mensagens", new Locale("pt", "BR"));
        boolean ddd = bundle.containsKey("ddd");
        System.out.println(ddd);

        System.out.println(bundle.getString("ola"));
        System.out.println(bundle.getString("bom.dia"));

        bundle = ResourceBundle.getBundle("mensagens", new Locale("en", "US"));
        System.out.println(bundle.getString("ola"));
        System.out.println(bundle.getString("bom.dia"));

        //Locale("fr", "CA");
        //messages_fr_CA.properties
        //messages_fr.properties
        //messages_pt_BR.properties
        //messages_pt.properties
        //messages.properties
        System.out.println(bundle.getString("hi"));
    }
}
