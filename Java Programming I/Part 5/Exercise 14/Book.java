import java.util.Objects;

public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) return true;
        if (compared == null || getClass() != compared.getClass()) return false;
        Book book = (Book) compared;
        return publicationYear == book.publicationYear && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, publicationYear);
    }

    @Override
    public String toString() {
        return "Title: " + name + " Year: " + publicationYear;
    }
}
