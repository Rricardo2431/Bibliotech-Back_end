package Rricardo2431.BiblioTech.Backend.repository;

import Rricardo2431.BiblioTech.Backend.models.Book;
import Rricardo2431.BiblioTech.Backend.models.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library, Long> {
}
