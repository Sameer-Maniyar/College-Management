package com.engineeringCollegeManagement.serviceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.engineeringCollegeManagement.dao.StaffInfoDao;
import com.engineeringCollegeManagement.entity.StaffInfo;
import com.engineeringCollegeManagement.service.StaffInfoService;

@Service
public class StaffInfoServiceIMPL implements StaffInfoService {
	
	@Autowired
	StaffInfoDao staffInfoDao;

	@Override
	public boolean addStaffInfo(StaffInfo staffInfo) {
		

		return staffInfoDao.addStaffInfo(staffInfo);
	}

	public List<StaffInfo> getAllStaffDetailsBycollegeId(long collegeId) {
		
		List<StaffInfo> staffInfo= staffInfoDao.getAllStaffDetailsBycollegeId(collegeId);
		
		
		return staffInfo;
		
	}
	
}
