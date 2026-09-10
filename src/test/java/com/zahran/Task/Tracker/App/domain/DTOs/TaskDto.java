package com.zahran.Task.Tracker.App.domain.DTOs;

import java.time.LocalDate;
import java.util.UUID;

import com.zahran.Task.Tracker.App.domain.Entities.TaskPriority;
import com.zahran.Task.Tracker.App.domain.Entities.TaskStatus;

// we don't need validation here as this is a response, so it's not an input circumstance. 

public record TaskDto(
    UUID id,
    String title,
    String description, 
    LocalDate dueDate,
    TaskPriority priority,
    TaskStatus status
) {

}
