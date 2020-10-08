package org.trishinfotech.state;

public class Exception implements ShipmentState {

	protected String exceptionMsg;

	public Exception(String exceptionMsg) {
		super();
		this.exceptionMsg = exceptionMsg;
	}

	@Override
	public void processShipment(ShipmentContext context) {
		Shipment shipment = context.getShipment();
		System.out.printf("Order#'%s' for '%s' has status '%s (%s)'.\nDelivery Address is '%s'\n",
				shipment.getOrderNumber(), shipment.getOrderItem(), name(), exceptionMsg,
				shipment.getDeliveryAddress());
		System.out.println("--------------------------------------------------------------");
		context.setCurrentState(new Returned());
	}

	public String getExceptionMsg() {
		return exceptionMsg;
	}

	public void setExceptionMsg(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}

	@Override
	public String name() {
		return "Exception";
	}
}
