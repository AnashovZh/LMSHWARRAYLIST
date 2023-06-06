package sericeImpl;

import models.DataBase;
import models.Library;
import models.Reader;
import service.LibraryService;
import service.ReaderService;

import java.util.List;

public class ReaderServiceImpl implements ReaderService {
    private DataBase dataBase;

    public ReaderServiceImpl(DataBase dataBase) {
        this.dataBase = dataBase;

    }

    @Override
    public List<Reader> saveReaders(List<Reader> readers) {
        dataBase.getReaderList().addAll(readers);
        return readers;
    }

    @Override
    public void saveReader(Reader reader) {

        dataBase.getReaderList().add(reader);
        System.out.println(dataBase.getReaderList());

    }

    @Override
    public List<Reader> getAllReaders() {
        return dataBase.getReaderList();
        
    }

    @Override
    public Reader getReaderById(Long id) {
        for (int i = 0; i < dataBase.getReaderList().size(); i++) {
            if (dataBase.getReaderList().get(i).getId().equals(id)){
                return dataBase.getReaderList().get(i);
            }
        }
        return null;
    }

    @Override
    public Reader updateReader(Long id, Reader reader) {
        for (int i = 0; i < dataBase.getReaderList().size(); i++) {
            if (dataBase.getReaderList().get(i).getId().equals(id)){
                //dataBase.getReaderList().set(i,reader);
                dataBase.getReaderList().get(i).setId(reader.getId());
                dataBase.getReaderList().get(i).setFullName(reader.getFullName());
                dataBase.getReaderList().get(i).setEmail(reader.getEmail());
                dataBase.getReaderList().get(i).setGender(reader.getGender());
            }
        }
        return reader;
    }

    @Override
    public void assignReaderToLibrary(Long readerId, Long libraryId) {
     Reader reader=getReaderById(readerId);
        for (Library l:dataBase.getLibraries()) {
            if (l.getId().equals(libraryId)){
               l.getReaders().add(reader);
            }
        }
    }
}
