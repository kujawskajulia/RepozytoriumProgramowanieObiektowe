public class ConsoleStorage implements Storage {
    @Override
    public void save(String data) {
        System.out.println("Wypisanie w konsoli: " + data);
    }
}