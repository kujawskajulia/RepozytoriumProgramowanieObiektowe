import java.util.Arrays;
public class Main {
    static void main(){
        //zadanie4();
        //zadanie5i6();
        //zadanie8();
        zadanie9();
    }

    static void zadanie4(){
        int[] dane = {1, 2, 3};
        ExamResults egzamin = new ExamResults(dane);
        egzamin.getPoints();
        dane[0] = -1;
        egzamin.getPoints()[1] = -2;
        System.out.println(Arrays.toString(egzamin.getPoints()));
    }

    static void zadanie5i6(){
        new Product("Jabłko");
        new Product("Winogrona");
        new Product("Banan");
        new Product("Truskawka");
        new Product("Malina");
        new Product("Wiśnia");
        System.out.println(Product.getNumberOfProducts());
    }//1. Powinno być staticc, poniewaz gdyby nie było to kazdy obuekt miałby swoje pole max_products co zajmowałoby niepotrzebnie miejsce
    //2. Poniewaz wtedy wartosc ta zostaje przypisana jednorazowo i nie mozna jej juz zmienic, a o to chodzi.
    //3. Słowo final blokuje mozliwosc modyfikacji wartosci zmiennej, a my chcemy na biezacą dodając nowe produkty ją zmieniac

    static void zadanie8(){
        int suma1 = StaticCalculator.add(5, 10);
        System.out.println("Pierwsza suma: " + suma1);
        int suma2 = StaticCalculator.add(1, 2, 3);
        System.out.println("Druga suma: " + suma2);
        double suma3 = StaticCalculator.add(2.5, 3.5);
        System.out.println("Trzecia suma: " + suma3);

    }
    public static void zadanie9(){
        InitializationDemo demo = new InitializationDemo();
        InitializationDemo demo2 = new InitializationDemo();
    }

    // Zadanie 10:
    // 1. studentName w klasie Student: instancyjny, poniewaz kazdy student posiada własne, inne imie, więc musi być mozliwosc zmiany go
    //2. numberOfStudents w klasie Student: statyczny, poniewaz cecha ta dotyczy całej klasy, a nie pojedynczego elementu
    //3. PI w klasie matematycznej, statyczny, poniewaz jest to niezmienna stała, która zawze wynosi tyle samo
    //4. balance w klasie BankAccount: instancyjny, poniewaz jest przypisany do kazdego, oddzielnego konta bankowego, a nie kazde konto ma taki sam balans
    //5. calculateVat(double price) w bezstanowej klasie pomocniczej: statyczny, poniewaz działanie metody zalezy tylko od przekazanej kwoty
    //6. carMileage w klasie Car: instancyjny, poniewaz przebieg auta jest konkretną cechą danego obiektu i regularnie się zmienia
    //7. MAX_LOGIN_ATTEMPTS w klasie LoginPolicy: statyczny, poniewaz dotyczy kazdego uzytkownika i nie zmienia się zaleznie od niego, wiec powinna obowiazywać wszystkich
}
