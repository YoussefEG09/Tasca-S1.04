package Level1_Tasca_S1_04;

public class Book {
    private String name;


    public Book(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("The name's book is not valid.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        Book other = (Book) obj;
        return this.name.equalsIgnoreCase(other.name);
    }

    @Override
    public int hashCode() {
        return name.toLowerCase().hashCode();
    }

    @Override
    public String toString() {
        return "Level1_Tasca_S1_04.Book : " + name;
    }
}

