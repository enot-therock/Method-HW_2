import java.util.Objects;

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

    @Override
    public String toString() {
        return "Название: " + this.name + "; " + this.author.toString() + "; год: " + this.years;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return years == book.years && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, years);
    }
}
