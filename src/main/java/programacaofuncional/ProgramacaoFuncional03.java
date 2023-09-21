package programacaofuncional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ProgramacaoFuncional03 {

    public static void main(String[] args) {

        //criar um programa para somar valores de uma lista
        //o programa vai receber um lista e devolver a soma dos valores

        Function<List<Produto>, Double> somarValores = l -> {
            Double soma = 0.0;
            for (Produto produto: l) {
                soma+=produto.getPreco();
            }
            return soma;
        };


        List<Produto> list = new ArrayList<>();
        Produto produto = new Produto();
        produto.setNome("Pasta de dente");
        produto.setPreco(3.50);
        Produto produto1 = new Produto();
        produto1.setNome("Feijao");
        produto1.setPreco(5.50);
        list.add(produto);
        list.add(produto1);

        System.out.println("Soma valores da lista: " + somarValores.apply(list));

    }
}
