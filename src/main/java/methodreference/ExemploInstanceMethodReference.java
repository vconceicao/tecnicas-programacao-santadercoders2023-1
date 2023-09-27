package methodreference;

public class ExemploInstanceMethodReference {

    public static void main(String[] args) {

        Verificador verificadorPorLambda = n -> n%2==0;
        System.out.println(verificadorPorLambda.verificaSeEhPar(2));

        var instanceMethodReference = new ExemploInstanceMethodReference();
        Verificador verificadorPorMethodReference = instanceMethodReference::verifica;
        System.out.println(verificadorPorMethodReference.verificaSeEhPar(25));
    }

   public boolean verifica(Integer numero){
        return numero%2==0;
   }
}
