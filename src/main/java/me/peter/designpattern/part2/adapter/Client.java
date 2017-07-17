package me.peter.designpattern.part2.adapter;

public class Client {

	public static void main(String[] args) {
		IEngine engine = new NewEngine();
		System.out.println(engine.outputPower());
	}

}
