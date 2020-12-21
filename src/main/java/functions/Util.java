package functions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Util {

    public static LocalDate StringToDate(String date) {
        LocalDate ld;
        String date1 = date;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        ld = LocalDate.parse(date1, formatter);
        return ld;
    }

    public static boolean isValid(String date) {
        try {
            new SimpleDateFormat("dd/mm/yyyy").parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

}
