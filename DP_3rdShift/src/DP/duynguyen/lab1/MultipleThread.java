package DP.duynguyen.lab1;

public class MultipleThread implements Runnable {
	private String name;
	
	public MultipleThread(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public void run() {
		Logger logger = Logger.getInstance();
		System.out.println("Thread " + name + " " + logger.toString());
	}
}
