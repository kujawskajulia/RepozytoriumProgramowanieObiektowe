package zad22;
import zad21.Person;
public class Employeezad2 extends Person {

    public void checkAccess() {
        //System.out.println(privateField);

        //System.out.println(packagePrivateField);

        System.out.println(this.protectedField);

        System.out.println(this.publicField);
    }
}