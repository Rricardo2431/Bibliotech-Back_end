package Rricardo2431.BiblioTech.Backend.rest;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import Rricardo2431.BiblioTech.Backend.models.Librarian;
import Rricardo2431.BiblioTech.Backend.usercase.LibrarianService;


@RestController
@RequiredArgsConstructor
@RequestMapping("/librarian")
public class LibrarianController {

  
    private final LibrarianService service;
   


    @GetMapping
    ResponseEntity<List<Librarian>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    ResponseEntity<Librarian> getById(@PathVariable Long id){
        return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
    }

    @PostMapping
    ResponseEntity<Librarian> create(@RequestBody Librarian librarian) {
        return new ResponseEntity<>(service.create(librarian), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    ResponseEntity<Librarian> findById(@PathVariable Long id, @RequestBody Librarian librarian){

    return new ResponseEntity<>(service.update(id, librarian), HttpStatus.OK );
    }

        @DeleteMapping("/{id}")
    ResponseEntity<?> deleteById(@PathVariable Long id){
        service.delete(id);
        return new ResponseEntity<>( HttpStatus.OK);
    }


}



