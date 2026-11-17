public class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Muu!");
    }
    @Override
    public String toString() {
        return "Cow";
    }
}