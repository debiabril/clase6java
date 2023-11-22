package org.example.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

import static jakarta.persistence.GenerationType.SEQUENCE;


@Entity
@Data
@Table(name="admin")
public class Admin {
    @OneToMany(mappedBy = "servicio")
    private List<Servicio> servicios;
    @Id
    @GeneratedValue(strategy=SEQUENCE, generator = "IDENTITY")
    Long id;
    private String usuario;
    private String contrasenia;
}
