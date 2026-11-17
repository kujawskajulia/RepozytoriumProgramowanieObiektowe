public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Miau!");
    }
    public void climb() {
        System.out.println("Kot wspina się na drzewo.");
    }
    @Override
    public String toString() {
        return "Cat";
    }
}