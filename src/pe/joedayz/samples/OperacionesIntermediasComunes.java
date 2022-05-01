package pe.joedayz.samples;

import javax.sound.midi.Soundbank;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class OperacionesIntermediasComunes {

    public static void main(String[] args) {
//        Stream<String> s = Stream.of("monkey","gorilla", "bonobo");
//        s.filter(x->x.startsWith("m")).forEach(System.out::println);
//
//        Stream<String> d = Stream.of("d","d","d");
//        d.distinct().forEach(System.out::println);
//
//      //  infinito
//        Stream<Integer> ss = Stream.iterate(1, n-> n+1);
//        ss.skip(5).limit(2).forEach(System.out::println);

        //map -> transforma lo que viene del stream
//        Stream<String> sss = Stream.of("monkey","gorilla", "bonobo");
//        sss.map(String::length).forEach(System.out::println);

        //flatMap -extractor
//        List<String> zero = List.of();
//        var one = List.of("Bonobo");
//        var two = List.of("Mama gorila", "baby Gorila");
//
//        Stream<List<String>> animales = Stream.of(zero, one, two);
//        animales.flatMap(m-> m.stream()).forEach(System.out::println);

    //    Stream<String> s = Stream.of("z","y");
//        s.sorted().forEach(System.out::println);
      //  s.sorted(Comparator.reverseOrder()).forEach(System.out::println);
   //peek
        Stream<String> stream = Stream.of("black bear", "brown bear", "grizzly");
        long l = stream.filter(s-> s.startsWith("b")).peek(System.out::println).count();
        System.out.println(l);
    }
}
