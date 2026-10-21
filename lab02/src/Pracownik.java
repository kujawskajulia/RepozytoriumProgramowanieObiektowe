public class Pracownik {
    String imie;
    String nazwisko;
    int godzinyPracy;
    public Pracownik(String imie,
                     String nazwisko,
                     int godzinyPracy){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.godzinyPracy = godzinyPracy;
    }
    public void wymiarGodzin(){
        int etat = 160;
        if (godzinyPracy>etat){
            int nowe = godzinyPracy - etat;
            System.out.println("Wykryto " + nowe + " godzin nadgodzin u pracownika: " + imie + " " + nazwisko);
        }
        else{
            System.out.println("Pracownik: " + imie + " " + nazwisko + " posiada rekomendowany wymiar godzin");
        }
    }
}
