package com.lautaro.backend.habits.internal.application.service.impl;


import com.lautaro.backend.habits.internal.application.dto.HabitResponseDto;
import com.lautaro.backend.habits.internal.application.dto.HabitSearchCriteria;
import com.lautaro.backend.habits.internal.application.service.HabitSearchService;
import com.lautaro.backend.habits.internal.infra.persistence.HabitSearchQuery;
import com.lautaro.backend.shared.application.dto.PageResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
//RequiredArgsConstructor lombok no funciona
public class HabitSearchServiceImpl implements HabitSearchService {

    private final HabitSearchQuery habitSearchQuery;

    public HabitSearchServiceImpl (HabitSearchQuery habitSearchQuery) {
        this.habitSearchQuery = habitSearchQuery;
    }

    /**
     * Executes a search for habits based on the given criteria and pagination settings.
     *
     * @param searchCriteria The criteria to search for habits.
     * @param pageable       The pagination settings.
     * @return A page of HabitResponseDto representing the habits that match the search criteria.
     */
    @Override
    public PageResponse<HabitResponseDto> pageSearch(HabitSearchCriteria searchCriteria, Pageable pageable) {
        return habitSearchQuery.pageSearch(searchCriteria, pageable);
    }
}
