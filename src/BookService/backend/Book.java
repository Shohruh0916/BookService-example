package BookService.backend;

import java.util.Arrays;

public class Book {
    private int id;
    private String name;
    private String description;
    private int price;
    private Genre genre;
    private Author[] authors;


    public Book(BookBuilder bookBuilder) {
        this.id =bookBuilder.id;
        this.name = bookBuilder.name;
        this.description = bookBuilder.description;
        this.price =bookBuilder. price;
        this.genre =bookBuilder. genre;
        this.authors =bookBuilder. authors;
    }

    public static class BookBuilder{
        private int id;
        private String name;
        private String description;
        private int price;
        private Genre genre;
        private Author[] authors=new Author[10];

        public BookBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public BookBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public BookBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public BookBuilder setPrice(int price) {
            this.price = price;
            return this;
        }

        public BookBuilder setGenre(Genre genre) {
            this.genre = genre;
            return this;
        }

        public BookBuilder setAuthors(Author[] authors) {
            this.authors = authors;
            return this;
        }

        public Book builder(){
            return new Book(this);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", genre=" + genre +
                ", authors=" + Arrays.toString(authors) +
                '}';
    }
}
