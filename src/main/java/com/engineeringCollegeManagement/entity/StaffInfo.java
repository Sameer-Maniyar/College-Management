package com.engineeringCollegeManagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StaffInfo {
	@Id
	long staffId;
	
	@Column(nullable = false)
	String staffName;
	@Column(nullable = false)
	String gender;
	
	@Column(nullable = false)
	long collegeId;
	
	@Column(nullable = false)
	String qualification;
	
	int experience;
	
	String description;
	public StaffInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StaffInfo(long staffId, String staffName, String gender, long collegeId, String qualification,
			int experience, String description) {
		super();
		this.staffId = staffId;
		this.staffName = staffName;
		this.gender = gender;
		this.collegeId = collegeId;
		this.qualification = qualification;
		this.experience = experience;
		this.description = description;
	}
	public long getStaffId() {
		return staffId;
	}
	public void setStaffId(long staffId) {
		this.staffId = staffId;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(long collegeId) {
		this.collegeId = collegeId;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "StaffInfo [staffId=" + staffId + ", staffName=" + staffName + ", gender=" + gender + ", collegeId="
				+ collegeId + ", qualification=" + qualification + ", experience=" + experience + ", description="
				+ description + "]";
	}
	
	
	

}
