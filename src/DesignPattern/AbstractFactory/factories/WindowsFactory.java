package DesignPattern.AbstractFactory.factories;

import DesignPattern.AbstractFactory.buttons.*;
import DesignPattern.AbstractFactory.checkboxes.*;

public class WindowsFactory implements GUIFactory{
	@Override
	public Button createButton() {
		return new WindowsButton();
	}
	@Override
	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}
}
