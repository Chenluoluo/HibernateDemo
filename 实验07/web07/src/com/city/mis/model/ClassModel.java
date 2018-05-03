package com.city.mis.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "MIS_CLASS")
public class ClassModel {
	@Id
	@Column(name = "CNo")
	private int cno;
	@Column(name = "CName")
	private String cname;
	
	@OneToMany(mappedBy = "classModel")
	private List<StudentModel> students;

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
}
