package org.example.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity
@Data
@Table(name="tarea")
public class Tarea {
    @ManyToOne
    @JoinColumn(name = "id_trabajo")
    private Trabajo trabajo;
    @Id
    @GeneratedValue(strategy=SEQUENCE, generator = "IDENTITY")
    Long id;
    private String descripcion;
}
