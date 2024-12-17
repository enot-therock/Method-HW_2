public class Book {
    private String name;
    private Author author;
    private int years;

    public Book(String name, Author author, int years) {
        this.name = name;
        this.years = years;
        this.author = author;
    }

    public Author getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.name;
    }

    public int getYears() {
        return this.years;
    }

    public void setYears(int years) {
        this.years = years;
    }

}
