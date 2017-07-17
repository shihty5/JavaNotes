package me.peter.designpattern.part1.singleton;

public class TaskManager {
	private static TaskManager tm = null;

	public TaskManager getTaskManager() {
		if (tm == null) {
			tm = new TaskManager();
		}

		return tm;
	}
}
