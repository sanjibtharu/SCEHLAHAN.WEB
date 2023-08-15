package com.entity;

public class Appointment {
	private int id;
	private int userId;
	private String fullName;
	private String gender;
	private String age;
	private String appoindate;
	private String appointype;
	private String phno;
	private String diseases;
	private int doctorId;  
	private String referralcenter;
	private String fulladdress;
	private String status;
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Appointment(int userId, String fullName, String gender, String age, String appoindate, String appointype,
			String phno, String diseases, int doctorId, String referralcenter, String fulladdress, String status) {
		super();
		this.userId = userId;
		this.fullName = fullName;
		this.gender = gender;
		this.age = age;
		this.appoindate = appoindate;
		this.appointype = appointype;
		this.phno = phno;
		this.diseases = diseases;
		this.doctorId = doctorId;
		this.referralcenter = referralcenter;
		this.fulladdress = fulladdress;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAppoindate() {
		return appoindate;
	}
	public void setAppoindate(String appoindate) {
		this.appoindate = appoindate;
	}
	public String getAppointype() {
		return appointype;
	}
	public void setAppointype(String appointype) {
		this.appointype = appointype;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getDiseases() {
		return diseases;
	}
	public void setDiseases(String diseases) {
		this.diseases = diseases;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getReferralcenter() {
		return referralcenter;
	}
	public void setReferralcenter(String referralcenter) {
		this.referralcenter = referralcenter;
	}
	public String getFulladdress() {
		return fulladdress;
	}
	public void setFulladdress(String fulladdress) {
		this.fulladdress = fulladdress;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
