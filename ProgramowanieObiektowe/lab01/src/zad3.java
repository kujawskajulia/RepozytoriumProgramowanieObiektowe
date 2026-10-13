import java.util.Scanner;
public class zad3 {
    public static void main(String[] args){
        int[] tablica = new int[10];
        Scanner dane = new Scanner(System.in);
        for (int i = 0; i<10; i++){
            System.out.println("Podaj liczbe: ");
            tablica[i] = dane.nextInt();
        }
        int max = tablica[0];
        int min = tablica[0];
        for (int i = 0; i<10; i++){
            if(tablica[i]>max){
                max = tablica[i];
            }
        }
        System.out.printf("Największa wartość: %d\n", max);
        for (int i = 0; i<10; i++){
            if(tablica[i]<min){
                min = tablica[i];
            }
        }
        System.out.printf("Najmniejsza wartość: %d\n", min);
        int suma = 0;
        for (int i = 0; i<10; i++){
            suma += tablica[i];
        }
        System.out.printf("Suma: %d\n", suma);
        double sumsred = 0;
        for(int i = 0; i<10; i++){
            sumsred += tablica[i];
        }
        double wynik = sumsred / 10;
        System.out.printf("Średnia arytmetyczna: %.2f\n", wynik);
        int zliczenie = 0;
        for (int i = 0; i<10; i++){
            if (tablica[i]>wynik){
                zliczenie++;
            }
        }
        System.out.printf("Ilość liczb większych od średniej arytmetycznej: %d", zliczenie);
        dane.close();
    }

}
