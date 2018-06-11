package com.laurencetrippen.tasksystem4j;

import java.util.Date;
import java.util.TimerTask;

public abstract class Task extends TimerTask {

	private Date executionDate;
	private long intervall;
	
	public Task(Date executionDate) {
		this.executionDate = executionDate;
		this.intervall = 0L;
	}
	
	public Task(Date executionDate, long intervall) {
		this.executionDate = executionDate;
		this.intervall = intervall;
	}
	
	public Date getExcutionDate() {
		return executionDate;
	}
	
	public long getIntervall() {
		return intervall;
	}
	
	public abstract void run();
}