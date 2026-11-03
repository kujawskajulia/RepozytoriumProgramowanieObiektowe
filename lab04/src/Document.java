public class Document {
    private String content;
    public Document() {
        this.content = "Podstawowa zawartość";
    }
    public Document copy() {
        Document newDoc = new Document();
        newDoc.content = this.content;
        return newDoc;
    }
}
