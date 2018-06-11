# TaskSystem4j by Laurence Trippen
An easy library to create Java based tasks with timers.

## The Tester class

```java
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import com.laurencetrippen.tasksystem4j.Task;
import com.laurencetrippen.tasksystem4j.TaskSystem;

public class Tester {

	private static class HelloWorldTask extends Task {

		public HelloWorldTask(Date executionDate) {
			super(executionDate);
		}
		
		public HelloWorldTask(Date executionDate, long intervall) {
			super(executionDate, intervall);
		}

		@Override
		public void run() {
			System.out.println("Hallo Welt!");
		}
	}
	
	public static void main(String[] args) throws ParseException {
		TaskSystem taskSystem = new TaskSystem();
    
    // execute this task every minute
		taskSystem.addTask(new HelloWorldTask(new SimpleDateFormat("dd-MM-yyyy").parse("11-06-2018"), TimeUnit.MINUTES.toMillis(1)));
		
    // execute the task once a day
    taskSystem.addTask(new HelloWorldTask(new SimpleDateFormat("dd-MM-yyyy").parse("11-06-2018")));
		taskSystem.start();
	}
}
```
