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
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Role {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int roleId;
	
	private String roleName;
	
	 @CreationTimestamp
	 @Column(name = "created_date")
	 private Date createdDate;
	 
	 private String isActive;
	
	
	@OneToMany(mappedBy="role", cascade=CascadeType.ALL)
	private List<User> users = new ArrayList<User>();

	public Role() {
		super();
	}

	public Role(int roleId, String roleName, Date createdDate, String isActive, List<User> users) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.createdDate = createdDate;
		this.isActive = isActive;
		this.users = users;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName + ", createdDate=" + createdDate + ", isActive="
				+ isActive + ", users=" + users + "]";
	}

	
	
	
	
}
