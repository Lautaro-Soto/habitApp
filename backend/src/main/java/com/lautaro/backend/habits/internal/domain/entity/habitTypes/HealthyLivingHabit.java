package com.lautaro.backend.habits.internal.domain.entity.habitTypes;


import com.lautaro.backend.habits.internal.domain.entity.Habit;
import com.lautaro.backend.habits.internal.domain.enums.HabitType;
import com.lautaro.backend.habits.internal.domain.enums.HealthyLivingEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class HealthyLivingHabit extends Habit {

    private static final String DEFAULT_ICON = "HealthyLivingIcon";//TODO Definir icono a almacenar ? almacenarlo en clodinary.
    private static final String DEFAULT_COLOR = "#000000";//TODO definir colores de cada habito.

    @Column(name = "value")
    private Double value;

    @Column(name = "units")
    private HealthyLivingEnum units;

    public HealthyLivingHabit(String name, HabitType type, Set<DayOfWeek> dayOfWeeks, LocalDate localDate, Double value, HealthyLivingEnum healthyLivingEnum) {
        super(name, type, dayOfWeeks, localDate);
        this.value = value;
        this.units = healthyLivingEnum;
    }

    public Double getValue() {
        return value;
    }

    public HealthyLivingEnum getUnits() {
        return units;
    }

    @Override
    public String getIcon() {
        return DEFAULT_ICON;
    }

    @Override
    public String getColor() {
        return DEFAULT_COLOR;
    }
}
