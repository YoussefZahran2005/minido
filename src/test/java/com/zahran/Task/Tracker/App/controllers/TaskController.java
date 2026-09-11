package com.zahran.Task.Tracker.App.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zahran.Task.Tracker.App.domain.CreateTaskRequest;
import com.zahran.Task.Tracker.App.domain.DTOs.CreateTaskRequestDto;
import com.zahran.Task.Tracker.App.domain.DTOs.TaskDto;
import com.zahran.Task.Tracker.App.domain.Entities.Task;
import com.zahran.Task.Tracker.App.mappers.TaskMapper;
import com.zahran.Task.Tracker.App.services.TaskService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/api/v1/tasks")
public class TaskController {

    private final TaskService taskService;
    private final TaskMapper taskMapper;

    public TaskController(TaskService taskService, TaskMapper taskMapper) {
        this.taskService = taskService;
        this.taskMapper = taskMapper;
    }

    public ResponseEntity<TaskDto> createTask(
       @Valid @RequestBody  CreateTaskRequestDto createTaskRequestDto
    ) {
        CreateTaskRequest createTaskRequest = taskMapper.fromDto(createTaskRequestDto);
        Task task = taskService.createTask(createTaskRequest); 
        TaskDto taskDto = taskMapper.toDto(task);

        return new ResponseEntity<>(taskDto, HttpStatus.CREATED);
    }
}
