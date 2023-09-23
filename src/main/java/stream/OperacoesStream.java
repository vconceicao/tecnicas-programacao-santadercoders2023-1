package stream;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class OperacoesStream {

    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);

        integerStream.map(n -> n * 2).
                filter(n -> n.equals(2))
                .map(n -> n * 10)
                .forEach(n -> System.out.println(n));

    }
}
