package pe.joedayz.samples;

import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class EjemploConsumer {

    public static void main(String[] args) {
        Consumer<String> c1 = System.out::println;
        c1.accept("pepe");

        var map = new HashMap<String, Integer>();
        BiConsumer<String, Integer> b1 = map::put;

        b1.accept("chiken", 7);
        b1.accept("otro", 3);

        System.out.println(map);
    }
}
