package com.lautaro.backend.habits.internal.application.dto.habitTypeDetails;

import com.lautaro.backend.habits.internal.domain.entity.Habit;
import com.lautaro.backend.habits.internal.domain.entity.habitTypes.*;

public sealed interface HabitDetailsDto
        permits BadHabitsTrackingDetailsDTO, FinancesDetailsDTO, HealthyLivingDetailsDTO, LearningDetailsDTO, OtherHabitDetailDTO, PhysicalActivityDetailsDTO, SocialActivityDetailsDTO {


    static HabitDetailsDto fromEntity(Habit habit) {
        return switch (habit.getType()) {
            case BAD_HABITS -> BadHabitsTrackingDetailsDTO.fromEntity((BadHabitsTracking) habit);
            case FINANCES -> FinancesDetailsDTO.fromEntity((FinancesHabit) habit);
            case HEALTHY_LIVING -> HealthyLivingDetailsDTO.fromEntity((HealthyLivingHabit) habit);
            case LEARNING -> LearningDetailsDTO.fromEntity((LearningHabit) habit);
            case OTHER -> OtherHabitDetailDTO.fromEntity((OtherHabit) habit);
            case PHYSICAL_ACTIVITY -> PhysicalActivityDetailsDTO.fromEntity((PhysicalActivityHabit) habit);
            case SOCIAL_ACTIVITY -> SocialActivityDetailsDTO.fromEntity((SocialActivityHabit) habit);
        };
    }
}
