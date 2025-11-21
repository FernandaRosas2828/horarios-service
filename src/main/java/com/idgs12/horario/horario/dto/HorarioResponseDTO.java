package com.idgs12.horario.horario.dto;

import lombok.Data;

@Data
public class HorarioResponseDTO {
    private Integer id;
    private String diaSemana;
    private String horaInicio;
    private String horaFin;
    private String aula;
    private Boolean activo;
    private GrupoDTO grupo; // Objeto completo del grupo
    private MateriaDTO materia; // ✅ Objeto completo de la materia
}
