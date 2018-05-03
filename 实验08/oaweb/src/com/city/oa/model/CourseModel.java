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
@Table(name = "oa_Course")
public class CourseModel {
	@Id
	@Column(name = "CNo")
	private int cno;
	@Column(name = "CName")
	private String cname;
	@Column(name = "CREDIT")
	private int credit;
	
	@ManyToMany
	@JoinTable(
			name = "oa_StudentCourse",
			joinColumns = @JoinColumn(name = "CNo"),
			inverseJoinColumns=@JoinColumn(name = "SSID")
			)
	private Set<StudentModel> students = null;

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public Set<StudentModel> getStudents() {
		return students;
	}

	public void setStudents(Set<StudentModel> students) {
		this.students = students;
	}
}
