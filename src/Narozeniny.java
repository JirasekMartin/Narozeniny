import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


/**
 * @author itnetwork.cz
 */
public class Narozeniny {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadej datum narození: ");
        String datumText = scanner.nextLine();
        LocalDate datumNarozeni;
        // výjimka (try-catch) při chybě parsování nesprávného data. Pro splnění úlohy to není potřeba
        try {
            datumNarozeni = Datum.naparsuj(datumText);
            Osoba osoba = new Osoba(datumNarozeni);
            int vek = osoba.spoctiVek();
            int dni = osoba.zbyvaDni();
            System.out.printf("Je ti %d let a narozeniny máš za %d dní.", vek, dni);
        } catch (DateTimeParseException ex) {
            System.err.println("Chybně zadané datum.");
        }
    }
}