package com.zahran.Task.Tracker.App.domain;

import java.time.LocalDate;

import com.zahran.Task.Tracker.App.domain.Entities.TaskPriority;
import com.zahran.Task.Tracker.App.domain.Entities.TaskStatus;

public record UpdateTaskRequest(
    String title,
    String description, 
    LocalDate dueDate,
    TaskStatus status,
    TaskPriority priority
) {

}
