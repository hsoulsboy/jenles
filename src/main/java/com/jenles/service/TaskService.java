package com.jenles.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jenles.model.AssigneeModel;
import com.jenles.model.TaskModel;

@Service
public class TaskService {
	
	public List<TaskModel> getTasks() {
		AssigneeModel assignee = new AssigneeModel("Assignee Test");
		return List.of(
				new TaskModel("Title test", "Description test", assignee));
	}
}