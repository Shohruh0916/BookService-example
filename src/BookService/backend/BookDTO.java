package BookService.backend;

public class BookDTO {
    private int id;
    private String name;
    private String description;
    private int price;
    private Genre genre;
    private Author[] authors;

    public BookDTO(int id, String name, String description, int price, Genre genre, Author[] authors) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.genre = genre;
        this.authors = authors;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public Genre getGenre() {
        return genre;
    }

    public Author[] getAuthors() {
        return authors;
    }
}
