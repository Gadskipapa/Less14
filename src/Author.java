public class Author implements Cloneable {
    private String name;

    public Author(String name) throws CloneNotSupportedException{
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
