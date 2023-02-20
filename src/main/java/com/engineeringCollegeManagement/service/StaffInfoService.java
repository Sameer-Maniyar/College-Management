package com.engineeringCollegeManagement.service;

import java.util.List;

import com.engineeringCollegeManagement.entity.StaffInfo;

public interface StaffInfoService {
	
	 boolean addStaffInfo(StaffInfo staffInfo);
	 List<StaffInfo> getAllStaffDetailsBycollegeId(long collegeId);

}
