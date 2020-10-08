package org.trishinfotech.state;

public class Received implements ShipmentState {

	public Received() {
		super();
	}

	@Override
	public void processShipment(ShipmentContext context) {
		Shipment shipment = context.getShipment();
		System.out.printf("Order#'%s' for '%s' has status '%s'.\nDelivery Address is '%s'\n", shipment.getOrderNumber(),
				shipment.getOrderItem(), name(), shipment.getDeliveryAddress());
		System.out.println("--------------------------------------------------------------");
		// this is the end of the order processing.
		// if we like to make it further to return the item we can uncomment the below line.
		// context.setCurrentState(new Returned());
	}

	@Override
	public String name() {
		return "Received";
	}
}
