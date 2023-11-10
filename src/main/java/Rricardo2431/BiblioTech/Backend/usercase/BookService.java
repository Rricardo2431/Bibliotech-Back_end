package Rricardo2431.BiblioTech.Backend.usercase;


import Rricardo2431.BiblioTech.Backend.models.Book;
import Rricardo2431.BiblioTech.Backend.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class BookService {

    private final BookRepository repository;

    public List<Book> getAll() {
        return repository.findAll();
    }

    public Book getById(Long id) {
        return repository.findById(id).orElseThrow(()->new RuntimeException("Book not found"+id));
    }

    public Book create(Book book) {
        return repository.save(book);
    }

    public Book update(Long id, Book book) {
        Book bookFound = getById(id);
        bookFound.setTitle(book.getTitle());
        bookFound.setCategory(book.getCategory());
        bookFound.setQuantity(book.getQuantity());

        return repository.save(bookFound);
            }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
