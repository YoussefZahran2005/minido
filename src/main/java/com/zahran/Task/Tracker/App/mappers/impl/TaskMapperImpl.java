package com.zahran.Task.Tracker.App.mappers.impl;

import org.hibernate.sql.Update;
import org.springframework.stereotype.Component;

import com.zahran.Task.Tracker.App.domain.CreateTaskRequest;
import com.zahran.Task.Tracker.App.domain.UpdateTaskRequest;
import com.zahran.Task.Tracker.App.domain.DTOs.CreateTaskRequestDto;
import com.zahran.Task.Tracker.App.domain.DTOs.TaskDto;
import com.zahran.Task.Tracker.App.domain.DTOs.UpdateTaskRequestDto;
import com.zahran.Task.Tracker.App.domain.Entities.Task;
import com.zahran.Task.Tracker.App.mappers.TaskMapper;

@Component
public class TaskMapperImpl implements TaskMapper {

    @Override
    public CreateTaskRequest fromDto(CreateTaskRequestDto dto) {
        return new CreateTaskRequest(
                dto.title(),
                dto.description(),
                dto.dueDate(),
                dto.priority());
    }

    @Override
    public TaskDto toDto(Task task) {
        return new TaskDto(task.getId(), task.getTitle(), task.getDescription(), task.getDate(), task.getPriority(),
                task.getStatus());
    }

    @Override
    public UpdateTaskRequest fromDto(UpdateTaskRequestDto dto) {
        return new UpdateTaskRequest(
                dto.title(),
                dto.description(),
                dto.dueDate(),
                dto.status(),
                dto.priority());
    }

}
