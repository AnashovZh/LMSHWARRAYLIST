package service;

import models.Reader;

import java.util.List;

public interface ReaderService {
    void saveReader(Reader reader);
    List<Reader>saveReaders(List<Reader>readers);
    List<Reader> getAllReaders();
    Reader getReaderById(Long id);
    Reader updateReader(Long id, Reader reader);
    void assignReaderToLibrary(Long readerId,Long libraryId);

}
