package com.app.utils;

import java.util.Comparator;
import java.util.List;

import com.app.task.Status;
import com.app.task.Task;

public class TaskUtility {
	
	//add a method to remove the task
	public static Task deletTask(int id,List<Task> taskList) {
		Task task = new Task(id);
		int index = taskList.indexOf(task);
		Task t1 = taskList.get(index);
		if(index != -1 && taskList.contains(task)) {
			t1.setActive(false);
		}
		return task;
	}

	//add a method to update the status
	public static void UpdateStatus(int id, String status, List<Task> taskList) {
		Task task = new Task(id);
		int index = taskList.indexOf(task);
		Task t1 = taskList.get(index);
		Status st = Status.valueOf(status.toUpperCase()); 
		if(index != -1 && taskList.contains(task)) {
			t1.setStatus(st);
		}
		
	}

	
	
}
