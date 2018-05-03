package com.city.erp.model;

import java.util.Date;

public class OrderModel {
	private int orderno;
	private String orderid;
	private String customername;
	private Date orderdate;
	private Date deliverydate;
	private Date paydate;
	private double orderamount;
	private double deliveryfee;

	public int getOrderno() {
		return orderno;
	}

	public void setOrderno(int orderno) {
		this.orderno = orderno;
	}

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public Date getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}

	public Date getDeliverydate() {
		return deliverydate;
	}

	public void setDeliverydate(Date deliverydate) {
		this.deliverydate = deliverydate;
	}

	public Date getPaydate() {
		return paydate;
	}

	public void setPaydate(Date paydate) {
		this.paydate = paydate;
	}

	public double getOrderamount() {
		return orderamount;
	}

	public void setOrderamount(double orderamount) {
		this.orderamount = orderamount;
	}

	public double getDeliveryfee() {
		return deliveryfee;
	}

	public void setDeliveryfee(double deliveryfee) {
		this.deliveryfee = deliveryfee;
	}

}
