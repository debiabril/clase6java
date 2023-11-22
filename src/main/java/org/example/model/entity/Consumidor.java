package org.example.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity
@Data
@Table(name="consumidor")
public class Consumidor {
    @OneToMany(mappedBy = "trabajo")
    private List<Trabajo> trabajos;
    @Id
    @GeneratedValue(strategy=SEQUENCE, generator = "IDENTITY")
    Long id;
    private String usuario;

}
