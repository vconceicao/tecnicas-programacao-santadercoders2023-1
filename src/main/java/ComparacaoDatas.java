import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class ComparacaoDatas {

    public static void main(String[] args) {
        LocalDate dataFutura = LocalDate.of(2023, Month.DECEMBER, 02);
        LocalDate dataAtual = LocalDate.now();


        System.out.println("A data futura é depois da data atual? "
                + dataFutura.isAfter(dataAtual));
        System.out.println("A data atual é anterior a data futura? "
                + dataAtual.isBefore(dataFutura));

        LocalDateTime dataHoraFutura = LocalDateTime.of(2023, Month.SEPTEMBER, 15, 22, 00, 00);
        LocalDateTime dataHoraAtual = LocalDateTime.now();

        System.out.println("A dataHora futura é depois da dataHora atual? "
                + dataHoraFutura.isAfter(dataHoraAtual));
        System.out.println("A dataHora atual é anterior da dataHora futura? "
                + dataHoraAtual.isBefore(dataHoraFutura));

        System.out.println("A dataHora atual é igual data atual criada manualmente? "+
                dataAtual.isEqual(LocalDate.of(2023, Month.SEPTEMBER, 18)));





    }
}
