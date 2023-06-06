import models.*;
import sericeImpl.BookServiceImpl;
import sericeImpl.LibraryServiceImpl;
import sericeImpl.ReaderServiceImpl;
import service.BookService;
import service.LibraryService;
import service.ReaderService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**Models
         Library(id, name, address, List<Book>books, List<Reader>readers)
         Book(id, name, author, Genre genre)
         Reader(id, fullName, email, phoneNumber, Gender gender)
         2. Methods
         LibraryService
         List<Library>saveLibrary(List<Library>libraries);
         List<Library>getAllLibraries();
         Library getLibraryById(Long id);
         Library updateLibrary(Long id, Library library);
         String deleteLibrary(Long id);
         BookService
         Book saveBook(Long libraryId,Book book);
         List<Book>getAllBooks(Long libraryId);
         Book getBookById(Long libraryId, Long bookId);
         String deleteBook(Long libraryId,Long bookId);
         void clearBooksByLibraryId(Long libraryId);
         ReaderService
         void saveReader(Reader reader);
         List<Reader> getAllReaders();
         Reader getReaderById(Long id);
         Reader updateReader(Long id, Reader reader);
         void assignReaderToLibrary(Long readerId,Long libraryId);
         Бардык методдор Main класска чакырылып, switch case аркылуу ирээттуу турдо консольго чыксын*/
        ArrayList<Book>books=new ArrayList<>(List.of(
                new Book(1L,"Deniz jana balykchy","Enest Hamanguei", Genre.ROMANCE)));

        ArrayList<Book>books1=new ArrayList<>(List.of(
                new Book(2L,"Syngan kylych","Tologon Kasymbekov",Genre.WAR),
                new Book(5L,"Juroktordun achkychy","Imam Gazali",Genre.RELIGION)));

        ArrayList<Book>books2=new ArrayList<>(List.of(
                new Book(3L,"Ochpos omur","Abdyshykyr Narmatov",Genre.RELIGION),
                new Book(8L,"Omur","Akylbek Masadykov",Genre.ROMANCE)));

        ArrayList<Reader>readers=new ArrayList<>(List.of(
                new Reader(1L,"Anashov Zhanuzak","anashov17@gamil.com",996250499,Gender.MALE),
                new Reader(12L,"Anashov Aitmat","aitmat@gamil.com",996120202,Gender.MALE)));

        ArrayList<Reader>readers1=new ArrayList<>(List.of(
                new Reader(2L,"Asanov Uson","anashov16@gamil.com",996250498,Gender.MALE)));
        ArrayList<Reader>readers2=new ArrayList<>(List.of(
                new Reader(3L,"Baktulan Nazirbekov","nazirbekkov@gmail.com",2365234,Gender.MALE)));

        ArrayList<Library>libraries=new ArrayList<>(List.of(
                new Library(1L,"Городская библиотека №12 им. И. Раззакова","Проспект Чынгыза Айтматова, 61а",books,readers ),
                new Library(2L,"Kasymaly Bayalinov","Огонбаева Атая, 242",books1,readers1 ),
                new Library(3L,"Национальная библиотека КР им. А. Осмонова","Улица Юсупа Абдрахманова, 208",books2,readers2)));

        Reader reader1=new Reader(4L,"Akunov Almas","almas@gmail.com",996501236,Gender.MALE);
        Reader reader2=new Reader(5L,"Akmataliev Ernazar","ernazar@gmail.com",996500323,Gender.MALE);

        Book book1=new Book(4L,"Time is money","JHGBNM",Genre.ROMANCE);
        Book book2=new Book(5L,"Jamilia","Chyngyz Aitmatov",Genre.ROMANCE);

        Library library1=new Library(4L,"Kitepter","Akunbaev",books,readers);
        Library library2=new Library(5L,"BOOKS","Suhe Bator",books,readers);

        DataBase dataBase=new DataBase();
        LibraryService libraryService=new LibraryServiceImpl(dataBase);
        ReaderService readerService=new ReaderServiceImpl(dataBase);
        BookService bookService=new BookServiceImpl(dataBase);
        System.out.println("1-Save libraries:"+"\n" +
                "\n2-Save library:" +
                "\n3-Get all libraries:" +
                "\n4-Get library by ID:" +
                "\n5-Update library:" +
                "\n6-Delete library:" +
                "\n7-Save readers:" +
                "\n8-Save reader:" +
                "\n9-Get all readers:" +
                "\n10-Get reader by ID:" +
                "\n11-Update reader:" +
                "\n12-Assign reader to library:" +
                "\n13-Save book:" +
                "\n14-Get all book:" +
                "\n15-Get book by ID" +
                "\n16-Delete book:" +
                "\n17-Clear books by library ID:");

        while (true){
            Scanner scanner=new Scanner(System.in);
            int number =scanner.nextInt();
            System.out.println("1-Save libraries:"+"\n" +
                    "\n2-Save library:" +
                    "\n3-Get all libraries:" +
                    "\n4-Get library by ID:" +
                    "\n5-Update library:" +
                    "\n6-Delete library:" +
                    "\n7-Save readers:" +
                    "\n8-Save reader:" +
                    "\n9-Get all readers:" +
                    "\n10-Get reader by ID:" +
                    "\n11-Update reader:" +
                    "\n12-Assign reader to library:" +
                    "\n13-Save book:" +
                    "\n14-Get all book:" +
                    "\n15-Get book by ID" +
                    "\n16-Delete book:" +
                    "\n17-Clear books by library ID:");

            switch (number){
                case 1:
                    System.out.println(libraryService.saveLibrary(libraries));
                    break;
                case 2:
                    System.out.println(libraryService.saveLibrary(library1));
                    break;
                case 3:
                    System.out.println(libraryService.getAllLibraries());
                    break;
                case 4:
                    System.out.println(libraryService.getLibraryById(3L));
                    break;
                case 5:
                    System.out.println(libraryService.updateLibrary(2L, library2));
                    break;
                case 6:
                    System.out.println(libraryService.deleteLibrary(3L));
                    break;
                case 7:
                    System.out.println(readerService.saveReaders(readers));
                    break;
                case 8:readerService.saveReader(reader1);
                    break;
                case 9:
                    System.out.println(readerService.getAllReaders());
                    break;
                case 10:
                    System.out.println(readerService.getReaderById(1L));
                    break;
                case 11:
                    System.out.println(readerService.updateReader(2L, reader2));
                    break;
                case 12:readerService.assignReaderToLibrary(1L,2L);
                break;
                case 13:
                    System.out.println(bookService.saveBook(1L, book1));
                    break;
                case 14:
                    System.out.println(bookService.getAllBooks(1L));
                    break;
                case 15:
                    System.out.println(bookService.getBookById(3L, 8L));
                    break;
                case 16:
                    System.out.println(bookService.deleteBook(1L, 1L));
                    break;
                case 17:bookService.clearBooksByLibraryId(2L);
                    break;
                default:
                    System.out.println("17-sanga chein gana tandanyz!");

            }
        }
    }
}
