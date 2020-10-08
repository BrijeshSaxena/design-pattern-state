package org.trishinfotech.state;

public class ReadyToDeliver implements ShipmentState {

	public ReadyToDeliver() {
		super();
	}

	@Override
	public void processShipment(ShipmentContext context) {
		Shipment shipment = context.getShipment();
		System.out.printf("Order#'%s' for '%s' has status '%s'.\nDelivery Address is '%s'\n", shipment.getOrderNumber(),
				shipment.getOrderItem(), name(), shipment.getDeliveryAddress());
		System.out.println("--------------------------------------------------------------");
		// shipment tracking number will be generated.
		shipment.setShipmentNumber("ST6749398FLNY26");
		Location originLocation = new Location("LocA", "54 Essex Rd.", "Palm Bay", "FL", "US", "32907");
		context.setCurrentState(new DeliveryInProgress(ItineraryFinder.findItinerry(originLocation, context.getShipment().getDeliveryAddress())));
	}

	@Override
	public String name() {
		return "Ready To Deliver";
	}
}
