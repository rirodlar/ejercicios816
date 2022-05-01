package pe.joedayz.samples;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OperacionesComunesStream {

    public static void main(String[] args) {
//        Stream<String> str1 = Stream.of("A", "B", "C");
//
//        System.out.println(str1.count());
//        Stream<String> strs2 = Stream.of("monkey", "ape", "bonobo");
//
//        Optional<String> minimo = strs2.min((s1, s2) -> s1.length() - s2.length());
//        minimo.ifPresent(System.out::println);


        var list = List.of("monkey","2","chimp");
        Predicate<String> pred = x-> Character.isLetter(x.charAt(0));

        System.out.println(list.stream().anyMatch(pred));


//        Stream<String> stream = Stream.of("w","o","l","f");
//        String word = stream.reduce("", (s,c) -> s+c);
//
//        Stream<String> stream2 = Stream.of("w","o","l","f");
//        Optional<String> word2 = stream2.reduce(String::concat);
//        word2.ifPresent(System.out::println);
//
//        Stream<Integer> stream3 = Stream.of(3,5,6);
//        System.out.println(stream3.reduce(0, (a, b)-> a+b));

//        Stream<String> stream4 = Stream.of("A","BB","CCC");
//        Integer length = stream4.reduce(0,(i,s)-> i+s.length(), (a,b)-> a+b);
//        System.out.println(length);

    //collect
        Stream<String> stream = Stream.of("w","o","l","f","f");
        Set<String> collect = stream.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(collect);

        Stream<String> stream2 = Stream.of("w","o","l","f","f");
        Set<String> collect2 = stream2.collect(Collectors.toSet());
        System.out.println(collect2);
    }

}
