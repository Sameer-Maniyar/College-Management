package com.engineeringCollegeManagement.model;

import java.util.List;

import com.engineeringCollegeManagement.entity.CollegeInfo;
import com.engineeringCollegeManagement.entity.StaffInfo;

public class StaffDetails {

	CollegeInfo collegeInfo;
	List<StaffInfo> staffInfo;

	public StaffDetails() {
		super();

	}

	public StaffDetails(CollegeInfo collegeInfo, List<StaffInfo> staffInfo) {
		super();
		this.collegeInfo = collegeInfo;
		this.staffInfo = staffInfo;
	}

	public CollegeInfo getCollegeInfo() {
		return collegeInfo;
	}

	public void setCollegeInfo(CollegeInfo collegeInfo) {
		this.collegeInfo = collegeInfo;
	}

	public List<StaffInfo> getStaffInfo() {
		return staffInfo;
	}

	public void setStaffInfo(List<StaffInfo> staffInfo) {
		this.staffInfo = staffInfo;
	}

	@Override
	public String toString() {
		return "StaffDetails [collegeInfo=" + collegeInfo + ", staffInfo=" + staffInfo + "]";
	}
	
	
	
	

}
