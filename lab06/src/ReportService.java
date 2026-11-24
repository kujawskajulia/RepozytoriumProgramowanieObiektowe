public class ReportService {
    private final Database database;
    public ReportService(Database database) {
        this.database = database;
    }
    public void generateReport() {
        String report = "Raport";
        this.database.save(report);
    }
}
//1. Nie, serwis generujący raporty nie jest bazą danych- jedynie z niej korzysta aby zapisać wynik swojej pracy. Użycie extends Database łamie podstawową zasadę dziedziczenia (IS-A).
//2. Autor kodu chciał na skróty uzyskać dostęp do metody save() bez tworzenia nowego obiektu i przekazywania go do klasy. Skutkiem ubocznym takiego podejścia jest to, że ReportService dziedziczy cały interfejs publiczny Database.