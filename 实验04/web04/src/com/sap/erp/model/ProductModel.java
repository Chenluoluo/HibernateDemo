package com.sap.erp.model;

import java.util.Date;

public class ProductModel {
	private int pno;
	private String pname;
	private Date pdate;
	private double uniprice;
	private int qty;

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Date getPdate() {
		return pdate;
	}

	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}

	public double getUniprice() {
		return uniprice;
	}

	public void setUniprice(double uniprice) {
		this.uniprice = uniprice;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
}
