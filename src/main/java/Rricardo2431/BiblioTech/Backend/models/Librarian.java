package Rricardo2431.BiblioTech.Backend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
@Entity
public class Librarian {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String password;
    private String role;

@ManyToOne
    @JsonIgnoreProperties("librarians")
    private Library library;

}

