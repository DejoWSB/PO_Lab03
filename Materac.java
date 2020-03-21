import java.util.Objects;

/** Klasa reprezentująca materac.
 * @author 
 * @version 1.0
 */
public class Materac {
    /** Pole String reprezentujący kolor materaca.
     */
    private String kolor;
    /** Pole int reprezentujący wagę w kg materaca.
     */
    private int wagaKg;
    /** Pole int reprezentujący czy  materac sprężynowy.
     */
    private boolean sprezynowy;

    /** Konstruktor domyślny obiektu typu materac.
     */
    public Materac() {
        this.kolor = "Biały";
        this.wagaKg = 50;
        this.sprezynowy = true;
    }

    /** Konstruktor z parametrami obiektu typu materac.
     * @param kolor String przechowujący kolor materaca.
     * @param wagaKg Int przechowujący wagę w kg materaca.
     * @param sprezynowy Int przechowujący ilość sprężyn materaca.
     */
    public Materac(String kolor, int wagaKg, boolean sprezynowy) {
        this.kolor = kolor;
        this.wagaKg = wagaKg;
        this.sprezynowy = sprezynowy;
    }
    /** Metoda zwracająca kolor materaca.
     * @return String reprezentujący zwracany kolor materaca.
     */
    public String getKolor() {
        return kolor;
    }

    /** Metoda ustawiająca kolor materaca na podany parametr.
     * @param kolor String przechowujący ustawiany kolor materaca.
     */
    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    /** Metoda zwracająca wagę w kg materaca.
     * @return Int reprezentujący zwracaną wagę w kg materaca.
     */
    public int getWagaKg() {
        return wagaKg;
    }

    /** Metoda ustawiająca wagę w kg mwateraca na podany parametr.
     * @param wagaKg Int przechowujący ustawianą wagę w kg materaca.
     */
    public void setWagaKg(int wagaKg) {
        this.wagaKg = wagaKg;
    }

    /** Metoda zwracająca ilość sprężyn materaca.
     * @return boolean czy jest spręzynowy.
     */
    public boolean isSprezynowy() {
        return sprezynowy;
    }

    /** Metoda ustawiająca ilość sprężyn materaca na podany parametr.
     * @param sprezynowy Int przechowujący ustawianą ilość sprężyn.
     */
    public void setSprezynowy(boolean sprezynowy) {
        this.sprezynowy = sprezynowy;
    }

    /** Nadpisana metoda toString() klasy Object.
     * @return String wypisujący pola obiektu typu materac.
     */
    @Override
    public String toString() {
        return "Materac{" +
                "kolor='" + kolor + '\'' +
                ", wagaKg=" + wagaKg +
                ", sprężynowy=" + sprezynowy +
                '}';
    }

    /** Nadpisana metoda equals() klasy Object.
     * @param o Object porównywany do obiektu typu materac.
     * @return Boolean wynik prównania obiektu podanego poprzez parametr z obiektem typu materac.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Materac materac = (Materac) o;
        return wagaKg == materac.wagaKg &&
                sprezynowy == materac.sprezynowy &&
                Objects.equals(kolor, materac.kolor);
    }

    /** Nadpisana metoda hashCode() klasy Object
     * @return Int reprezentujacy unikalny kod obiektu typu materac.
     */
    @Override
    public int hashCode() {
        return Objects.hash(kolor, wagaKg, sprezynowy);
    }
}
