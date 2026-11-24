public class Reportzad5 implements Printablezad5, Exportablezad5, Savablezad5 {
    private String title;
    public Reportzad5(String title) {
        this.title = title;
    }
    @Override
    public void print() {
        System.out.println("Drukowanie raportu: " + title);
    }
    @Override
    public void exportToPdf() {
        System.out.println("Eksportowanie raportu " + title);
    }
    @Override
    public void saveToDatabase() {
        System.out.println("Zapisywanie raportu " + title);
    }
}