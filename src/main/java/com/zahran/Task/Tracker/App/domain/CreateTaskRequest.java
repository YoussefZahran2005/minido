package com.zahran.Task.Tracker.App.domain;

import java.time.LocalDate;

import com.zahran.Task.Tracker.App.domain.Entities.TaskPriority;

public record CreateTaskRequest(
    String title,
    String description,
    LocalDate dueDate, 
    TaskPriority taskPriority
) {

}
