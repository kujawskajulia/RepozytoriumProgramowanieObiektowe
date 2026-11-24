public class Main {
    static void main(){
        //zadanie1i2();
        //zadanie4();
        //zadanie5();
        //zadanie6();
        //zadanie7();
        //zadanie12();
        zadanie14();
    }
    static void zadanie1i2(){
        Shape[] shapes = {
                new Circle(5.0),
                new Rectangle(4.0, 5.0),
                new Triangle(4.0, 5.0)
        };
        for (Shape shape : shapes) {
            shape.printInformation();
        }
    }
    static void zadanie4(){
        Printable[] elements = {
                new Invoice("FV/22/11/2026", 120.00),
                new Report("Analiza sprzedaży", "Julia Kulik"),
                new Ticket("Koncert", 15)
        };
        for (Printable element : elements) {
            element.print();
        }
    }
    static void zadanie5(){
        Reportzad5 fullReport = new Reportzad5("Raport Roczny 2026");
        Printablezad5 printable = fullReport;
        printable.print();
        //printable.exportToPdf();
        //printable.saveToDatabase();

        Exportablezad5 exportable = fullReport;
        exportable.exportToPdf();
        //exportable.print();
        //exportable.saveToDatabase();

        Savablezad5 savable = fullReport;
        savable.saveToDatabase();
        //savable.print();
        //savable.exportToPdf();

        fullReport.print();
        fullReport.exportToPdf();
        fullReport.saveToDatabase();
    }
    static void zadanie6(){
        Printable report = new Report("Sprzedaż", "Marek Marek");
        Printable invoice = new Invoice("FV/23/11/2026", 32000.00);
        report.printHeader();
        report.print();
        invoice.printHeader();
        invoice.print();
    }
    static void zadanie7(){
        C object = new C();
        object.hello();
    }
    //Zad 9: Projekt jest lepszy, bo klasa Bird ma tylko to co robi każdy ptak, a interfejs Flyable przypinamy tylko tym, którzy faktycznie latają
    static void zadanie12(){
        OrderService cardOrder = new OrderService(new CardPayment());
        cardOrder.checkout(150.00);
        OrderService blikOrder = new OrderService(new BlikPayment());
        blikOrder.checkout(99.99);
        OrderService transferOrder = new OrderService(new TransferPayment());
        transferOrder.checkout(42.50);
    }
    static void zadanie14(){
        ReportServicezad14 dbReportService = new ReportServicezad14(new DatabaseStorage());
        dbReportService.generateReport();
        ReportServicezad14 fileReportService = new ReportServicezad14(new FileStorage());
        fileReportService.generateReport();
        ReportServicezad14 consoleReportService = new ReportServicezad14(new ConsoleStorage());
        consoleReportService.generateReport();
    }
}
