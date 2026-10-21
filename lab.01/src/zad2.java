import java.util.Scanner;
public class zad2 {
    public static void main(String[] args){
        Scanner dane = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int liczba = dane.nextInt();
        if (liczba%2==0){
            System.out.println("Liczba jest parzysta.");
        }else{
            System.out.println("Liczba jest nieparzysta.");
        }
        if (liczba%3==0){
            System.out.println("Liczba jest podzielna przez 3.");
        }else{
            System.out.println("Liczba nie jest podzielna przez 3.");
        }
        int suma = 0;
        for (int i = 1; i<=liczba; i++){
            suma += i;
        }
        System.out.printf("Suma wynosi: %d\n", suma);
        int zliczenie = 0;
        for (int i = 1; i<=liczba; i++){
            if(i%2==0){
                zliczenie++;
            }
        }
        System.out.printf("Liczba cyfr parzystych wynosi: %d", zliczenie);
        dane.close();
    }
}