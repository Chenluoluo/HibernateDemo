package com.city.blog.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MEMBERS")
public class MemberModel {
	@Id
	@Column(name = "mid")
	private String mid;
	@Basic
	@Column(name = "mpass")
	private String mpass;
	@Basic
	@Column(name = "Mname")
	private String mname;
	@Basic
	@Column(name = "MSTATUS")
	private String mstatus;
	@ManyToOne
	@JoinColumn(name = "lno")
	private LevelModel levelModel = null;

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getMpass() {
		return mpass;
	}

	public void setMpass(String mpass) {
		this.mpass = mpass;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getMstatus() {
		return mstatus;
	}

	public void setMstatus(String mstatus) {
		this.mstatus = mstatus;
	}

	public LevelModel getLevelModel() {
		return levelModel;
	}

	public void setLevelModel(LevelModel levelModel) {
		this.levelModel = levelModel;
	}
}
