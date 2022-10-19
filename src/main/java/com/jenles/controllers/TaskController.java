package com.jenles.controllers;

import com.jenles.dtos.TaskDTO;
import com.jenles.models.TaskModel;
import com.jenles.services.TaskService;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	@PostMapping
	public ResponseEntity<TaskModel> registerTask(@RequestBody @Valid TaskDTO taskDTO){
		TaskModel taskModel = new TaskModel();
		BeanUtils.copyProperties(taskDTO, taskModel);
		return ResponseEntity.status(HttpStatus.CREATED).body(taskService.registerTask(taskModel));
	}
}