package com.laurencetrippen.tasksystem4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

public class TaskSystem {

	private List<Task> tasks;
	
	public void addTask(Task task) {
		if (this.tasks == null) {
			this.tasks = new ArrayList<>();
		}
		
		if (task != null) {
			this.tasks.add(task);
		}
	}
	
	public void start() {
		for (Task task : this.tasks) {
			Timer timer = new Timer();
			if (task.getIntervall() > 0) {				
				timer.schedule(task, task.getExcutionDate(), task.getIntervall());
			} else {
				timer.schedule(task, task.getExcutionDate());
			}
		}
	}
}