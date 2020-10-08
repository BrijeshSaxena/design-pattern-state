package org.trishinfotech.state;

public class ReadyForPacking implements ShipmentState {

	public ReadyForPacking() {
		super();
	}

	@Override
	public void processShipment(ShipmentContext context) {
		Shipment shipment = context.getShipment();
		System.out.printf("Order#'%s' for '%s' has status '%s'.\nDelivery Address is '%s'\n", shipment.getOrderNumber(),
				shipment.getOrderItem(), name(), shipment.getDeliveryAddress());
		System.out.println("--------------------------------------------------------------");
		context.setCurrentState(new ReadyToDeliver());
	}

	@Override
	public String name() {
		return "Ready For Packing";
	}
}
