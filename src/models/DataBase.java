package models;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private List<Library>libraries=new ArrayList<>();
    private List<Book>booksList=new ArrayList<>();
    private List<Reader>readerList=new ArrayList<>();

    public DataBase(List<Library> libraries, List<Book> booksList, List<Reader> readerList) {
        this.libraries = libraries;
        this.booksList = booksList;
        this.readerList = readerList;
    }

    public DataBase() {
    }

    public List<Library> getLibraries() {
        return libraries;
    }

    public void setLibraries(List<Library> libraries) {
        this.libraries = libraries;
    }

    public List<Book> getBooksList() {
        return booksList;
    }

    public void setBooksList(List<Book> booksList) {
        this.booksList = booksList;
    }

    public List<Reader> getReaderList() {
        return readerList;
    }

    public void setReaderList(List<Reader> readerList) {
        this.readerList = readerList;
    }
}
