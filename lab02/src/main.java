import java.time.LocalDate;
public class main{
    static void main(){
        //zadanie1();
        //zadanie2();
        //zadanie4i5();
        //zadanie6();
        //zadanie7();
        //zadanie8();
        //zadanie9();
        //zadanie10();
        //zadanie11();
        zadanie12();
    }
    static void zadanie1(){
        Dog dog = new Dog("Burek", "Jamink", 12);
        dog.bark();
        dog.ShowInformation();
    }
    static void zadanie2(){
        Point p1 = new Point(2,3);
        System.out.println(p1.distance(4, 5));

    }
    static void zadanie3(){
        Book pierwsza = new Book();

        Book druga = new Book("Kot w Butach", "Jan Kowalski");

        Book trzecia = new Book("Pies w Aucie", "Maciej Kot", 2020);
    }
    static void zadanie4i5(){
        Car auto1 =
                new Car(
                        "Toyota",
                        "Corolla",
                        2020,
                        95_500
                );

        Car auto2 = new Car(auto1);
        auto1.showInformation();
        auto2.showInformation();
    }
    static void zadanie6(){
        Person first = new Person("Anna");
        Person second = first;

        second.name = "Maria";
        first.introduceYourself();
        second.introduceYourself();
        //Powstał 1 obiekt person.
        // Istnieją dwie referncje do jednego obiektu.
        // Zmiana jest widoczna, poniewaz nieudane kopiowanie obiektu skopiowało tylko referencje, więc wszystkie zmiany są widoczne dla first jak i dla second.

    }
    static void zadanie7(){
        PersonV2 first = new PersonV2("Maja");

        PersonV2 second = new PersonV2(first);
        second.name= "Karolina";
        first.introduceYourself();
        second.introduceYourself();
        //Pierwszy przypadek opiera się na kopiowaniu referencji do tego samego obiektu, czyli wszystkie zmiany dokonywane są w tym samym miejscu w pamięci, czyli są widoczne dla obu.
        // Drugi przypadek opiera się na kopiowaniu obiektu do drugiego, nowo zarezerwowanego miejsca, więc mamy dwa niezale
    }
    static void zadanie8(){
        Counter c1 = new Counter(10);
        Counter c2 = new Counter(20);
        c1.increaseOther(c2);
        System.out.println(c2.value);
    }
    static void zadanie9(){
        Car car = null;
        if (car != null) {
            car.showInformation();
        } else {
            System.out.println("Błąd");
        }
        //Moze zmienić, poniewaz obiekty są przekazywane przez referencje. Do metody trafia kopia adresu obiektu, który znajduje się nazewnątrz metody, a po wykonaniu czynności zmienna ohter znika, lecz trwale zmienia obiekt.
    }
    static void zadanie10(){
        Box a = new Box(10);
        Box b = a;
        Box c = new Box(a.value);

        b.value = 20;
        c.value = 30;

        System.out.println(a.value);
        System.out.println(b.value);
        System.out.println(c.value);

        System.out.println(a == b);
        System.out.println(a == c);
        //a-----
        //      |->jeden obiekt
        //b-----
        //
        //c------->drugi obiekt
    }
    static void zadanie11(){
        Product product = new Product("Monitor", 1200);

        product.show();
        //Kod nie kompiluje sie, poniewaz słowo void powoduje, ze konstruktor traktowany jest jako metoda
        //This jest referencją do biezącego obiektu klasy, np. korzystamy z niego w sytuacji gdy pole klasy i zmienna nazywają sie tak samo
    }
    static  void zadanie12(){
        System.out.println("NOWE INFORMACJE ODNOŚNIE PRACOWNIKA");
        Pracownik pracownik = new Pracownik("Marlena", "Sójka", 220);
        pracownik.wymiarGodzin();
        System.out.println();
        Gosc gosc = new Gosc("Marlena", "Kłos", 23);
        Pokoj pokoj = new Pokoj(122, "Z balkonem");
        System_Rezerwacji rezerwacja = new System_Rezerwacji(pokoj, gosc, LocalDate.of(2026,10,19), LocalDate.of(2026,10,22));
        rezerwacja.wyswietlSzczegolyRezerwacji();
    }
}