package DesignPattern.FactoryMethod.factory;

import DesignPattern.FactoryMethod.buttons.*;

public class WindowsDialog extends Dialog{
	
	@Override
	public Button createButton() {
		return new WindowsButton();
	}
}
