package app;
import animals.Cat;
import animals.Dog;
public class main {
        static void main() {
                Dog dog = new Dog("burek", 12);
                Cat cat = new Cat("Tofik", 22);
                dog.makeSound();
                cat.makeSound();
        }
}