public class Report implements Printable {
    private String title;
    private String author;
    public Report(String title, String author) {
        this.title = title;
        this.author = author;
    }
    @Override
    public void print() {
        printHeader(); //zad6
        System.out.println("Raport: " + title + "\nAutor: " + author);
    }
}