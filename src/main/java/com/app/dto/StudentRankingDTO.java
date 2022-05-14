package com.app.dto;

import java.util.Date;

public class StudentRankingDTO {
	
	private int rank;
	private int studentId;
	private String studentName;
	private String application_code;
	private String course_name;
	private int average;
	private int credits;
	private Date approvedDate;
	
	
	public StudentRankingDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public StudentRankingDTO(int rank, int studentId, String studentName, String application_code, String course_name,
			int average, int credits, Date approvedDate) {
		super();
		this.rank = rank;
		this.studentId = studentId;
		this.studentName = studentName;
		this.application_code = application_code;
		this.course_name = course_name;
		this.average = average;
		this.credits = credits;
		this.approvedDate = approvedDate;
	}


	public int getRank() {
		return rank;
	}


	public void setRank(int rank) {
		this.rank = rank;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getApplication_code() {
		return application_code;
	}


	public void setApplication_code(String application_code) {
		this.application_code = application_code;
	}


	public String getCourse_name() {
		return course_name;
	}


	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}


	public int getAverage() {
		return average;
	}


	public void setAverage(int average) {
		this.average = average;
	}


	public int getCredits() {
		return credits;
	}


	public void setCredits(int credits) {
		this.credits = credits;
	}


	public Date getApprovedDate() {
		return approvedDate;
	}


	public void setApprovedDate(Date approvedDate) {
		this.approvedDate = approvedDate;
	}


	@Override
	public String toString() {
		return "StudentRankingDTO [rank=" + rank + ", studentId=" + studentId + ", studentName=" + studentName
				+ ", application_code=" + application_code + ", course_name=" + course_name + ", average=" + average
				+ ", credits=" + credits + ", approvedDate=" + approvedDate + "]";
	}

	
}
