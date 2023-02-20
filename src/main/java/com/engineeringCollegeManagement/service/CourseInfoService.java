package com.engineeringCollegeManagement.service;


import com.engineeringCollegeManagement.entity.CourseInfo;

public interface CourseInfoService {
	
	boolean addCourseInfo( CourseInfo majorInfo);
	CourseInfo getCourseInfoByCourseId(long Id);
	

}
