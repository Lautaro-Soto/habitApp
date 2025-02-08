package com.lautaro.backend.habits.internal.application.dto.habitTypeDetails;

import com.lautaro.backend.habits.internal.domain.entity.habitTypes.FinancesHabit;
import com.lautaro.backend.habits.internal.domain.enums.FinancesEnum;

public record FinancesDetailsDTO(
    double value,
    FinancesEnum units
) implements HabitDetailsDto {

    public static FinancesDetailsDTO fromEntity(FinancesHabit habit) {
        return new FinancesDetailsDTO(
                habit.getValue(),
                habit.getUnits()
        );
    }
}
