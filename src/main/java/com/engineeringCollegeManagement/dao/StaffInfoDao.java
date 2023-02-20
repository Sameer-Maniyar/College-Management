package com.engineeringCollegeManagement.dao;

import java.util.List;

import com.engineeringCollegeManagement.entity.StaffInfo;
import com.engineeringCollegeManagement.model.StaffDetails;

public interface StaffInfoDao {

	
	 boolean addStaffInfo(StaffInfo staffInfo);
	 
	 public List<StaffInfo> getAllStaffDetailsBycollegeId(long collegeId);
	
	
}
