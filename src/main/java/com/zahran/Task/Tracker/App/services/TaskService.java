package com.zahran.Task.Tracker.App.services;

import com.zahran.Task.Tracker.App.domain.Entities.Task;

import java.util.List;

import com.zahran.Task.Tracker.App.domain.*;

public interface TaskService {
    Task createTask(CreateTaskRequest request);

    List<Task> listTasks();
}
