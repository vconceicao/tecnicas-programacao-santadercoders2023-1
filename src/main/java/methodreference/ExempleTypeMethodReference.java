package methodreference;

import java.util.function.Function;

public class ExempleTypeMethodReference {


    public static void main(String[] args) {

        Function<String, Integer> contarCaracteres = s -> s.length();

        System.out.println(contarCaracteres.apply("Vinicius"));


        Function<String, Integer> contarCaracteresPorMethodReference = String::length;
        System.out.println(contarCaracteresPorMethodReference.apply("Teste"));

        Function<Usuario, String > retornaLoginUsuario = usuario -> usuario.getLogin();
        Usuario usuario = new Usuario("Login", "Senha");
        System.out.println(retornaLoginUsuario.apply(usuario));

        Function<Usuario, String> retornaLoginUsuarioMR = Usuario::getLogin;
        System.out.println(retornaLoginUsuarioMR.apply(usuario));


    }
}
