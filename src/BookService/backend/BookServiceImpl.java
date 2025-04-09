package BookService.backend;

public class BookServiceImpl implements BookService{
    private Book[] books=new Book[100];
    private int size=0;
    @Override
    public void display() {
        for(int i=0; i<size; i++){
            Book book=books[i];
            System.out.println(book.getId()+" "+book.getName());
        }
    }

    @Override
    public void addBook(Book book) {
        books[size++]=book;
    }

    @Override
    public void editBook(Integer id, BookDTO bookDTO) {
        for(int i=0; i<size; i++){
            if(books[i].getId()==id){
                books[i].setAuthors(bookDTO.getAuthors());
                books[i].setDescription(bookDTO.getDescription());
                books[i].setGenre(bookDTO.getGenre());
                books[i].setName(bookDTO.getName());
                books[i].setPrice(bookDTO.getPrice());
                return;
            }
        }
    }

    @Override
    public void deleteBook(Integer id) {
        for(int i=0; i<size; i++){
            if (books[i].getId() == id) {
                for(int j=0; j<size-1; j++){
                    books[j]=books[j+1];
                }
                books[--size]=null;
                return;
            }
        }
        System.out.println(id);
    }
}
