package Rricardo2431.BiblioTech.Backend.usercase;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

import Rricardo2431.BiblioTech.Backend.models.Librarian;
import Rricardo2431.BiblioTech.Backend.repository.LibrarianRepository;

@Service
@RequiredArgsConstructor

public class LibrarianService {

    private final LibrarianRepository repository;


    public List <Librarian> getAll(){
        return repository.findAll();
    }

    public Librarian getById(Long id) {
        return repository.findById(id).orElseThrow(()->new RuntimeException("User not found"+id));
    }

    public Librarian update(Long id, Librarian librarian){

       Librarian userFound = getById(id);
       userFound.setFirstName(librarian.getFirstName());
       userFound.setLastName(librarian.getLastName());
       userFound.setPassword(librarian.getPassword());
       userFound.setRole(librarian.getRole());

       return repository.save(userFound);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public Librarian create(Librarian librarian) {
        return repository.save(librarian);
    }
}