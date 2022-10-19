package com.jenles.services;

import com.jenles.models.TaskModel;
import com.jenles.repositories.TaskRepository;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
	
	private final TaskRepository taskRepository;
	
	public TaskService(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}
	
	public List<TaskModel> getTasks() {
		return taskRepository.findAll();
	}

	public TaskModel registerTask(TaskModel taskModel) {
		return taskRepository.save(taskModel);
	}
}