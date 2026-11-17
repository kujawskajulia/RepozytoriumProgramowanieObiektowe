public class Animal {
    private String name = "Brak imienia"; //do zadania 5
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void makeSound() {
        System.out.println(
                "Zwierzę wydaje dźwięk."
        );
    }
}