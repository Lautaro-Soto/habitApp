package com.lautaro.backend.habits.internal.application.dto;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Set;

public record HabitResponseDto(
    Long id,
    String name,
    HabitType type,
    Set<DayOfWeek> scheduleDays,
    int currentStreak,
    int longestStreak,
    boolean archived,
    LocalDate endDate,
    String icon,
    String color,
    HabitDetailsDto details
) {
    /**
     * Converts a Habit entity to a HabitResponseDto.
     *
     * @param habit The Habit entity to convert.
     * @return The converted HabitResponseDto.
     */
    public static HabitResponseDto fromEntity(Habit habit) {
        return new HabitResponseDto(
                habit.getId(),
                habit.getName(),
                habit.getType(),
                habit.getScheduleDays(),//TODO convertir a un array numerico [0 ...6]
                habit.getCurrentStreak(),
                habit.getLongestStreak(),
                habit.isArchived(),
                habit.getEndDate(),
                habit.getIcon(),
                habit.getColor(),
                HabitDetailsDto.fromEntity(habit)
        );
    }
}
