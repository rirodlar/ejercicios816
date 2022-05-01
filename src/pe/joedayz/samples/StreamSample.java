package pe.joedayz.samples;

import java.util.List;
import java.util.stream.Stream;

public class StreamSample {

    public static void main(String[] args) {
        Stream<String> empty = Stream.empty();

        Stream<Integer> singleElement = Stream.of(1);

        Stream<Integer> fromArray = Stream.of(1,2,3);

        var list = List.of("a", "b", "c");

        Stream<String> fromList = list.stream();

        //concurriencia sin aprender Threads
        Stream<String> fromListParalel = list.parallelStream();

        //infinitos
        Stream<Double> ramdoms = Stream.generate(Math::random);
       // ramdoms.forEach(System.out::println);

        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n+2);
       // oddNumbers.forEach(System.out::println);

        Stream<Integer> oddNumberUnder100 = Stream.iterate(1,n->n<100, n-> n+2);

        oddNumberUnder100.forEach(System.out::println);
    }
}
