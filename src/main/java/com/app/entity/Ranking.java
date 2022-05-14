package com.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name= "ranking")
public class Ranking {
	
	//instance
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "application_id", nullable = false)
	private int applicationId;
	
	@Column(name = "application_code", nullable = false)
	private String applicationCode;
	
	@Column(name = "student_id", nullable = false)
	private int studentID;
	
	@Column(name = "course_name", nullable = false)
	private String courseName;
	
	private int average;
	private int credits;
	private int rank;
	
	@Column(name = "approved_date", nullable = false)
	private Date approvedDate;
	private String isActive;
	
	@CreationTimestamp
	@Column(name = "created_date")
	private Date createdDate;
	
	//mapping
	@ManyToOne
	@JoinColumn(name="studentID", insertable = false, updatable = false)
	private Student student;

	//default constructor
	public Ranking() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//paramterised constructor
	public Ranking(int applicationId, String applicationCode, int studentID, String courseName, int average,
			int credits, int rank, Date approvedDate, String isActive, Date createdDate, Student student) {
		super();
		this.applicationId = applicationId;
		this.applicationCode = applicationCode;
		this.studentID = studentID;
		this.courseName = courseName;
		this.average = average;
		this.credits = credits;
		this.rank = rank;
		this.approvedDate = approvedDate;
		this.isActive = isActive;
		this.createdDate = createdDate;
		this.student = student;
	}

	//getters and setters
	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public String getApplicationCode() {
		return applicationCode;
	}

	public void setApplicationCode(String applicationCode) {
		this.applicationCode = applicationCode;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
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

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public Date getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(Date approvedDate) {
		this.approvedDate = approvedDate;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	//string
	@Override
	public String toString() {
		return "Ranking [applicationId=" + applicationId + ", applicationCode=" + applicationCode + ", studentID="
				+ studentID + ", courseName=" + courseName + ", average=" + average + ", credits=" + credits + ", rank="
				+ rank + ", approvedDate=" + approvedDate + ", isActive=" + isActive + ", createdDate=" + createdDate
				+ ", student=" + student + "]";
	}
	
	
	
	
	
	 
	

}
