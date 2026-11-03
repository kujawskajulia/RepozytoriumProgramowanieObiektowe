public class Report extends Document{
    private String content2;
    public Report() {
        super();
        this.content2 = "Zawartość nowa";
    }
    @Override
    public Report copy() {
        Report newReport = new Report();
        newReport.content2 = this.content2;
        return newReport;
    }
}
