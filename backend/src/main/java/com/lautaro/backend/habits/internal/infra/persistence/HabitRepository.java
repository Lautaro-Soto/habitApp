package com.lautaro.backend.habits.internal.infra.persistence;

import com.lautaro.backend.habits.internal.domain.enums.HabitType;
import com.lautaro.backend.habits.internal.domain.entity.Habit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HabitRepository extends JpaRepository<Habit, Long> {

    //Busca habito por nombre.
    List<Habit> findByName(String name);

    //Verifica si un habito con el mismo nombre ya existe.
    boolean existsByName(String name);

    List<Habit> findByType(HabitType type);
}
