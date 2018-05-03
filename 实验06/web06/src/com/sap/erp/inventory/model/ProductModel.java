package com.sap.erp.inventory.model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "chenxi_product")
public class ProductModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pno_seq")
	@SequenceGenerator(name = "pno_seq",sequenceName = "chenxi_SQ")
	@Column(name = "PNO")
	private int pno;
	@Basic
	@Column(name = "PCODE")
	private String pcode;
	@Basic
	@Column(name = "PNAME")
	private String pname;
	@Basic
	@Column(name = "PDATE")
	private Date pdate;
	@Basic
	@Column(name = "UNITPRICE")
	private double unitprice;
	@Basic
	@Column(name = "QTYInStock")
	private double qtyinstock;

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
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

	public double getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}

	public double getQtyinstock() {
		return qtyinstock;
	}

	public void setQtyinstock(double qtyinstock) {
		this.qtyinstock = qtyinstock;
	}
}
