package org.trishinfotech.state;

public class Main {

	public static void main(String[] args) {
		Shipment shipment = new Shipment("OD12345FLNY17", "Apple iPhone 11 Pro (Midnight Green, 256GB)",
				new Location("LocE", "101 W. Sage Ave.", "Brooklyn", "NY", "US", "11234"));
		ShipmentContext context = new ShipmentContext(shipment);
		do {
			context.processShipment();
		} while (notReceived(context.getCurrentState()));
		// shipment received. so, we need to process the received status to get
		// acknowledgement from customer as 'item received'.
		context.processShipment();
	}

	private static boolean notReceived(ShipmentState currentState) {
		return !"Received".equalsIgnoreCase(currentState.name());
	}

}
