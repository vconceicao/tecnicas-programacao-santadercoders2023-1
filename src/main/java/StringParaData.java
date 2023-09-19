import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class StringParaData {

    public static void main(String[] args) {

        String dataString = "2023-08-09";
        String dataHoraString = "2023-08-09 14:05:01";

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatoDataHora = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");


        try {
            LocalDate localDate = LocalDate.parse(dataString, formatoData);
            LocalDateTime localDateTime = LocalDateTime.parse(dataHoraString, formatoDataHora);

            System.out.println(localDate);
            System.out.println(localDateTime);

        }catch (DateTimeParseException e){
            System.out.println("Erro ao converter a data: "+ e.getMessage());
        }

    }
}
