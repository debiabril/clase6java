package org.example.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="tarea")
public class Tarea {
    @ManyToOne
    @JoinColumn(name = "id_trabajo")
    private Trabajo trabajo;
    @Id
    @GeneratedValue
    Long id;
    private String descripcion;
}
