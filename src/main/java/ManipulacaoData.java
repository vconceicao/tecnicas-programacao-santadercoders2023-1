import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class ManipulacaoData {
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        var amanha = hoje.plusDays(1);
        System.out.println(amanha);
        var maisUmaSemana = hoje.plusWeeks(1);
        System.out.println(maisUmaSemana);
        System.out.println(hoje.plusDays(7));

        LocalDate janeiro = LocalDate.of(2023, 01, 01);
        LocalDate fevereiro = LocalDate.of(2023, 02, 01);
        System.out.println(janeiro.plusDays(30));
        System.out.println(janeiro.plusMonths(1));

        System.out.println(fevereiro.plusMonths(1));
        System.out.println(fevereiro.plusDays(28));


        System.out.println("Somando 1 ano a data "+ hoje.plusYears(1));


        LocalDateTime dataHoraAtual = LocalDateTime.now();
        System.out.println("Diminuindo em uma 1 hora:" + dataHoraAtual.minusHours(1));
        System.out.println("Diminuindo em 2 dias:" + dataHoraAtual.minusDays(2));

        System.out.println("Diminuindo em 2 dias e 1 hora com chamada encadeada " + dataHoraAtual.minusDays(2).minusHours(1));

        //Periodo
        Period periodoDeUmAnoETresMeses = Period.of(1, 3, 0);

        System.out.println("Somando um periodo " + dataHoraAtual.plus(periodoDeUmAnoETresMeses));
        System.out.println("Subtrair um periodo " + dataHoraAtual.minus(periodoDeUmAnoETresMeses));


    }
}
