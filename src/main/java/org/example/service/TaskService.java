package org.example.service;

import org.example.domain.Status;
import org.example.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskService {

    List<Task> findTaskByStatus(Status status);
}
