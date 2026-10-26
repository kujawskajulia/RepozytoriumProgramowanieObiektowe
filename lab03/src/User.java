//public class User {
//    public String login; PROBLEM PROJEKTOWY: BRAK HERMETYZACJI, WSZYSCY MAJA DOSTEP DO POLA / POWINNO BYC INSTANCYJNE
//    public String password; PROBLEM PROJEKTOWY: BRAK HERMETYZACJI, WSZYSCY MAJA DOSTEP DO POLA / POWINNO BYC INSTANCYJNE
//    public static int age; PROBLEM PROJEKTOWY: PRZEZ STATIC USTAWIAMY, ZE WSZYSCY UZYTKOWNICY MAJA TEN SAM WIEK / POWINNO BYC INSTANCYJNE
//    public User(
//            String login,
//            String password,
//            int age
//    ) {
//        this.login = login;
//        this.password = password;
//        User.age = age; PROBLEM PROJEKTOWY: PRZY TWORZENIU KAZDEGO UZYTKOWNIKA KONSTRUKTOR MODYFIKUJE CALA KLASE
//    }
//    public void setPassword(String password) {
//        this.password = password;
//    }
//    public static void showUser() { BŁAD KOMPILACYJNY: UZYCIE STATIC, WIEC METODA NALEZY DO KLASY I NIE MA DOSTEPU DO POL LOGIN I PASSWORD
//        System.out.println(
//                "Login: " + login
//                        + ", hasło: " + password
//                        + ", wiek: " + age
//        );
//    }
//}
// 5. Hasło nie powinno miec zwykłego gettera, gdyz jest to bład bezpieczeństwa i kazda osoba miałaby do niego dostep, w tym celu ewentualnie stosuje sie metody weryfikujace majace na celu wyswietlenie True/False po wpisaniu hasła

public class User {
    private String login;
    private String password;
    private int age;
    public User(
            String login,
            String password,
            int age
    ) {
        if (age>0){
            this.login = login;
            this.password = password;
            this.age = age;
        }
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void showUser() {
        System.out.println(
                "Login: " + this.login + ", hasło: " + this.password + ", wiek: " + this.age);
    }
}