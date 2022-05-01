package pe.joedayz.internalizacion;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Internacionalizacion {

    public static void main(String[] args) {

        Locale locale = Locale.getDefault();
        System.out.println(locale);

        System.out.println(new Locale("hi", "IN"));

//        Locale l1 = new Locale.Builder()
//                .setLanguage("de")
//                .setRegion("DE")
//                .build();
//
//        Locale.setDefault(l1);

        System.out.println(Locale.getDefault());

        System.out.println(NumberFormat.getCurrencyInstance());

        double price = 48;
        var myLocale = NumberFormat.getCurrencyInstance();
        System.out.println(myLocale.format(price));
        //Locale (lenguaje) FR
        //Locale (languaje, country)  en_US

        double d = 1234567.467;
        NumberFormat f1 = new DecimalFormat("###,###,###,###.000");
        System.out.println(f1.format(d));
    }
}
