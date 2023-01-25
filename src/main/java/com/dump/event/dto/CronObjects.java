package com.dump.event.dto;

import java.util.Date;

public class CronObjects {

	private Integer id;

	private String issueId;
	private Date crtDate;

	public CronObjects(Integer id, String issueId, Date crtDate) {
		super();
		this.id = id;
		this.issueId = issueId;
		this.crtDate = crtDate;
	}

	public Date getCrtDate() {
		return crtDate;
	}

	public void setCrtDate(Date crtDate) {
		this.crtDate = crtDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIssueId() {
		return issueId;
	}

	public void setIssueId(String issueId) {
		this.issueId = issueId;
	}

	@Override
	public String toString() {
		return "CronObjects [id=" + id + ", issueId=" + issueId + ", crtDate=" + crtDate + "]";
	}

	public CronObjects(Integer id, String issueId) {
		super();
		this.id = id;
		this.issueId = issueId;
	}

	public CronObjects() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
