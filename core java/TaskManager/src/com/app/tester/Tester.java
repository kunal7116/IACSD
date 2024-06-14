package com.app.tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.app.compare.TaskComparator;
import com.app.task.Status;
import com.app.task.Task;
import com.app.utils.TaskUtility;
import com.app.validate.ValidateTask;

public class Tester {

	public static void main(String[] args) {
		System.out.println("------TASK MANAGER------");
		try (Scanner sc = new Scanner(System.in)) {
			List<Task> taskList = new ArrayList<>();
			boolean exit = false;
			while (!exit) {
				System.out.println(
						"1. Add New Task \n" + "2.Display Task \n" + "3. Delete a task \n" + "4. Update task status \n"
								+ "5. Display all pending tasks \n" + "6. Display all pending tasks for today \n"
								+ "7.  Display all tasks sorted by taskDate \n" + "8. Exit");
				System.out.println("Enter Your Choice");
				int choice = sc.nextInt();
				try {
					switch (choice) {
					case 1:
//						taskId;
//						taskName;
//						description;
//						taskDate;
//						status;
//						active;
						// For adding task
						System.out.println("Enter the details to add task");
						System.out.println("Task-Id");
						int tid = sc.nextInt();
						System.out.println("Task-Name");
						String tname = sc.next();
						System.out.println("Description");
						String descp = sc.next();
						System.out.println("Task-Date");
						String tdate = sc.next();
						Task task = ValidateTask.validate(tid,tname, descp, tdate);
						taskList.add(task);
						System.out.println("Task added successfully...");
						break;

					case 2:
						// display task details
						Collections.sort(taskList);
						for (Task t : taskList) {
							System.out.println(t);
						}
						break;

					case 3:
						// delete the task
						System.out.println("Enter the id to delete the task");
						TaskUtility.deletTask(sc.nextInt(), taskList);
						System.out.println("Task deleted successfully...");
						break;

					case 4:
						// update task status
						System.out.println("Enter the Id and Status");
						TaskUtility.UpdateStatus(sc.nextInt(), sc.next(), taskList);
						System.out.println("Task updated successfully...");
						break;
					
					case 5:
						//display only those data whose status is pending
						for (Task task1 : taskList) {
							if(task1.getStatus()==Status.PENDING) {
								System.out.println(task1);
							}
						}
						
						break;
					
					case 6:
						for (Task task2 : taskList) {
							if(task2.getStatus()==Status.PENDING && task2.getTaskDate().equals(LocalDate.now())) {
//								System.out.println("efbjbjf");
								System.out.println(task2);
							}
						}
						break;
						
					case 7:
						Collections.sort(taskList,new TaskComparator());
						taskList.forEach(l->System.out.println(l));
						break;
						
					case 8:
						exit = true;
						System.out.println("Exiting...");
						break;

					default:
						System.out.println("Not a valid Input!!!");
						break;
					}

				} catch (Exception e) {

				}

			}

		}

	}

}
