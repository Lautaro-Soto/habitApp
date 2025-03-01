package com.lautaro.backend.habits.internal.application.dto.habitTypeDetails;

import com.lautaro.backend.habits.internal.domain.entity.habitTypes.HealthyLivingHabit;
import com.lautaro.backend.habits.internal.domain.enums.HealthyLivingEnum;

public record HealthyLivingDetailsDTO(
        Double value,
        HealthyLivingEnum units
) implements HabitDetailsDto {
    public static HealthyLivingDetailsDTO fromEntity(HealthyLivingHabit habit) {
        return new HealthyLivingDetailsDTO(
                habit.getValue(),
                habit.getUnits()
        );
    }
}
