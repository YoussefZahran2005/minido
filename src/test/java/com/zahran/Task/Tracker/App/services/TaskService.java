package com.zahran.Task.Tracker.App.services;

import com.zahran.Task.Tracker.App.domain.Entities.Task;
import com.zahran.Task.Tracker.App.domain.*;

public interface TaskService {
    Task createTask (CreateTaskRequest request);
}
