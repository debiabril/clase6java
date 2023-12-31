package org.example.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity
@Data
@Table(name="servicio")
public class Servicio {
    @OneToMany(mappedBy = "trabajo", cascade = CascadeType.ALL)
    private List<Trabajo> trabajos;
    @ManyToOne
    @JoinColumn(name = "id_admin")
    private Admin admin;
    @ManyToOne
    @JoinColumn(name = "id_prestador")
    private Prestador prestador;
    @Id
    @GeneratedValue(strategy=SEQUENCE, generator = "IDENTITY")
    Long id;
    private String nombreServicio;
    private String diasYHorarios;
    private int radioKm;
    private String descripcionExperiencia;
    private String foto;//opcional

}
