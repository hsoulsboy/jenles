package com.jenles.models;

import com.jenles.utils.enums.Status;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_TASKS")
public class TaskModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	
	@Column(nullable = false, length = 25)
	private String title;
	
	@Column(nullable = false, length = 180)
	private String description;
	
	@Column(nullable = false, length = 15)
	private String assignee;
	
	@Column(nullable = false, length = 10)
	private String status = Status.Backlog.toString();
	
	public TaskModel() {}
	
	public TaskModel(String title, String description, String assignee, Status status) {
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
		return assignee;
	}
	
	public String getStatus() {
		return status.toString();
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "TaskModel: " +
				this.getTitle() + " / " +
				this.getDescription() + " / " +
				this.getStatus() + " / " +
				this.getAssignee();
	}
}