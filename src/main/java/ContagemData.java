import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ContagemData {
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        LocalDate ontem = LocalDate.of(2023, Month.SEPTEMBER, 17);
        //Conta os dias entre datas


        long dias = ChronoUnit.DAYS.between(ontem, hoje);


        System.out.println(dias);

        LocalDateTime ontemHora = LocalDateTime.of(2023, Month.SEPTEMBER, 17, 19, 00, 00);
        LocalDateTime dataHoraHoje = LocalDateTime.now();

        long diasEntreOntemEHoje = ChronoUnit.DAYS.between(ontemHora, dataHoraHoje);

        System.out.println("Dias entre ontem e Hoje: " + diasEntreOntemEHoje);

    }
}
