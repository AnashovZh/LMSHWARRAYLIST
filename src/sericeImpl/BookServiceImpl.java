package sericeImpl;

import models.Book;
import models.DataBase;
import models.Library;
import service.BookService;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {
    private DataBase dataBase;

    public BookServiceImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public Book saveBook(Long libraryId, Book book) {
        for (Library l: dataBase.getLibraries()) {
            if (l.getId().equals(libraryId)){
                l.getBooks().add(book);
            }
        }return book;
    }

    @Override
    public List<Book> getAllBooks(Long libraryId) {
        for (Library b:dataBase.getLibraries()) {
            if (b.getId().equals(libraryId)){
                return b.getBooks();
            }
        }
        return dataBase.getBooksList();
    }

    @Override
    public List<Book> getBookById(Long libraryId, Long bookId) {
        for (Library l: dataBase.getLibraries()) {
            List<Book>books=new ArrayList<>();
            if (l.getId().equals(libraryId)) {
                books=l.getBooks();}
            for (Book b:books) {
                if (b.getId().equals(bookId)){
                    System.out.println(b);
                }
            }
        }return null;
    }

    @Override
    public String deleteBook(Long libraryId, Long bookId) {
        for (int i = 0; i <dataBase.getLibraries().size() ; i++) {
            if (dataBase.getLibraries().get(i).getId().equals(libraryId)){
                ArrayList<Book>books=new ArrayList<>();
                books=dataBase.getLibraries().get(i).getBooks();
                for (int j = 0; j < books.size(); j++) {
                    if (books.get(i).getId().equals(bookId)){
                        books.remove(i);
                    }
                }
                
            }
        }return "delete accepted";
    }

    @Override
    public void clearBooksByLibraryId(Long libraryId) {
        for (int i = 0; i < dataBase.getLibraries().size(); i++) {
            if (dataBase.getLibraries().get(i).getId().equals(libraryId)){
                dataBase.getLibraries().get(i).getBooks().clear();
            }
        }
    }
}
