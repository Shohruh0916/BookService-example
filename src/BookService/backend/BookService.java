package BookService.backend;

public interface BookService {
    void display();
    void addBook(Book book);
    void editBook(Integer id,BookDTO bookDTO);
    void deleteBook(Integer id);
}
