public class PersonV2 {
    String name;
    public PersonV2(String name){
        this.name = name;
    }
    public PersonV2(PersonV2 other){
        this.name = other.name;
    }
    public void introduceYourself(){
        System.out.println("Mam na imię:" + name);
    }
}


