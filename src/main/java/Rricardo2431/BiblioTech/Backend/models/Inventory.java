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
public class Inventory {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int date;

    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn( name = "inventory_id")
    @JsonIgnoreProperties ("inventory")
    private Set<Library> library = new HashSet<>();


}
