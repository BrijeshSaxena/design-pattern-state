package org.trishinfotech.state;

public interface ShipmentState {
	public String name();
	public void processShipment(ShipmentContext context);
}
