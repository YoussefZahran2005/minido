package com.zahran.Task.Tracker.App.mappers;

import com.zahran.Task.Tracker.App.domain.CreateTaskRequest;
import com.zahran.Task.Tracker.App.domain.DTOs.CreateTaskRequestDto;
import com.zahran.Task.Tracker.App.domain.DTOs.TaskDto;
import com.zahran.Task.Tracker.App.domain.Entities.Task;

public interface TaskMapper {
    CreateTaskRequest fromDto(CreateTaskRequestDto dto);

    TaskDto toDto(Task task); 
}
