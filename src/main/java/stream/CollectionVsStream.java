package stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class CollectionVsStream {

    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        integerStream.forEach(n -> System.out.println(n));
        //System.out.println(integerStream.min(Comparator.naturalOrder()).get());

        //
        System.out.println("Utilizando collections com stream");
        List<Integer> integers = List.of(2, 1, 3, 5);
        integers.stream().forEach(n -> System.out.println(n));

        System.out.println(integers.stream().min(Comparator.naturalOrder()).get());

    }
}
