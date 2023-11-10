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
public class Library {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String collection;
    private String location;
    private int stock;


    @ManyToMany(cascade = CascadeType.PERSIST)
    @JsonIgnoreProperties("libraries")
    private Set<Book> books = new HashSet<>();


    @ManyToOne
    @JsonIgnoreProperties("libraries")
    private Inventory inventory;


    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn( name = "library_id")
    @JsonIgnoreProperties("library")
    private Set<Librarian> librarian = new HashSet<>();

}
