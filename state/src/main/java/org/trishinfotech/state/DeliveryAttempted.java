package org.trishinfotech.state;

public class DeliveryAttempted implements ShipmentState {

	protected String reasonForUndelivered;

	public DeliveryAttempted(String reasonForUndelivered) {
		super();
		this.reasonForUndelivered = reasonForUndelivered;
	}

	@Override
	public void processShipment(ShipmentContext context) {
		Shipment shipment = context.getShipment();
		System.out.printf("Order#'%s' for '%s' has status '%s (%s)'.\nDelivery Address is '%s'\n",
				shipment.getOrderNumber(), shipment.getOrderItem(), name(), reasonForUndelivered,
				shipment.getDeliveryAddress());
		System.out.println("--------------------------------------------------------------");
		// setting flag to make the delivery at next attempt.
		// we can set it logically as well instead of hard coding.
		context.setCustomerAtLocation(true);
		context.setCurrentState(new OutForDelivery());
	}

	public String getReasonForUndelivered() {
		return reasonForUndelivered;
	}

	public void setReasonForUndelivered(String reasonForUndelivered) {
		this.reasonForUndelivered = reasonForUndelivered;
	}

	@Override
	public String name() {
		return "Delivery Attempted";
	}
}
