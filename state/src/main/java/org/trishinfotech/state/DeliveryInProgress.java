package org.trishinfotech.state;

import java.util.ArrayList;
import java.util.List;

public class DeliveryInProgress implements ShipmentState {

	protected List<Location> shipmentItinerary = new ArrayList<Location>();

	public DeliveryInProgress(List<Location> itinerary) {
		super();
		this.shipmentItinerary.addAll(itinerary);
	}

	@Override
	public void processShipment(ShipmentContext context) {
		int currentLocationIndex = context.getCurrentLocationIndex();
		Shipment shipment = context.getShipment();
		System.out.printf(
				"Order#'%s' for '%s' has status '%s'.\nDelivery Address is '%s'\nCurrent shipment location is '%s'\n",
				shipment.getOrderNumber(), shipment.getOrderItem(), name(), shipment.getDeliveryAddress(),
				shipmentItinerary.get(currentLocationIndex++));
		System.out.println("--------------------------------------------------------------");
		// since destination address will be part of OutForDelivery; We skip last
		// location of itinerary
		if (currentLocationIndex == (shipmentItinerary.size() - 1)) {
			context.setCurrentState(new OutForDelivery());
		} else {
			context.setCurrentLocationIndex(currentLocationIndex);
		}
	}

	@Override
	public String name() {
		return "Delivery In Progress";
	}
}
