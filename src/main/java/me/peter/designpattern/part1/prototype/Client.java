package me.peter.designpattern.part1.prototype;

import java.io.IOException;

public class Client {

	public static void main(String[] args) {
		WeeklyEmail we = new WeeklyEmail();
		we.setDate("Today");
		we.setName("Peter");
		we.setTask("Reskin");
		we.setAtt(new Attachment());

		WeeklyEmail newWE;

		try {
			newWE = we.deepClone();
			System.out.println(we.getAtt() == newWE.getAtt());
			
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}

	}

}
