package com.lautaro.backend.habits.internal.application.dto.habitTypeDetails;

import com.lautaro.backend.habits.internal.domain.entity.habitTypes.LearningHabit;
import com.lautaro.backend.habits.internal.domain.enums.LearningEnum;

public record LearningDetailsDTO(
    double value,
    LearningEnum units
) implements HabitDetailsDto {
    public static LearningDetailsDTO fromEntity(LearningHabit habit) {
        return new LearningDetailsDTO(
            habit.getValue(),
            habit.getUnits()
        );
    }
}
