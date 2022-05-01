package pe.joedayz.samples;

import java.util.function.UnaryOperator;

public class EjemploUnaryOperator {

    public static void main(String[] args) {
        UnaryOperator<String> u1 = x->x.toUpperCase();

        System.out.println(u1.apply("ricardo"));
    }
}
