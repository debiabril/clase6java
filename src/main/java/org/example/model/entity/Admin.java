package org.example.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Data
@Table(name="admin")
public class Admin {
    @OneToMany(mappedBy = "servicio")
    private List<Servicio> servicios;
    @Id
    @GeneratedValue
    Long id;
    private String usuario;
    private String contrasenia;
}
