package com.app.compare;

import java.util.Comparator;

import com.app.task.Task;

public class TaskComparator implements Comparator<Task> {

	@Override
	public int compare(Task o1, Task o2) {
		
		return o1.getTaskDate().compareTo(o2.getTaskDate());
	}



}
