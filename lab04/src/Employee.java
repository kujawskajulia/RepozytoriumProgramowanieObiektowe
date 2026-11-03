import java.lang.classfile.attribute.SourceDebugExtensionAttribute;

public class Employee extends Person{
    String position;
    public Employee(String firstName, String lastName, String position) {
        super(firstName, lastName);
        this.position = position;
    }
    public void displayData(){
        System.out.println("Imie: " + getName());
        System.out.println("Nazwisko: " + lastName);
        System.out.println("Pozycja:" + position);
    }
}

//1. pole firstName jest oznaczone jako private, wiec jest widoczne wyłącznie w klasie, w której zostało zdefiniowane. Klasy dziedziczące nie mają do niego bezpośredniego dostępu.
//2. Pole lastName zostało oznaczone jako protected, to celowo pozwala na to, aby pole było widoczne w klasach dziedziczących.
//3. Nie, bezpieczniejszym jest stosowanie private jako domyślnego wyboru.