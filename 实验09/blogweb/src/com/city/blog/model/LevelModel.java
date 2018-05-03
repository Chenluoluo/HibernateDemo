package com.city.blog.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MEMBERLevel")
public class LevelModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="LNo")
	private int lno;
	@Basic
	@Column(name="LName")
	private String lname;

	public int getLno() {
		return lno;
	}

	public void setLno(int lno) {
		this.lno = lno;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

}
