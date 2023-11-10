package Rricardo2431.BiblioTech.Backend.repository;

import Rricardo2431.BiblioTech.Backend.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
