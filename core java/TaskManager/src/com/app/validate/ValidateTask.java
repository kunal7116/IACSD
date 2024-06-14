package com.app.validate;

import java.time.LocalDate;

import com.app.task.Task;

public class ValidateTask {

	public static Task validate(int taskID,String tname, String description, String tdate) {
		LocalDate tdate1 = LocalDate.parse(tdate);
		return new Task(taskID,tname,description,tdate1);
	}


}
