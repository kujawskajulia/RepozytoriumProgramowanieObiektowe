public class Course {
    private String name;
    static final int maxStudents = 200;
    static int numberOfCreatedCourses = 0;

    public Course(String name){
        if(name != null || !name.isEmpty()) {
            this.name = name;
            numberOfCreatedCourses++;
        }
    }

    public void printInformacje() {
        System.out.println("Kurs: " + this.name);
    }

    public void printInformacje(String spacja) {
        System.out.print(spacja + " ");
        this.printInformacje();
    }
    public void setName(String name) {
        if(name != null && !name.isEmpty()) {
            this.name = name;
        }
    }
    public String getName(){
        return this.name;
    }
}
