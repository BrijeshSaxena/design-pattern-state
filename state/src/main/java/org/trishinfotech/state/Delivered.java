package org.trishinfotech.state;

public class Delivered implements ShipmentState {

	protected String deliveryNote;
	public Delivered() {
		super();
	}

	@Override
	public void processShipment(ShipmentContext context) {
		Shipment shipment = context.getShipment();
		deliveryNote = "Order Package Handover to Customer";
		System.out.printf("Order#'%s' for '%s' has status '%s (%s)'.\nDelivery Address is '%s'\n", shipment.getOrderNumber(),
				shipment.getOrderItem(), name(), deliveryNote, shipment.getDeliveryAddress());
		System.out.println("--------------------------------------------------------------");
		context.setCurrentState(new Received());
	}

	public String getDeliveryNote() {
		return deliveryNote;
	}

	public void setDeliveryNote(String deliveryNote) {
		this.deliveryNote = deliveryNote;
	}

	@Override
	public String name() {
		return "Delivered";
	}

}
