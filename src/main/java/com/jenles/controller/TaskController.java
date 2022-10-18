package com.jenles.controller;

import com.jenles.service.TaskService;
import com.jenles.model.TaskModel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tasks")
public class TaskController {
	private TaskService taskService;
	
	@Autowired
	public TaskController(TaskService taskService) {
		this.taskService = taskService;
	}
	
	@GetMapping
	public List<TaskModel> getTasks(){
		return taskService.getTasks();
	}
	
	@GetMapping("/hell")
	public String getTasksTest(){
		return "<html><h1>Hell</h1></html>";
	}
}