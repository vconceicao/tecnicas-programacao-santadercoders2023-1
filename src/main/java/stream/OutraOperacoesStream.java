package stream;

import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

public class OutraOperacoesStream {
    public static void main(String[] args) {
        //remover elementos iguais dentro da stream
        Stream<String> produtos = Stream.of("feijao", "arroz", "feijao", "macarrao");

        produtos.distinct().forEach(p -> System.out.println(p));

        //ordenacao de valores na stream
        Stream<Integer> integerStream = Stream.of(5, 32, 1, 0);

        integerStream.sorted().forEach(n -> System.out.println(n));

        //ordenacao de valores na Stream atraves da operacao terminal forEachOrdered
        Stream<Integer> novaStream = Stream.of(32, 5, 1, 0);
        novaStream.sorted().forEachOrdered(n -> System.out.println(n));

        //maior elemento da stream
        Stream<Integer> maiorElementoStream = Stream.of(32, 5, 1, 0);
        System.out.println(maiorElementoStream.max(Comparator.naturalOrder()).get());

        //menor elemento da stream
        Stream<Integer> menorElementoStream = Stream.of(32, 5, 1, 0);
        System.out.println(menorElementoStream.min(Comparator.naturalOrder()).get());


    }
}
