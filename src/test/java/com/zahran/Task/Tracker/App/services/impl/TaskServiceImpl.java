package com.zahran.Task.Tracker.App.services.impl;

import java.time.Instant;

import com.zahran.Task.Tracker.App.domain.CreateTaskRequest;
import com.zahran.Task.Tracker.App.domain.Entities.Task;
import com.zahran.Task.Tracker.App.domain.Entities.TaskStatus;
import com.zahran.Task.Tracker.App.repositories.TaskRepository;
import com.zahran.Task.Tracker.App.services.TaskService;

public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;

    @Override
    public Task createTask(CreateTaskRequest request) {
        Instant now = Instant.now();

        Task task = new Task(null,
                request.title(),
                request.description(),
                request.dueDate(),
                TaskStatus.OPEN, request.taskPriority(),
                now,
                now);

        return taskRepository.save(task);
    }

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

}
