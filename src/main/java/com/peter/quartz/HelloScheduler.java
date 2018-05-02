package com.peter.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

public class HelloScheduler {

    public static void main(String[] args) throws SchedulerException {
        JobDetail jobDetail = JobBuilder.newJob(HelloJob.class).withIdentity("myJob", "group1").build();
        Trigger trigger = TriggerBuilder.
                newTrigger().
                withIdentity("myTrigger", "group1").
                startNow()
                .withSchedule(
                        SimpleScheduleBuilder.simpleSchedule().
                                withIntervalInSeconds(2).repeatForever())
                .build();
        SchedulerFactory factory = new StdSchedulerFactory();
        Scheduler scheduler = factory.getScheduler();
        scheduler.start();
        scheduler.scheduleJob(jobDetail, trigger);

        //print out date
//		Date date = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		System.out.println("Current time is" + sdf.format(date));
    }

}
