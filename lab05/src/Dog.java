public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Hau!");
    }
    public void digHole() {
        System.out.println("Pies kopie dół.");
    }
    @Override
    public String toString() {
        return "Dog";
    }
}