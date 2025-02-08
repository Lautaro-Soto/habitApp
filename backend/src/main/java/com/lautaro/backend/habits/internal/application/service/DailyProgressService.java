package com.lautaro.backend.habits.internal.application.service;

import java.time.LocalDate;

public interface DailyProgressService {
    void recordDailyProgress(Long habitId, LocalDate date, boolean completed);

    double calculateCompletionPercentage(Long habitId);
}
