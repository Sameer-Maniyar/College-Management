package com.engineeringCollegeManagement.dao;

import java.util.List;

import com.engineeringCollegeManagement.entity.CollegeInfo;
import com.engineeringCollegeManagement.entity.CourseInfo;
import com.engineeringCollegeManagement.entity.StaffInfo;
import com.engineeringCollegeManagement.model.StaffDetails;

public interface CollegeInfoDao {
	
	public boolean addCollegeInfo(CollegeInfo collegeInfo);

	public CollegeInfo getCollegeInfoById(long collegeId);
	
	public StaffDetails getStaffDetailsByCollegeId(long collegeId);
	
	public List<CourseInfo> getAllCoursesAvailableByCollegeId(long collegeId);
	
	public List<CollegeInfo> getCollegesByIds(List<Long> Ids);

}
