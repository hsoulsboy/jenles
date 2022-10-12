package com.jenles;

public class Task {
	private String title;
	private String description;
	private Assignee assignee;
	private Status status = Status.Backlog;
	
	public Task(String title, String description, Assignee assignee) {
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