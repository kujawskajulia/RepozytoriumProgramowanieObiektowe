public class ReportServicezad14 {
    private final Storage storage;
    public ReportServicezad14(Storage storage) {
        this.storage = storage;
    }
    public void generateReport() {
        String report = "Raport";
        this.storage.save(report);
    }
}