package stream;

import java.util.Collections;
import java.util.stream.Stream;

public class OutrasFormasStream {

    public static void main(String[] args) {
        //Colecao vazia
        Collections.emptyList();

        //Stream  vazia
        Stream.empty().forEach(n -> System.out.println(n));


    }
}
