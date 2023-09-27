package methodreference;

public class ExemploStaticMethodReference {

    public static boolean verifica(Integer numero){
        return numero%2==0;
    }

    public static void main(String[] args) {
        Verificador verificadorPorLambda = n -> n%2==0;
        System.out.println(verificadorPorLambda.verificaSeEhPar(2));

        Verificador verificadorPorMethodReference = ExemploStaticMethodReference::verifica;
        System.out.println(verificadorPorMethodReference.verificaSeEhPar(10));

    }

}
