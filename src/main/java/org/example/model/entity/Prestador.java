package org.example.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;
import java.util.Date;

@Entity
@Data
@Table(name="prestador")
public class Prestador {
    @OneToMany(mappedBy = "servicio")
    private List<Servicio> servicio;
    @Id
    @GeneratedValue
    Long id;
    private String nombreYApellido;
    private Date fechaNacimiento;
    private String dni;
    private String cuilCuit;
    private String telefono;
    private String email;
    private int reputacion;
}
