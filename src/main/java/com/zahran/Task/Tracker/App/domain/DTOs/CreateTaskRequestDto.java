package com.zahran.Task.Tracker.App.domain.DTOs;

import java.time.LocalDate;

import org.hibernate.validator.constraints.Length;

import com.zahran.Task.Tracker.App.domain.Entities.TaskPriority;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CreateTaskRequestDto(
        @NotBlank(message = ERROR_MESSAGE_TITLE_LENGTH) 
        @Length(max = 255, message = ERROR_MESSAGE_TITLE_LENGTH) 
        String title,

        @Nullable 
        @Length(max = 1000, message = ERROR_MESSAGE_DESCRIPTION_LENGTH) 
        String description,

        @Nullable 
        @FutureOrPresent(message = ERROR_MESSAGE_DATE_TIME)
        LocalDate dueDate,

        @NotNull(message = ERROR_MESSAGE_PRIORITY)
        TaskPriority priority) 
        
        {
    private static final String ERROR_MESSAGE_TITLE_LENGTH = 
    "The title must be between 1 and 255 characters";

    private static final String ERROR_MESSAGE_DESCRIPTION_LENGTH = 
    "The description must be between 1 and 1000 characters";

    private static final String ERROR_MESSAGE_DATE_TIME = 
    "The due date must be in the current moment or in the future.";

    private static final String ERROR_MESSAGE_PRIORITY = 
    "Task priorty must be there.";
}
