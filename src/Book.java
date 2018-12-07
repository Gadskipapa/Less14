public class Book implements Cloneable {

    private String name;
    private Author author;

    public Book(String name, Author author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String toString() {
        return "Книга " + name + " (автор " + author + ")";
    }

    public Book clone() throws CloneNotSupportedException {
        return (Book) super.clone();

        Book (String name, String author) {
            this.name = name;
            this.author = author;
        }

        public void setAuthor(String s) {
            author.setName(s);
    }

    public String getAuthor() {
            return author.getName();
    }

}