package com.idgs12.horario.horario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import com.idgs12.horario.horario.entity.HorarioMateria;
import java.util.List;

public interface HorarioMateriaRepository extends JpaRepository<HorarioMateria, Integer> {

    List<HorarioMateria> findByHorario_Id(int horarioId);

    @Transactional
    void deleteByHorario_Id(int horarioId);
}
