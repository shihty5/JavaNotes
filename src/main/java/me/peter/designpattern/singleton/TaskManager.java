package me.peter.designpattern.singleton;

public class TaskManager {
	private static TaskManager tm = null;

	public TaskManager getTaskManager() {
		if (tm == null) {
			tm = new TaskManager();
		}

		return tm;
	}
}
