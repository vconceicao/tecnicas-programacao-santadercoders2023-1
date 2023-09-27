package methodreference;

public class MethodReferenceProgram {

    public static void getString(String string){
        System.out.println(string);
    }

    public static void main(String[] args) {

        Impressao impressaoPorLambda = s -> System.out.println(s);
        impressaoPorLambda.getNome("Teste impressao por lambda");

        Impressao impressaoPorMethodReference = MethodReferenceProgram::getString;
        impressaoPorMethodReference.getNome("Teste impressao por method reference");

    }
}
