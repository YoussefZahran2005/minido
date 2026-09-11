package com.zahran.Task.Tracker.App.services.impl;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.zahran.Task.Tracker.App.domain.CreateTaskRequest;
import com.zahran.Task.Tracker.App.domain.UpdateTaskRequest;
import com.zahran.Task.Tracker.App.domain.Entities.Task;
import com.zahran.Task.Tracker.App.domain.Entities.TaskStatus;
import com.zahran.Task.Tracker.App.exceptions.TaskNotFoundException;
import com.zahran.Task.Tracker.App.repositories.TaskRepository;
import com.zahran.Task.Tracker.App.services.TaskService;

@Service 
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

    @Override
    public List<Task> listTasks() {
        return taskRepository.findAll(Sort.by(Direction.ASC, "created"));
    }

    @Override
    public Task updateTask(UUID taskId, UpdateTaskRequest request) {
        Task task = taskRepository.findById(taskId)
            .orElseThrow(() -> new TaskNotFoundException(taskId));

        task.setTitle(request.title());
        task.setDescription(request.description());
        task.setDate(request.dueDate());
        task.setStatus(request.status());
        task.setPriority(request.priority());
        task.setUpdated(Instant.now());

        return taskRepository.save(task);
    }

    @Override
    public void deleteTask(UUID taskId) {
        taskRepository.deleteById(taskId);
    }

}
