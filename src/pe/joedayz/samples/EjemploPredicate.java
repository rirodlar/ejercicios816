package pe.joedayz.samples;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {

    public static void main(String[] args) {
        Predicate<String> p1 = String::isEmpty;

        System.out.println(p1.test(""));
        System.out.println(p1.test("aaa"));

        BiPredicate<String, String> b1 = String::startsWith;

        System.out.println(b1.test("chicken", "c"));
    }


}
