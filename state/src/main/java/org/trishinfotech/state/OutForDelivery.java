package org.trishinfotech.state;

public class OutForDelivery implements ShipmentState {

	public OutForDelivery() {
		super();
	}

	@Override
	public void processShipment(ShipmentContext context) {
		Shipment shipment = context.getShipment();
		System.out.printf("Order#'%s' for '%s' has status '%s'.\nDelivery Address is '%s'\n", shipment.getOrderNumber(),
				shipment.getOrderItem(), name(), shipment.getDeliveryAddress());
		System.out.println("--------------------------------------------------------------");
		if (context.isCustomerAtLocation()) {
			context.setCurrentState(new Delivered());
		} else {
			context.setCurrentState(new DeliveryAttempted("Customer not at Home!"));
		}
	}

	@Override
	public String name() {
		return "Out For Delivery";
	}
}
