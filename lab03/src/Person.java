public class Person{
    private String name;
    private int age;
    private String email;
    public Person(String name,
                  int age,
                  String email){
        if (name == null || name.isBlank()){
            System.out.println("Błedne dane");
        }
        if (age>150 || age<0){
            System.out.println("Błedne dane");
        }
        if (!email.contains("@")){
            System.out.println("Błedne dane");
        }
        this.name = name;
        this.age = age;
        this.email = email;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public String getEmail() {
        return this.email;
    }
    public void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        }
    }
    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        }
    }
}