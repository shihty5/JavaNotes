package me.peter.designpattern.part1.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class WeeklyEmail implements Serializable {
	private String name;
	private String date;
	private String task;
	private Attachment att;

	public Attachment getAtt() {
		return att;
	}

	public void setAtt(Attachment att) {
		this.att = att;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public WeeklyEmail deepClone() throws IOException, ClassNotFoundException {
		// 将对象写入流中
		ByteArrayOutputStream bao = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bao);
		oos.writeObject(this);

		// 将对象从流中取出
		ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return (WeeklyEmail) ois.readObject();
	}

	@Override
	public String toString() {

		String info = this.date + ", " + this.name + "'s Task is " + this.task;
		return info;

	}
}
