package Rricardo2431.BiblioTech.Backend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@RequiredArgsConstructor
@ToString

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String category;
    private int quantity;

    @ManyToMany(mappedBy = "books")
    @JsonIgnoreProperties("books")
    private Set<Library> libraries = new HashSet<>();

}
