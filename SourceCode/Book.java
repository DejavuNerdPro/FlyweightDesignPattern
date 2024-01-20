package SourceCode;

public class Book {

    public final String name;
    public final double price;

    // reduce the variable of group for dependency
    public final BookType type;

    public Book(String name, double price, BookType type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public BookType getType() {
        return type;
    }

}