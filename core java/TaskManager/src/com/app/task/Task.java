package com.app.task;

import java.time.LocalDate;


public class Task implements Comparable<Task> {
	
	private int taskId;
	private String taskName;
	private String description;
	private LocalDate taskDate;
	private Status status;
	private boolean active;
	//private static int idGenerator;
	
	
	public Task(int taskId, String taskName, String description, LocalDate taskDate, Status status, boolean active) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.description = description;
		this.taskDate = taskDate;
		this.status = Status.PENDING;
		this.active = true;
		//this.taskId=++idGenerator;
	}


	public Task(int taskId,String tname, String description2, LocalDate tdate1) {
		this.taskId=taskId;
		this.taskName=tname;
		this.description=description2;
		this.taskDate=tdate1;
		this.status = Status.PENDING;
		this.active = true;
		//this.taskId=++idGenerator;
	}


	public Task(int id) {
		this.taskId=id;
	}


	public int getTaskId() {
		return taskId;
	}


	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}


	public String getTaskName() {
		return taskName;
	}


	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public LocalDate getTaskDate() {
		return taskDate;
	}


	public void setTaskDate(LocalDate taskDate) {
		this.taskDate = taskDate;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Task)) {
			return false;
		}
		Task other = (Task) obj;
		return taskId == other.taskId;
	}


	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskName=" + taskName + ", description=" + description + ", taskDate="
				+ taskDate + ", status=" + status + ", active=" + active + "]";
	}


	@Override
	public int compareTo(Task o) {
		if(this.taskId<o.taskId)
			return -1;
		else if(this.taskId>o.taskId)
			return 1;
		return 0;
		
	}
	
	
	
	
	
}
