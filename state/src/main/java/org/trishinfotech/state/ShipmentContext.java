package org.trishinfotech.state;

public class ShipmentContext {

	protected Shipment shipment;
	protected ShipmentState currentState;
	protected boolean customerAtLocation = false;
	protected int currentLocationIndex = 0;

	public ShipmentContext(Shipment shipment) {
		super();
		this.shipment = shipment;
		this.currentState = new OrderPlaced();
	}

	public Shipment getShipment() {
		return shipment;
	}

	public void setShipment(Shipment shipment) {
		this.shipment = shipment;
	}

	public ShipmentState getCurrentState() {
		return currentState;
	}

	public void setCurrentState(ShipmentState currentState) {
		this.currentState = currentState;
	}

	public int getCurrentLocationIndex() {
		return currentLocationIndex;
	}

	public void setCurrentLocationIndex(int currentLocationIndex) {
		this.currentLocationIndex = currentLocationIndex;
	}

	public boolean isCustomerAtLocation() {
		return customerAtLocation;
	}

	public void setCustomerAtLocation(boolean customerAtLocation) {
		this.customerAtLocation = customerAtLocation;
	}

	public void processShipment() {
		currentState.processShipment(this);
	}

}
