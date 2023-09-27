package methodreference;

public class ExemploConstructorMethodReference {

    public static void main(String[] args) {

        String login = "";
        String senha= "";
        Usuario usuario = new Usuario(login, senha);

        BaseDeDados baseDeDados = () -> new Usuario();
        Usuario usuario1 = baseDeDados.getUsuario();
        System.out.println(usuario1);

        BaseDeDados baseDeDadosPorMethodReference = Usuario::new;
        System.out.println(baseDeDadosPorMethodReference.getUsuario());


        BaseDeDadosSegundoConstrutor bds = (lg , se) -> new Usuario(lg, se);
        System.out.println(bds.getUsuario("Teste", "teste").getLogin());

        BaseDeDadosSegundoConstrutor bdsMr = Usuario::new;
        System.out.println(bdsMr.getUsuario("Teste1", "teste").getSenha());

    }
}
