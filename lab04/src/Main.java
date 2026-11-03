public class Main {
    static void main(){
        //zadanie3();
        //zadanie4();
        //zadanie7();
        //zadanie8();
        zadanie10();
    }

    static void zadanie3(){
        Car car = new Car("Toyota", "Corolla", 5);
        car.showInformation();
    }
    static void zadanie4(){
        new C();
    }
    static void zadanie7(){
        Laptop laptop = new Laptop("Lenovo", 32, 70);
        laptop.turnOn();
        laptop.amountRam();
        laptop.checkBattery();
    }
    static void zadanie8(){
        Book book = new Book("Andrzej", "Andrzej Kot", 2000);
        System.out.println(book);
        System.out.println("Klasa obiektu: " + book.getClass());
    }
    static void zadanie10(){
        Report original = new Report();
        Report cloned = original.copy();
    }
}
