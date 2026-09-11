package com.zahran.Task.Tracker.App.exceptions;

import java.util.UUID;

public class TaskNotFoundException extends RuntimeException {
    private final UUID id;

    public TaskNotFoundException(UUID id) {
        super(String.format("The Task with the ID '%s' is not found.", id));
        this.id = id;
    }

    public UUID getId() {
        return id;
    }
}
