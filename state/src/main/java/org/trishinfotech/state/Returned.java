package org.trishinfotech.state;

public class Returned implements ShipmentState {

	public Returned() {
		super();
	}

	@Override
	public void processShipment(ShipmentContext context) {
		Shipment shipment = context.getShipment();
		System.out.printf("Order#'%s' for '%s' has status '%s'.\nDelivery Address is '%s'\n", shipment.getOrderNumber(),
				shipment.getOrderItem(), name(), shipment.getDeliveryAddress());
		System.out.println("--------------------------------------------------------------");
		// If we like to ship replacement we can uncomment the below line and implement
		// status for replacement.
		// context.setCurrentState(...));
	}

	@Override
	public String name() {
		return "Returned";
	}
}
