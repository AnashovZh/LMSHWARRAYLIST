package sericeImpl;

import models.DataBase;
import models.Library;
import service.LibraryService;

import java.util.List;

public class LibraryServiceImpl implements LibraryService {
     private DataBase dataBase;

    public LibraryServiceImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public List<Library> saveLibrary(List<Library> libraries) {
     dataBase.getLibraries().addAll(libraries);
     return dataBase.getLibraries();
    }

    @Override
    public List<Library> saveLibrary(Library library) {
        dataBase.getLibraries().add(library);
        return dataBase.getLibraries();
    }

    @Override
    public List<Library> getAllLibraries() {
        return dataBase.getLibraries();
    }

    @Override
    public Library getLibraryById(Long id) {
        for (int i = 0; i <getAllLibraries().size(); i++) {
            if (getAllLibraries().get(i).getId().equals(id)){
                return getAllLibraries().get(i);
            }
        }
        return null;
    }

    @Override
    public Library updateLibrary(Long id, Library library) {
        for (int i = 0; i < dataBase.getLibraries().size(); i++) {
            if (dataBase.getLibraries().get(i).getId().equals(id)){
                dataBase.getLibraries().set(i,library);
            }
        }
        return library;
    }

    @Override
    public String deleteLibrary(Long id) {
        for (int i = 0; i < dataBase.getLibraries().size(); i++) {
            if (dataBase.getLibraries().get(i).getId().equals(id)){
                dataBase.getLibraries().remove(dataBase.getLibraries().get(i));
            }
        }
        return "Delete boldu.";
    }
    }

