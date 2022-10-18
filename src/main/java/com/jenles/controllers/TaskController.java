package com.jenles.controllers;

import com.jenles.models.TaskModel;
import com.jenles.services.TaskService;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TaskController {
	private TaskService taskService;
	
	public TaskController(TaskService taskService) {
		this.taskService = taskService;
	}
	
	@GetMapping
	public List<TaskModel> getTasks(){
		return taskService.getTasks();
	}
}