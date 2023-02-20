package com.engineeringCollegeManagement.serviceIMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.engineeringCollegeManagement.dao.CourseInfoDao;
import com.engineeringCollegeManagement.entity.CourseInfo;
import com.engineeringCollegeManagement.service.CourseInfoService;

@Service
public class CourseInfoServiceIMPL implements CourseInfoService {
	
   @Autowired
   CourseInfoDao courseInfoDao;
	 
	@Override
	public boolean addCourseInfo(CourseInfo courseInfo) {
		
		
		 
		
		return courseInfoDao.addCourseInfo(courseInfo);
	}

	@Override
	public CourseInfo getCourseInfoByCourseId(long Id) {
		
	CourseInfo courseInfo= courseInfoDao.getCourseInfoByCourseId(Id);
	
		 
		return courseInfo;
	}

	

}
