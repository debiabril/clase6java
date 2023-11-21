package org.example.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name="trabajo")
public class Trabajo {
    @OneToOne
    @JoinColumn(name = "id_calificacion")
    private Calificacion calificacion;
    @ManyToOne
    @JoinColumn(name = "id_servicio")
    private Servicio servicio;
    @ManyToOne
    @JoinColumn(name = "id_consumidor")
    private Consumidor consumidor;
    @OneToMany(mappedBy = "tarea", cascade = CascadeType.ALL)
    private List<Tarea> tareas;
    @Id
    @GeneratedValue
    Long id;
    private Date rangoHorario;
    private String lugar;
    private Boolean estadoTrabajo; //finalizado o no
    private int precio;

}
