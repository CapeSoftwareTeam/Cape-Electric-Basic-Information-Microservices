package com.capeelectric.VO;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class User {

	private int id;
	private String password;
	private boolean active;
	private String email;
	private String firstname;
	private String lastname;
	private String username;
	private String usertype;
	private String role;
	private LocalDateTime creationdate;
	private LocalDateTime updateddate;
	private boolean userexist;
	private Integer otp;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public LocalDateTime getCreationdate() {
		return creationdate;
	}
	public void setCreationdate(LocalDateTime creationdate) {
		this.creationdate = creationdate;
	}
	public LocalDateTime getUpdateddate() {
		return updateddate;
	}
	public void setUpdateddate(LocalDateTime updateddate) {
		this.updateddate = updateddate;
	}
	public boolean isUserexist() {
		return userexist;
	}
	public void setUserexist(boolean userexist) {
		this.userexist = userexist;
	}
	public Integer getOtp() {
		return otp;
	}
	public void setOtp(Integer otp) {
		this.otp = otp;
	}
	
	}
