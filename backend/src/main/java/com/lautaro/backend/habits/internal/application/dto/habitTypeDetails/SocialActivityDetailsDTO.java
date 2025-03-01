package com.lautaro.backend.habits.internal.application.dto.habitTypeDetails;

import com.lautaro.backend.habits.internal.domain.entity.habitTypes.SocialActivityHabit;
import com.lautaro.backend.habits.internal.domain.enums.SocialActivityEnum;

public record SocialActivityDetailsDTO(
        double value,
        SocialActivityEnum units
) implements HabitDetailsDto {
    public static SocialActivityDetailsDTO fromEntity(SocialActivityHabit habit) {
        return new SocialActivityDetailsDTO(
                habit.getValue(),
                habit.getUnits()
        );
    }
}
