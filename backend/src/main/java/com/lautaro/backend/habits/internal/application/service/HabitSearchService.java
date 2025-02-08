package com.lautaro.backend.habits.internal.application.service;

import com.lautaro.backend.habits.internal.application.dto.HabitResponseDto;
import com.lautaro.backend.habits.internal.application.dto.HabitSearchCriteria;
import com.lautaro.backend.shared.application.dto.PageResponse;
import org.springframework.data.domain.Pageable;

public interface HabitSearchService {

    PageResponse<HabitResponseDto> pageSearch(HabitSearchCriteria searchCriteria, Pageable pageable);
}
