package pe.joedayz.samples;

import java.util.Optional;

public class OptionalSamples {

    public static void main(String[] args) {
            String value = "1";

            Optional o = Optional.ofNullable(value);

        System.out.println(o);

       Optional<Double> opt4 =  average(1);
        System.out.println(opt4.orElseThrow(()-> new IllegalArgumentException("x")));
    }

    public static Optional<Double> average(int... scores){
        if(scores.length == 0) return Optional.empty();

        int sum = 0;
        for(int score: scores)
            sum+= score;

        return Optional.of((double)sum/scores.length);

    }
}
