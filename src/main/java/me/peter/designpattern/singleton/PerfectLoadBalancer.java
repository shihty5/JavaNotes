package me.peter.designpattern.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PerfectLoadBalancer {
	private static volatile PerfectLoadBalancer instance = null;
	private List serverList = null;

	private PerfectLoadBalancer() {
		serverList = new ArrayList();
	};

	// 1. 线程安全，但是性能消耗过高
	synchronized public static PerfectLoadBalancer getInstance1() {
		if (instance == null) {
			instance = new PerfectLoadBalancer();
		}

		return instance;
	}

	// 2. 线程不安全 只是排队依次创建
	public static PerfectLoadBalancer getInstance2() {
		if (instance == null) {
			synchronized (PerfectLoadBalancer.class) {
				instance = new PerfectLoadBalancer();
			}
		}

		return instance;
	}

	// 3. 线程安全 - 必须使用volatile 双重检查锁定(Double-Check Locking 并不完美
	public static PerfectLoadBalancer getInstance3() {

		if (instance == null) {
			synchronized (PerfectLoadBalancer.class) {
				if (instance == null) {
					instance = new PerfectLoadBalancer();
				}
			}
		}

		return instance;
	}
	
	//4. 完美的方案 用内部类
	
	private static class Holder{
		private final static PerfectLoadBalancer instance = new PerfectLoadBalancer();
	}
	
	public static PerfectLoadBalancer getInstance(){
		return Holder.instance;
	}

	
	
	public void addServer(String server) {
		serverList.add(server);
	}

	public void removeServer(String server) {
		serverList.remove(server);
	}

	public String getServer() {
		Random random = new Random();
		int i = random.nextInt(serverList.size());
		return (String) serverList.get(i);
	}
}
