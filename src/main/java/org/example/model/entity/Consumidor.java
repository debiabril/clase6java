package org.example.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name="consumidor")
public class Consumidor {
    @OneToMany(mappedBy = "trabajo")
    private List<Trabajo> trabajos;
    @Id
    @GeneratedValue
    Long id;
    private String usuario;

}
