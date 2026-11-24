public class TextDocument implements ReadWrite {
    private String content = "";
    @Override
    public void write(String content) {
        this.content = content;
        System.out.println("Zapisano nową treść w dokumencie.");
    }
    @Override
    public String read() {
        return content;
    }
}