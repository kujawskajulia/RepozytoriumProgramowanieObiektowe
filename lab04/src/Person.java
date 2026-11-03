public class Person{
    private String firstName;
    protected String lastName;
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getName() {
        return this.firstName;
    }
}
//1. pole firstName jest oznaczone jako private, wiec jest widoczne wyłącznie w klasie, w której zostało zdefiniowane. Klasy dziedziczące nie mają do niego bezpośredniego dostępu.
//2. Pole lastName zostało oznaczone jako protected, to celowo pozwala na to, aby pole było widoczne w klasach dziedziczących.
//3. Nie, bezpieczniejszym jest stosowanie private jako domyślnego wyboru.