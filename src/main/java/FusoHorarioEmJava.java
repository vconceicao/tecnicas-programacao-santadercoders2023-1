import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class FusoHorarioEmJava {

    public static void main(String[] args) {
        for (String zoneId : ZoneId.getAvailableZoneIds()) {
            System.out.println(zoneId);
        }

        System.out.println(ZoneId.getAvailableZoneIds().size());

        LocalDateTime hojeAgora = LocalDateTime.now();
        System.out.println(hojeAgora);


        ZonedDateTime dataHoraAtualComFusoHorario = ZonedDateTime.now();
        System.out.println("Data e hora em Sao Paulo " + dataHoraAtualComFusoHorario);
        ZonedDateTime dataHoraAtualEmParis = dataHoraAtualComFusoHorario.withZoneSameInstant(ZoneId.of("Europe/Paris"));
        System.out.println("Data e hora em Paris " + dataHoraAtualEmParis);


    }
}
