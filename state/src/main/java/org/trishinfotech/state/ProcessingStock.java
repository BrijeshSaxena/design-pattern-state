package org.trishinfotech.state;

public class ProcessingStock implements ShipmentState {

	public ProcessingStock() {
		super();
	}

	@Override
	public void processShipment(ShipmentContext context) {
		Shipment shipment = context.getShipment();
		System.out.printf("Order#'%s' for '%s' has status '%s'.\nDelivery Address is '%s'\n", shipment.getOrderNumber(),
				shipment.getOrderItem(), name(), shipment.getDeliveryAddress());
		System.out.println("--------------------------------------------------------------");
		context.setCurrentState(new ReadyForPacking());
	}

	@Override
	public String name() {
		return "Processing Stock";
	}
}
