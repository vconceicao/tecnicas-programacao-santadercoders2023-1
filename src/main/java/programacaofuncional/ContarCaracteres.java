package programacaofuncional;

@FunctionalInterface
public interface ContarCaracteres<T, U> {

    U contar(T palavra);
}
