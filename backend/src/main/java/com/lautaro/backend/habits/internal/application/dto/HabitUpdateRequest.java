package com.lautaro.backend.habits.internal.application.dto;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Set;

public record HabitUpdateRequest(
    String name,
    Set<DayOfWeek>scheduleDays,
    LocalDate endDate
) {
}
