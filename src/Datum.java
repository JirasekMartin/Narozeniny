import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * Pomocná třída pro jednoduchou práci s datem a časem v Javě
 *
 * @author itnetwork.cz
 */
public class Datum {
    /**
     * Udává textový formát data
     */
    private static DateTimeFormatter formatData = DateTimeFormatter.ofPattern("d.M.yyyy");

    /**
     * Zformátuje datum do textové podoby
     *
     * @param datum Datum jako instance Calendar
     * @return Textová podoba data
     */
    public static String zformatuj(LocalDate datum) {
        return formatData.format(datum);
    }

    /**
     * Naparsuje datum ze zadaného řetězce
     *
     * @param datumText Datum v textové podobě
     * @return Datum jako instance LocalDate
     * @throws DateTimeParseException
     */
    public static LocalDate naparsuj(String datumText) throws DateTimeParseException {
        return LocalDate.parse(datumText, formatData);
    }
}