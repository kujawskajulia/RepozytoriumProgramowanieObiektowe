//  i   |   x    |  wynik    //
//______|________|___________//
//  0   |   4    |    2      //
//______|________|___________//
//  1   |   8    |    6      //
//______|________|___________//
//  2   |   16    |    14    //
//______|________|___________//
//  3   |   32    |    30    //

public class zad5 {

    public static void main(String[] args) {
        int x = 2;
        int wynik = 0;

        for (int i = 0; i < 4; i++) {
            wynik += x;
            x *= 2;
            System.out.printf("X: %d\n", x);
            System.out.printf("Wynik: %d\n", wynik);
        }

        System.out.println(x);
        System.out.println(wynik);
    }
}