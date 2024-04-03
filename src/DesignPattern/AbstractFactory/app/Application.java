package DesignPattern.AbstractFactory.app;

import DesignPattern.AbstractFactory.buttons.Button;
import DesignPattern.AbstractFactory.checkboxes.Checkbox;
import DesignPattern.AbstractFactory.factories.GUIFactory;

public class Application {
	private Button button;
	private Checkbox checkbox;
	
	public Application(GUIFactory factory) {
		button = factory.createButton();
		checkbox = factory.createCheckbox();
	}
	
	public void paint() {
		button.paint();
		checkbox.paint();
	}
}
