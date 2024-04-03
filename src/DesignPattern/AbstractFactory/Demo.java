package DesignPattern.AbstractFactory;

import DesignPattern.AbstractFactory.app.*;
import DesignPattern.AbstractFactory.factories.*;

public class Demo {
	
	private static Application configureApplication() {
		Application app;
		GUIFactory factory;
		String osName = System.getProperty("os.name").toLowerCase();
		if (osName.contains("mac")) {
			factory = new MacOSFactory();
		}else {
			factory = new WindowsFactory();
		}
		app =new Application(factory);
		return app;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application app;
		app = configureApplication();
		app.paint();
	}

}
