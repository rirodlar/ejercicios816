package pe.joedayz.samples;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleToIntFunction;
import java.util.function.Predicate;

public class TraditionalSearch {
    public static void main(String[] args) {
//        var animals  = new ArrayList<Animal>();
//        animals.add(new Animal("fish", false, true));
//        animals.add(new Animal("kangaroo", true, true));
//        animals.add(new Animal("rabbit", true, false));
//        animals.add(new Animal("turtle", false, true));
//
//        print(animals, animal -> animal.isCanHop());
//
//        print(animals, a -> !a.isCanSwim());

        final Predicate keyEventDispatcher = x -> true;
        Predicate<String> p1 = (var x) -> true;
        Predicate<String> p2 = (String x) -> {return true;};
        Predicate<String> p3 = (String x) ->  true;


      //  (a,b) -> {int c = 0; return 5;};



        test(x-> x>2, 123);
    }

    public static void test(Predicate<Integer> c, int num){

        c.test(num);
    }


    private static void print(List<Animal> animals, Predicate<Animal> checker){
        for (Animal animal: animals) {
            if (checker.test(animal))
                System.out.println(animal + " ");
        }
    }

//    public void counts(List<Integer> list){
//        list.sort( (var x , var y) -> x.compareTo(y));
//    }

//    public void variables(int a){
//        int b=1;
//        Predicate<Integer> p1 = a1 -> {
//            int b1 = 0;
//            int c = 0;
//            return b1 == c;
//        };
//    }


}
