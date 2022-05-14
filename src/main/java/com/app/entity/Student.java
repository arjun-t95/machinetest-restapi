package com.app.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

//create table in database
@Entity
@Table(name= "student")
public class Student {
	
	
	//instance variables
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "student_id", nullable = false)
	private int studentId;
	private String studentName;
	private String isActive;
	@CreationTimestamp
	@Column(name = "created_date")
	private Date createdDate;
	
	
	@OneToMany(mappedBy="student", cascade=CascadeType.ALL)
	//List<Ranking> ranking;
	private List<Ranking> ranking = new ArrayList<Ranking>();
	
	
		
		
	//default constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//parameterised constructor
	public Student(int studentId, String studentName, String isActive, Date createdDate, List<Ranking> ranking) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.isActive = isActive;
		this.createdDate = createdDate;
		this.ranking = ranking;
	}
	
	//getters and setters
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
	public List<Ranking> getRanking() {
		return ranking;
	}
	public void setRanking(List<Ranking> ranking) {
		this.ranking = ranking;
	}
	
	//to string
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", isActive=" + isActive
				+ ", createdDate=" + createdDate + ", ranking=" + ranking + "]";
	}
	
	
 
	

}
