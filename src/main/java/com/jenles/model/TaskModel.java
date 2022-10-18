package com.jenles.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.jenles.utils.enums.Status;

@Entity
@Table
public class TaskModel {
	private String title;
	private String description;
	private AssigneeModel assignee;
	private Status status = Status.Backlog;
	
	public TaskModel(String title, String description, AssigneeModel assignee) {
		this.title = title;
		this.description = description;
		this.assignee = assignee;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getAssignee() {
		return assignee.getName();
	}
	
	public String getStatus() {
		return status.toString();
	}
	
}