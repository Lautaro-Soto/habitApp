package com.lautaro.backend.habits.internal.application.dto.habitTypeDetails;


import com.lautaro.backend.habits.internal.domain.entity.habitTypes.PhysicalActivityHabit;
import com.lautaro.backend.habits.internal.domain.enums.PhysicalActivityEnum;

public record PhysicalActivityDetailsDTO(
        double value,
        PhysicalActivityEnum units
) implements HabitDetailsDto {
    public static PhysicalActivityDetailsDTO fromEntity(PhysicalActivityHabit habit) {
        return new PhysicalActivityDetailsDTO(
                habit.getValue(),
                habit.getUnits()
        );
    }
}
