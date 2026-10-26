public class Student {
    private String name;
    private int albumNumber;

    public Student(String name, int albumNumber){
        if(name != null || !name.isEmpty()){
            this.name = name;
            this.albumNumber = albumNumber;
        }
    }

    public String getName() {
        return name;
    }

    public int getAlbumNumber() {
        return albumNumber;
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty()) {
            this.name = name;
        }
    }
}