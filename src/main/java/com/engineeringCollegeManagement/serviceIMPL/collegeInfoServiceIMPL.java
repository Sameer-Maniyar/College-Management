package com.engineeringCollegeManagement.serviceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.engineeringCollegeManagement.dao.CollegeInfoDao;
import com.engineeringCollegeManagement.dao.StaffInfoDao;
import com.engineeringCollegeManagement.entity.CollegeInfo;
import com.engineeringCollegeManagement.entity.CourseInfo;
import com.engineeringCollegeManagement.entity.StaffInfo;
import com.engineeringCollegeManagement.model.StaffDetails;
import com.engineeringCollegeManagement.service.CollegeInfoService;

@Service
public class collegeInfoServiceIMPL implements CollegeInfoService {
	@Autowired
	CollegeInfoDao collegeInfoDao;

	@Autowired
	StaffInfoDao staffInfoDao;

	@Override
	public boolean addCollegeInfo(CollegeInfo collegeInfo) {

		return collegeInfoDao.addCollegeInfo(collegeInfo);
	}

	@Override
	public CollegeInfo getCollegeInfoById(long collegeId) {
		return collegeInfoDao.getCollegeInfoById(collegeId);
	}

	@Override
	public StaffDetails getStaffAvailableInCollegeByCollegeId(long collegeId) {
		System.err.println("in service 1");
		CollegeInfo collegeInfo = collegeInfoDao.getCollegeInfoById(collegeId);
		List<StaffInfo> stafList = staffInfoDao.getAllStaffDetailsBycollegeId(collegeId);
		System.err.println("in service");
		StaffDetails staffDetails=new StaffDetails(collegeInfo, stafList); 
		

		return staffDetails;
	}

	@Override
	public List<CourseInfo> getAllCoursesAvailableByCollegeId(long collegeId) {
		
		return collegeInfoDao.getAllCoursesAvailableByCollegeId(collegeId);
	}

	@Override
	public List<CollegeInfo> getCollegesByIds(List<Long> Ids) {
	          
		return collegeInfoDao.getCollegesByIds(Ids);
	}

}
