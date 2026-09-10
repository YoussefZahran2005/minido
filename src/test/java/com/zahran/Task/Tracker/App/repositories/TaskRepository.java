package com.zahran.Task.Tracker.App.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zahran.Task.Tracker.App.domain.Entities.Task;

public interface TaskRepository extends  JpaRepository<Task, UUID>{

}
