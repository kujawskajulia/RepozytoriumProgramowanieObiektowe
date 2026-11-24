public interface Printable {
    void print();
    default void printHeader() {
        System.out.println("NAGŁÓWEK"); //zad6
    }
}