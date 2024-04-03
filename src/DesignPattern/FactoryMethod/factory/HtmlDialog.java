package DesignPattern.FactoryMethod.factory;

import DesignPattern.FactoryMethod.buttons.*;

public class HtmlDialog extends Dialog{
	
	@Override
	public Button createButton() {
		return new HtmlButton();
	}
}
