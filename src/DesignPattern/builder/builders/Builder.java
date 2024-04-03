package DesignPattern.builder.builders;

import DesignPattern.builder.components.*;
import DesignPattern.builder.cars.*;
/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
	void setCarType(CarType type);
	void setSeats(int seats);
	void setEngine(Engine engine);
	void setTransmission(Transmission trasmission);
	void setTripComputer(TripComputer tripComputer);
	void setGPSNavigator(GPSNavigator gpsNavigator);
}
