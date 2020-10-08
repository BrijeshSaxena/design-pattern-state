package org.trishinfotech.state;

public class Shipment {

	protected String orderNumber;
	protected String orderItem;
	protected String shipmentNumber;
	protected Location deliveryAddress;

	public Shipment(String orderNumber, String orderItem, Location deliveryAddress) {
		super();
		this.orderNumber = orderNumber;
		this.orderItem = orderItem;
		this.deliveryAddress = deliveryAddress;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(String orderItem) {
		this.orderItem = orderItem;
	}

	public String getShipmentNumber() {
		return shipmentNumber;
	}

	public void setShipmentNumber(String shipmentNumber) {
		this.shipmentNumber = shipmentNumber;
	}

	public Location getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(Location deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

}
