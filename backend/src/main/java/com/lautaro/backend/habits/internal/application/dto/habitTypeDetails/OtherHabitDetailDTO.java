package com.lautaro.backend.habits.internal.application.dto.habitTypeDetails;


import com.lautaro.backend.habits.internal.domain.entity.habitTypes.OtherHabit;

public record OtherHabitDetailDTO(
    String customNotes
) implements HabitDetailsDto {
    public static OtherHabitDetailDTO fromEntity(OtherHabit habit) {
        return new OtherHabitDetailDTO(
                habit.getCustomNotes()
        );
    }
}
