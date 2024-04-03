package DesignPattern.AbstractFactory.factories;

import DesignPattern.AbstractFactory.buttons.*;
import DesignPattern.AbstractFactory.checkboxes.*;

public interface GUIFactory {
	Button createButton();
	Checkbox createCheckbox();
}
