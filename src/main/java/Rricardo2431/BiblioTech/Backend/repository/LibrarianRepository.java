package Rricardo2431.BiblioTech.Backend.repository;

import Rricardo2431.BiblioTech.Backend.models.Librarian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibrarianRepository extends JpaRepository<Librarian, Long> {
}
