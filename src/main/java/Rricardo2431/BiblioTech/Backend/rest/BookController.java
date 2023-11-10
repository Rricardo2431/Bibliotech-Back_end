package Rricardo2431.BiblioTech.Backend.rest;


import Rricardo2431.BiblioTech.Backend.models.Book;
import Rricardo2431.BiblioTech.Backend.usercase.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/book")
public class BookController {

private final BookService service;


@GetMapping
    ResponseEntity<List<Book>> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
}

@GetMapping("/{id}")
    ResponseEntity<Book>getById(@PathVariable Long id ){
    return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
}

@PostMapping
    ResponseEntity<Book> create(@RequestBody Book book){
    return new ResponseEntity<>(service.create(book), HttpStatus.CREATED);
}

@PutMapping("/{id}")
    ResponseEntity<Book> findById(@PathVariable Long id, @RequestBody Book book){
    return new ResponseEntity<>(service.update(id, book), HttpStatus.OK);
}

@DeleteMapping("/{id}")
    ResponseEntity<?> deleteById(@PathVariable Long id){
    service.delete(id);
    return new ResponseEntity<>(HttpStatus.OK);
}


}
