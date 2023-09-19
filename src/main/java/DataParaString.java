import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataParaString {

    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        LocalTime agora = LocalTime.now();
        LocalDate antes = LocalDate.of(-500, 01, 03);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/u G");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("hh:mm:ss a");
        DateTimeFormatter formatoPorExtenso = DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy", Locale.ITALY);

        System.out.println(hoje.format(formato));
        System.out.println(antes.format(formato));
        System.out.println(agora.format(formatoHora));
        System.out.println(hoje.format(formatoPorExtenso));


    }
}
