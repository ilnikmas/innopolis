package ru.maslenchenko.ilya.lesson17;

import java.io.Serializable;

public class Book implements Serializable {
    public static final long serialVersionUID = 1L;
    private String name;
    private String author;
    private String yearOfPublic;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", yearOfPublic='" + yearOfPublic + '\'' +
                '}';
    }

    public Book(String name, String author, String yearOfPublic) {
        this.name = name;
        this.author = author;
        this.yearOfPublic = yearOfPublic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYearOfPublic() {
        return yearOfPublic;
    }

    public void setYearOfPublic(String yearOfPublic) {
        this.yearOfPublic = yearOfPublic;
    }
}
