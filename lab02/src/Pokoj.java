public class Pokoj {
    int numer_pokoju;
    String typ_pokoju;
    public Pokoj(int numer_pokoju,
                 String typ_pokoju) {
        this.numer_pokoju = numer_pokoju;
        this.typ_pokoju = typ_pokoju;
    }
    public void wyswietlSpecyfikacje() {
        System.out.println("Pokój nr: " + numer_pokoju + "\nTyp: " + typ_pokoju);
    }
}