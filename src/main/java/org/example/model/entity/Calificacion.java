package org.example.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity
@Data
@Table(name="calificacion")
public class Calificacion {
    @OneToOne(mappedBy = "trabajo")
    private Trabajo trabajo;
    private
    @Id
    @GeneratedValue(strategy=SEQUENCE, generator = "IDENTITY")
    Long id;
    private int estrellas;
    private String opinion;
}
