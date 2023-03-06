package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.annotation.Logger;
import org.example.domain.Status;
import org.example.domain.Task;
import org.example.repository.TaskRepository;
import org.example.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    @Override
    @Logger
    public List<Task> findTaskByStatus(Status status) {
        return taskRepository.findAllByStatus(status);
    }
}
