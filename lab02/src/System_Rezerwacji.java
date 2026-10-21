import java.time.LocalDate;
public class System_Rezerwacji {
    Pokoj pokoj;
    Gosc gosc;
    LocalDate data_meldunku;
    LocalDate data_wyjazdu;
    public System_Rezerwacji(Pokoj pokoj,
                             Gosc gosc,
                             LocalDate data_meldunku,
                             LocalDate data_wyjazdu) {
        this.pokoj = pokoj;
        this.gosc = gosc;
        this.data_meldunku = data_meldunku;
        this.data_wyjazdu = data_wyjazdu;
    }
    public void wyswietlSzczegolyRezerwacji() {
        System.out.println("REZERWACJA:");
        System.out.println("Pokój: " + pokoj.numer_pokoju + " (Typ pokoju: " + pokoj.typ_pokoju + ")");
        System.out.println("Gość: " + gosc.imie + " " + gosc.nazwisko + " (Wiek: " + gosc.wiek + ")");
        System.out.println("Termin: od " + data_meldunku + " do " + data_wyjazdu);
    }
}
