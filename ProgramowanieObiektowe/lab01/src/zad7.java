// SYSTEM REZRWACJI HOTELOWEJ

//Klasa: Pokoj

//Stan:
//        - numer_pokoju
//        - typ_pokoju

//Odpowiedzialności:
//        - przechowywanie danych o roznych typach pokoi hotelowych

//------------------------------------------------------

//Klasa: Gosc

//Stan:
//        - imię
//        - nazwisko
//        - nr_telefonu
//        - wiek

//Odpowiedzialności:
//        - przechowywanie danych o gościach hotelowych
//        - kontrola wiekowa gosci

//------------------------------------------------------

//Klasa: Pracownik

//Stan:
//        - imie
//        - nazwisko
//        - godziny_pracy

//Odpowiedzialności:
//        - przechowywanie danych osobowych pracowników
//        - kontrola godzin pracy i zmian
//------------------------------------------------------

//Klasa: Hotel

//Stan:
//        - spis_pokoi
//        - spis_gosci
//        - spis_rezrwacji
//        - spis_pracownikow

//Odpowiedzialności:
//        - przechowywanie danych o wszystkich pokojach, gościach hotelowych i pracownikach
//        - kontrola danych dotyczacych rezrwacji hotelowych
//        - kontrola danych dotyczacych pracy zmianowej i wymiaru godzin pracowników

//------------------------------------------------------

//Klasa: System_Rezerwacji

//Stan:
//        - pokoj
//        - gosc
//        - data_meldunku
//        - data_wyjazdu

//Odpowiedzialności:
//        - przechowywanie danych powiązujących gościa do pokoju hotelowego
//        - kontrola i przechowywanie danych odnośnie terminów rezerwacji

//------------------------------------------------------

//PYTANIA
// 1. Klasa HOTEL powinna wiedzieć o istnieniu obiektów z Klasy Pokoj, Gosc, Pracownik oraz System_Rezerwacji. Klasa System_Rezerwacji powinna wiedzieć o istenieniu obiektów z Klasy Pokoj oraz Gosc.
// 2. Nie
// 3. Pomijam dane np. w klasie Pracownik odnośnie płci pracowników, np. w klasie Pokoj odnosnie typu paneli na podłodze.
// 4. Płeć pracownika i typ paneli podłogowych nie wpływają w moim modelu na funkcjonowanie hotelu, najwazniejsze jest sprawne działanie hotelu i na tym właśnie się skupiłam.