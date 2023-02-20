package com.engineeringCollegeManagement.dao;

import com.engineeringCollegeManagement.entity.CourseInfo;

public interface CourseInfoDao {
	
	boolean addCourseInfo( CourseInfo courseInfo);
    CourseInfo getCourseInfoByCourseId(long Id);

}
