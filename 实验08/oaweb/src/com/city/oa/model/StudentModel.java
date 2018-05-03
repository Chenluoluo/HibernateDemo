package com.city.oa.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "oa_Student")
public class StudentModel {
	@Id
	@Column(name = "SSID")
	private String ssid;
	@Column(name = "SName")
	private String sname;
	@Column(name = "SEX")
	private String sex;
	@Column(name = "AGE")
	private int age;
	
	@ManyToMany
	@JoinTable(
			name = "oa_StudentCourse",
			joinColumns = @JoinColumn(name = "SSID"),
			inverseJoinColumns=@JoinColumn(name = "CNo")
			)
	private Set<CourseModel> courses = null;

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

	public Set<CourseModel> getCourses() {
		return courses;
	}

	public void setCourses(Set<CourseModel> courses) {
		this.courses = courses;
	}
}
