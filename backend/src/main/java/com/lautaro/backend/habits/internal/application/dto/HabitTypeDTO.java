package com.lautaro.backend.habits.internal.application.dto;

public class HabitTypeDTO {
    private String value;
    private String translation;

    public HabitTypeDTO(String value, String translation) {
        this.value = value;
        this.translation = translation;
    }

    public String getValue() {
        return value;
    }

    public String getTranslation() {
        return translation;
    }
}
