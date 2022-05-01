package pe.joedayz.samples;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MetodosConvenientes {

    public static void main(String[] args) {
        Predicate<String> egg = s-> s.contains("egg");
        Predicate<String> brown = s->s.contains("brown");

        Predicate<String> brownEggsMejorado = egg.and(brown);

        Consumer<String> c1 = x-> System.out.println("1: "+x);
        Consumer<String> c2 = x-> System.out.println("1: "+x);

        Consumer<String> combined = c1.andThen(c2);

        combined.accept("annie");

        Function<Integer, Integer> before = x-> x+1;
        Function<Integer, Integer> after = x-> x*2;

        Function<Integer, Integer> combined2 = after.compose(before);

        System.out.println(combined2.apply(3));
    }
}
