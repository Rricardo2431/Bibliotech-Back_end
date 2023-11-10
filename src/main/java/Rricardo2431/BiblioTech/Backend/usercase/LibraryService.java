package Rricardo2431.BiblioTech.Backend.usercase;


import Rricardo2431.BiblioTech.Backend.models.Library;
import Rricardo2431.BiblioTech.Backend.repository.LibraryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class LibraryService {

    private final LibraryRepository repository;

    public List<Library> getAllLibrary() {
        return repository.findAll();
    }


    public Library getById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Library not found" + id));
    }


    public Library create(Library library) {
        return repository.save(library);
    }


    public Library update(Long id, Library library) {

        Library libraryFound = getById(id);
        libraryFound.setCollection(library.getCollection());
        libraryFound.setLocation(library.getLocation());
        libraryFound.setStock(library.getStock());

        return repository.save(libraryFound);
    }

    public void delete(Long id) {
         repository.deleteById(id); }

    }

