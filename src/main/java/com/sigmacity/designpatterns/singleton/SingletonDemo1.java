package com.sigmacity.designpatterns.singleton;

/**
 * 1. Ensure that only one object of it's kind
 * 2. provide single point of access to it from other code.
 * 
 * @author djagatiya
 */

class Application {

	public static Application instance = null;

	private Application() {
	}

	public static Application getInstance() {
		if (instance == null) {
			System.out.println("Creating instance of Application class.");
			instance = new Application();
		}
		return instance;
	}

}

public class SingletonDemo1 {

	public static void main(String[] arg) {
		
		Application instance1 = Application.getInstance();
		Application instance2 = Application.getInstance();

		if (instance1 == instance2) {
			System.out.println("Both are the same..");
		}

	}

}
