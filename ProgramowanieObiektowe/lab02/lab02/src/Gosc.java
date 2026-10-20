public class Gosc {
    String imie;
    String nazwisko;
    int wiek;
    public Gosc(String imie,
                String nazwisko,
                int wiek){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }
    public void przedsatwGoscia(){
        System.out.println("Wpisany w rejestr gość\nImie i nazwisko: " + imie + " " + nazwisko + "\n" + "Wiek:" + wiek);
    }
}
