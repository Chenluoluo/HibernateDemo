package com.city.mis.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MIS_Student")
public class StudentModel {
	@Id
	@Column(name = "SSID")
	private String ssid;
	@Column(name = "SNAME")
	private String sname;
	@Column(name = "Birthday")
	private Date birthday;
	@Column(name = "SEX")
	private String sex;
	@Column(name = "AGE")
	private int age;
	
	@ManyToOne
	@JoinColumn(name = "CNo")
	private ClassModel classModel;

	public String getSsid() {
		return ssid;
	}

	public void setSsid(String ssid) {
		this.ssid = ssid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void setCm(ClassModel cm) {
		this.classModel = cm;
	}
}
