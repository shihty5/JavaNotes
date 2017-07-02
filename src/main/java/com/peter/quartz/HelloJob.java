package com.peter.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class HelloJob implements Job{

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		//print out date
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("Current time is" + sdf.format(date));
		
		System.out.println("Hello World");
	}
	
}
