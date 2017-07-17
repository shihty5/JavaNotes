package me.peter.designpattern.part1.prototype;

import java.io.Serializable;

public class Attachment implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8325281578399711436L;
	
	private String name;
	private String context;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public void download(){
		System.out.println("Start to download.");
	}
}
