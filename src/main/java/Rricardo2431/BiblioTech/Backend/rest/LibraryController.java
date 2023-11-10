package Rricardo2431.BiblioTech.Backend.rest;


import Rricardo2431.BiblioTech.Backend.models.Library;
import Rricardo2431.BiblioTech.Backend.usercase.LibraryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/library")
public class LibraryController {

    private final LibraryService service;

    @GetMapping
    ResponseEntity<List<Library>> getAll(){
        return new ResponseEntity<>(service.getAllLibrary(), HttpStatus.OK);
    }

@GetMapping("/{id}")
    ResponseEntity<Library> getById(@PathVariable Long id){
        return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
}

@PostMapping
    ResponseEntity<Library> create(@RequestBody Library library){
        return new ResponseEntity<>(service.create(library), HttpStatus.CREATED);
}

@PutMapping("/{id}")
    ResponseEntity<Library> update(@PathVariable Long id, @RequestBody Library library){
        return new ResponseEntity<>(service.update(id, library), HttpStatus.OK);
}

@DeleteMapping("/{id}")
    ResponseEntity<?> deleteById(@PathVariable Long id){
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
}

}
