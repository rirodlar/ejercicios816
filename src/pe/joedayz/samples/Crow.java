package pe.joedayz.samples;

import java.util.function.Predicate;

public class Crow {
    private String color;

    public  void caw(String name){
        String volume = "loudly";

        Predicate<String> p = s -> (name + volume +color).length() == 10;
    }
}
