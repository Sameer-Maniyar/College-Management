package com.engineeringCollegeManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.engineeringCollegeManagement.entity.CollegeInfo;
import com.engineeringCollegeManagement.entity.CourseInfo;
import com.engineeringCollegeManagement.service.CollegeInfoService;
import com.engineeringCollegeManagement.service.CourseInfoService;

@RestController
@RequestMapping("/course-info")
public class CourseInfoController {
    
	@Autowired
	CourseInfoService courseInfoService;
	

	@PostMapping("/add-course-info")
	public ResponseEntity<Boolean> addMajorInfo(@RequestBody CourseInfo courseInfo) {
		System.err.println("in 1");
		boolean isSaved = courseInfoService.addCourseInfo(courseInfo);
        System.err.println("in controller");
		if (isSaved == true) {
			return new ResponseEntity<Boolean>(true, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
	}

	@GetMapping("/get-course-info-by-courseId/{Id}")
	public ResponseEntity<CourseInfo> getCourseInfoByCourseId(@PathVariable long Id) {

		CourseInfo courseInfo = courseInfoService.getCourseInfoByCourseId(Id);

		if (courseInfo != null) {

			return new ResponseEntity<CourseInfo>(courseInfo, HttpStatus.FOUND);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}


