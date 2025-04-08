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
}
