import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Třída reprezentuje osobu
 * @author itnetwork.cz
 */
public class Osoba {
    /**
     * Datum narození
     */
    private LocalDate narozeniny;

    /**
     * Inicializuje novou instanci
     *
     * @param narozeniny Datum narození
     */
    public Osoba(LocalDate narozeniny) {
        this.narozeniny = narozeniny;
    }

    /**
     * Spočítá věk osoby k aktuálnímu datu
     *
     * @return Věk osoby
     */
    public int spoctiVek() {
        LocalDate dnes = LocalDate.now();
        int vek = (int) narozeniny.until(dnes, ChronoUnit.YEARS);
        return vek;
    }

    /**
     * Spočítá počet zbývajících dní do dalších narozenin osoby
     *
     * @return Počet dní do dalších narozenin
     */
    public int zbyvaDni() {
        LocalDate dnes = LocalDate.now();
        LocalDate dalsiNarozeniny = narozeniny.withYear(dnes.getYear());
        if (dalsiNarozeniny.isBefore(dnes)) {
            dalsiNarozeniny = dalsiNarozeniny.plusYears(1);
        }
        int dniDoNarozenin = (int) dnes.until(dalsiNarozeniny, ChronoUnit.DAYS);
        return dniDoNarozenin;
    }

    /**
     * Getter pro narozeniny, není to však třeba.
     *
     * @return Vrátí narozeniny osoby
     */
    public LocalDate getNarozeniny() {
        return narozeniny;
    }

    /**
     * Setter pro narozeniny, není to však třeba.
     *
     * @param narozeniny Nastaví narozeniny osobě
     */
    public void setNarozeniny(LocalDate narozeniny) {
        this.narozeniny = narozeniny;
    }
}