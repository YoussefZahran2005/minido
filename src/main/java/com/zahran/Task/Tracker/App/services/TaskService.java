package com.zahran.Task.Tracker.App.services;

import com.zahran.Task.Tracker.App.domain.Entities.Task;

import java.util.List;
import java.util.UUID;

import com.zahran.Task.Tracker.App.domain.*;

public interface TaskService {
    Task createTask(CreateTaskRequest request);

    List<Task> listTasks();

    Task updateTask(UUID taskId, UpdateTaskRequest request);

    void deleteTask(UUID taskId);
}
