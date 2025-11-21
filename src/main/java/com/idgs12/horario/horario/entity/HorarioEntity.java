package com.idgs12.horario.horario.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "horarios")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class HorarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String diaSemana;
    private String horaInicio;
    private String horaFin;
    private String aula;
    private Boolean activo;

    private Integer materiaId;
}
