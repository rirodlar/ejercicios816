package pe.joedayz.samples;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalExample {

    public static void main(String[] args) {
        String value = null;

        Optional<String> opt2 = Optional.ofNullable(value);
        Supplier s = () -> 42;

        opt2.ifPresent(System.out::println);
        Optional<Double> opt3 = Optional.of(3.0);
        System.out.println( opt3.orElseGet(Math::random));
       // System.out.println( opt2.orElseGet(s));

        opt2.orElseThrow();
        //System.out.println(o2.get());
    }
}
