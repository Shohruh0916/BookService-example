package BookService.fronted;


import BookService.backend.*;

public class Test {
    public static void main(String[] args) {
        BookService bookService=new BookServiceImpl();
        Author[] authors1={new Author(1,"avb"),new Author(2,"fer")};
         Book book1=new Book.BookBuilder().setId(101)
                 .setName("df")
                 .setDescription("dr")
                 .setPrice(5)
                 .setGenre(Genre.FANTASY)
                 .setAuthors(authors1).builder();
        bookService.addBook(book1);
        bookService.display();
        BookDTO bookDTO=new BookDTO(12,"Updated Book", "New Desc", 30, Genre.SCIENCE, authors1);
        bookService.editBook(101,bookDTO);
        bookService.display();
        bookService.deleteBook(101);
        bookService.display();
    }
}
