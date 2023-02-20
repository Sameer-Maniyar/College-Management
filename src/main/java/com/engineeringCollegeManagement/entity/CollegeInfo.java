package com.engineeringCollegeManagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.engineeringCollegeManagement.model.Address;

@Entity
public class CollegeInfo {
	
	@Id
	long collegeId;
	
	@Column(nullable = false)
	String collegeName;
	
	@Column(nullable = false)
	Address collegeAddress;
	
	@Column(unique = true,nullable = false)
	long contactNumber;
	@Column(unique = true,nullable = false)
	String emailId;
	String webSiteLink;
	int establishedYear;

	public CollegeInfo() {
		super();

	}

	public CollegeInfo(long collegeId, String collegeName, Address collegeAddress, long contactNumber, String emailId,
			String webSiteLink, int establishedYear) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.collegeAddress = collegeAddress;
		this.contactNumber = contactNumber;
		this.emailId = emailId;
		this.webSiteLink = webSiteLink;
		this.establishedYear = establishedYear;
	}

	public long getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(long collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public Address getCollegeAddress() {
		return collegeAddress;
	}

	public void setCollegeAddress(Address collegeAddress) {
		this.collegeAddress = collegeAddress;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getWebSiteLink() {
		return webSiteLink;
	}

	public void setWebSiteLink(String webSiteLink) {
		this.webSiteLink = webSiteLink;
	}

	public int getEstablishedYear() {
		return establishedYear;
	}

	public void setEstablishedYear(int establishedYear) {
		this.establishedYear = establishedYear;
	}

	@Override
	public String toString() {
		return "CollegeInfo [collegeId=" + collegeId + ", collegeName=" + collegeName + ", collegeAddress="
				+ collegeAddress + ", contactNumber=" + contactNumber + ", emailId=" + emailId + ", webSiteLink="
				+ webSiteLink + ", establishedYear=" + establishedYear + "]";
	}
	
	
	
	

}
