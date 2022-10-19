package com.jenles.dtos;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class TaskDTO {

	@NotNull
	@Size(max = 25)
	private String title;
	
	@NotNull
	@Size(max = 180)
	private String description;
	
	@NotNull
	@Size(max = 15)
	private String assignee;
	
	public String getTitle() {
		return title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getAssignee() {
		return assignee;
	}

	@Override
	public String toString() {
		return "TaskDTO: " +
				this.getTitle() + " / " +
				this.getDescription() + " / " +
				this.getAssignee();
	}
}