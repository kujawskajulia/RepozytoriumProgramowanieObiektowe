public class InitializationDemo {
    private static int statyczne;
    private int instancji;
    static {
        System.out.println("Blok statyczny"); //1
        statyczne = 1;
    }
    {
        System.out.println("Blok instancyjny"); //2
    }
    public InitializationDemo(){
        System.out.println("Konstruktor"); //3
    }
}
