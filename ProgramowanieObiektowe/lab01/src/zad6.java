//Klasa: Ksiazka

//Stan:
//        - tytul
//        - autor
//        - numer_ISBN
//        - rok_wydania

//Odpowiedzialności:
//        - przechowywanie danych o wybranych pozycjach

//------------------------------------------------------

//Klasa: Czytelnik

//Stan:
//        - imię
//        - nazwisko
//        - numer_karty_bibliotecznej

//Odpowiedzialności:
//        - przechowywanie danych o czytelnikach

//------------------------------------------------------

//Klasa: Biblioteka

//Stan:
//        - spis_ksiazek
//        - spis_czytelnikoww
//        - spis_wypozyczen

//Odpowiedzialności:
//        - przechowywanie danych o wszystkich ksiazkach i czytelnikach
//        - kontrola danych dotyczacych wypozyczeń w celu unikniecia nałozen ich

//------------------------------------------------------

//Klasa: Wypozyczalnia

//Stan:
//        - ksiazka
//        - czytelnik
//        - data_wypozyczenia
//        - data_zwrotu

//Odpowiedzialności:
//        - przechowywanie danych powiązania ksiązki i czytelnika
//        - przechowywanie danych odnośnie terminów wypozyczeń i zwrotów i kontrola ich

//------------------------------------------------------

// Zalezności:
// 1. Zalezność w klasie BIBLIOTEKA pomiedzy obiektami klasy KSIAZKA (spis_ksiazek), pomiedzy obiektami klasy CZYTELNIK (spis_czytelnikow) oraz pomiedzy obiektami klasy WYPOZYCZALNIA (spis_wypozyczen)
// 2. Zalezność w klasie WYPOZYCZALNIA pomiedzy obiektami klasy KSIAZKA (ksiazka), pomiedzy obiektami klasy CZYTELNIK (czytelnik)