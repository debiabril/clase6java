package org.example.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="calificacion")
public class Calificacion {
    @OneToOne(mappedBy = "trabajo")
    private Trabajo trabajo;
    private
    @Id
    @GeneratedValue
    Long id;
    private int estrellas;
    private String opinion;
}
