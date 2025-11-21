package com.idgs12.horario.horario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import com.idgs12.horario.horario.entity.HorarioGrupoEntity;
import java.util.List;

public interface HorarioGrupoRepository extends JpaRepository<HorarioGrupoEntity, Integer> {

    List<HorarioGrupoEntity> findByHorario_Id(int horarioId);

    List<HorarioGrupoEntity> findByGrupoId(Integer grupoId);

    @Transactional
    void deleteByHorario_Id(int horarioId);
}
