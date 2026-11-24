// 1. Shape - Klasa abstrakcyjna
// Wspolny stan: Tak (np. kolor).
// Naturalne IS-A: Tak (Kolo jest ksztaltem, Prostokat jest ksztaltem).
// Kontrakt dla niezwiazanych klas: Nie, dotyczy wylacznie figur geometrycznych.
// Czesciowa implementacja: Tak (np. wspolne gettery i settery koloru).

// 2. Printable - Interfejs
// Wspolny stan: Nie (drukowanie to czynnosc, nie wymaga wspolnych pol).
// Naturalne IS-A: Nie (Faktura, Zdjecie czy Etykieta nie sa tym samym).
// Kontrakt dla niezwiazanych klas: Tak (moze go zaimplementowac dokument, bilet).
// Czesciowa implementacja: Nie (kazda klasa drukuje swoje dane zupelnie inaczej).

// 3. Employee - Klasa abstrakcyjna
// Wspolny stan: Tak (np. imie, nazwisko).
// Naturalne IS-A: Tak (Programista jest pracownikiem, Menedzer jest pracownikiem).
// Kontrakt dla niezwiazanych klas: Nie, odnosi sie wylacznie do osob zatrudnionych w firmie.
// Czesciowa implementacja: Tak (np. wspolne metody pobierajace dane osobowe).

// 4. Comparable - Interfejs
// Wspolny stan: Nie (zdolnosc do porownywania obiektow nie wymaga przechowywania wspolnych pol).
// Naturalne IS-A: Nie (Liczba, Data i Produkt nie maja wspolnego przodka poza Object).
// Kontrakt dla niezwiazanych klas: Tak (porownywac i sortowac mozna niemal dowolne, zupelnie niezwiazane typy danych).
// Czesciowa implementacja: Nie (logika porownywania zalezy od konkretnej klasy).

// 5. Vehicle - Klasa abstrakcyjna
// Wspolny stan: Tak (np. predkosc maksymalna, marka, rok produkcji).
// Naturalne IS-A: Tak (Samochod jest pojazdem, Motocykl jest pojazdem).
// Kontrakt dla niezwiazanych klas: Nie, dotyczy tylko srodkow transportu.
// Czesciowa implementacja: Tak (np. wspolne metody uruchamiania, zatrzymywania lub sprawdzania poziomu paliwa).

// 6. Encryptable - Interfejs
// Wspolny stan: Nie (sama zdolnosc do bycia zaszyfrowanym nie narzuca wspolnych pol).
// Naturalne IS-A: Nie (Wiadomosc, Plik i Haslo to rozne byty).
// Kontrakt dla niezwiazanych klas: Tak (szyfrowac mozna tekst, dokument, polaczenie sieciowe czy sesje).
// Czesciowa implementacja: Nie (sposob szyfrowania zalezy od rodzaju danych).

// 7. NotificationSender - Interfejs
// Wspolny stan: Nie (wysylanie powiadomien przez SMS, E-mail i Push wymaga zupelnie innych danych).
// Naturalne IS-A: Nie (definiuje jedynie role lub usluge w systemie, a nie hierarchie obiektow).
// Kontrakt dla niezwiazanych klas: Tak (moze byc zaimplementowany przez rozne zewnetrzne serwisy).
// Czesciowa implementacja: Nie (kazdy kanal komunikacji realizuje wysylke w inny sposob).

// 8. Account - Klasa abstrakcyjna
// Wspolny stan: Tak (np. numer konta, saldo, wlasciciel).
// Naturalne IS-A: Tak (Konto oszczednosciowe jest kontem).
// Kontrakt dla niezwiazanych klas: Nie, dotyczy wylacznie rachunkow w systemie finansowym.
// Czesciowa implementacja: Tak (np. wspolna logika wplat, sprawdzania salda czy walidacji srodkow)