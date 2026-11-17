import java.sql.SQLOutput;

public class Main {
    static void main(){
        //zadanie1();
        //zadanie2();
        //zadanie3();
        //zadanie4();
        //zadanie5();
        //zadanie6();
        //zadanie9();
        //zadanie10();
        //zadanie11();
        //zadanie12();
        zadanie13();
    }
    static void zadanie1(){
        Animal first = new Dog();
        Animal second = new Cat();
        first.makeSound();
        second.makeSound();
        //1. Typem referencji jest Animal.
        //2. Rzeczywistym typem jest Dog.
        //3. Wersja z klasy Dog.
        //4. Nie
    }
    static void zadanie2(){
        Animal[] animals = {
                new Dog(),
                new Cat(),
                new Cow(),
                new Sheep(),
                new Animal()
        };
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
    public static void presentAnimal(
            Animal animal
    ) {
        System.out.println(animal);
        animal.makeSound();
    }
    static void zadanie3(){
        presentAnimal(new Dog());
        presentAnimal(new Cat());
        presentAnimal(new Cow());
    }
    static void zadanie4(){
        Employee[] employees = {
                new Developer(
                        "Ola",
                        15000
                ),
                new Tester(
                        "Karolina",
                        40,
                        160
                ),
                new Manager(
                        "Julian",
                        10000,
                        2500
                ),
                new Administrator(
                "Jola",
                11000,
                500,
                        8
        )
        };
        for (Employee employee : employees) {
            employee.showInformation();
        }
    }
    static void zadanie5(){
        Dog dog = new Dog();
        Animal animal = dog;
        dog.makeSound();
        animal.makeSound();
        dog.setName("Burek");
        System.out.println(animal.getName());
        System.out.println(animal);
        //Nie, jedynie kopiuje adres pamięci do nowej zmiennej.
    }
    static void zadanie6(){
        Animal first = new Dog();
        Animal second = new Cat();
        Dog dog = (Dog) first;
        dog.digHole();
        Cat cat = (Cat) second;
        cat.climb();
        //Dog wrongDog = (Dog) second;
    }
    public static void specialAction(Animal animal) {
        if (animal instanceof Dog dog) {
            dog.digHole();
        } else if (animal instanceof Cat cat) {
            cat.climb();
        } else {
            System.out.println(
                    "Brak specjalnej akcji."
            );
        }
    }
    static void zadanie9(){
        Parent object = new Child();
        System.out.println(object.value);
        System.out.println(object.getValue());
        //object.value wypisze "Parent", poniewaz odwołania do pól są rozstrzygane na etapie kompilacji na podstawie typu referencji
        //object.getValue() wypisze "Child", poniewaz wywołania metod zachodzą na podstawie rzeczywistego typu obiektu
    }
    static void identify(Animal animal) {
        System.out.println("Animal");
    }
    static void identify(Dog dog) {
        System.out.println("Dog");
    }
    static void zadanie10(){
        Animal animal = new Dog();
        identify(animal);
        animal.makeSound();
        //1. Kompilator wybierze wersję identify (Animal animal)
        //2. JVM wykona wersję z klasy Dog i wypisze "Hau!"
        //3. Wybór identify(animal)- Kompilator nie uruchamia kodu, więc nie wie co dokładnie powstanie w pamięci- widzi tylko, że zmienna "animal" została zadeklarowana jako typ Animal
        // Wybór animal.makeSound() odbywa się dopiero w trakcie działania programu. Gdy program już działa, ustalane jset jaki obiekt naprawdę znajduje się w pamięci, a poniewaz w pamięci jest pies, uruchamia się jego własna wersja metody makeSound()
    }
    static void zadanie11(){
        Animal animal = new GuideDog();
        System.out.println(animal instanceof Animal); //true
        System.out.println(animal instanceof Dog); //true
        System.out.println(animal instanceof GuideDog); //true
        System.out.println(animal.getClass() == Animal.class); //false
        System.out.println(animal.getClass() == Dog.class); //false
        System.out.println(animal.getClass() == GuideDog.class); //true
    }
    static void zadanie12(){
        Payment[] payments = {
                new Payment(),
                new CardPayment(),
                new BlikPayment(),
                new TransferPayment()
        };
        for (Payment payment : payments) {
            payment.pay(99.99);
        }
    }
    public static void printShape(Shape shape) {
        System.out.println("Figura: " + shape.getName() + "\npole: " + shape.area());
    }
    static void zadanie13(){
        Shape[] shapes = {
                new Circle(2.0),
                new Rectangle(2.0, 3.0),
                new Triangle(2.0, 3.0)
        };
        for (Shape shape : shapes) {
            printShape(shape);
        }
    }
}
