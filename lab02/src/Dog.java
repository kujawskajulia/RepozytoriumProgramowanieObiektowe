public class Dog {
    String name;
    String breed;
    int age;
    public Dog(String name,
               String rasa,
               int age){
        this.name = name;
        breed = rasa;
        this.age = age;

    }
    public void bark(){
        System.out.println("Wof wof");
    }
    public void ShowInformation(){
        System.out.println("Imie: " + name + "\n" + "Rasa: " + breed + "\n" + "Wiek: " + age);
    }

}
