package pe.joedayz.samples;

import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class EjemploFunction {

    public static void main(String[] args) {
        Function<String,Integer> f1 = String::length;

        System.out.println(f1.apply("cluck"));

        BiFunction<String,String, String> b1 = String::concat;
        System.out.println(b1.apply("r", "i"));

        Function<String, String> u1 = String::toUpperCase;

    }
}
