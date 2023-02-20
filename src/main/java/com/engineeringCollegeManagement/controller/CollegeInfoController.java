package com.engineeringCollegeManagement.controller;

import java.security.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.engineeringCollegeManagement.GlobalException.ResourceNotFoundException;
import com.engineeringCollegeManagement.entity.CollegeInfo;
import com.engineeringCollegeManagement.entity.CourseInfo;
import com.engineeringCollegeManagement.model.StaffDetails;
import com.engineeringCollegeManagement.service.CollegeInfoService;
import com.engineeringCollegeManagement.serviceIMPL.collegeInfoServiceIMPL;
//@author Sameer
@RestController
@RequestMapping("/college-info")
public class CollegeInfoController {
	@Autowired
	CollegeInfoService collegeInfoService;

	@PostMapping("/add-college-info")
	public ResponseEntity<Boolean> addCollegeInfo(@RequestBody CollegeInfo collegeInfo) {
		boolean isSaved = collegeInfoService.addCollegeInfo(collegeInfo);

		if (isSaved == true) {
			return new ResponseEntity<Boolean>(true, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

	}

	@GetMapping("/get-college-info-by-Id/{Id}")
	public ResponseEntity<CollegeInfo> getcollegeInfoById(@PathVariable long Id) {

		CollegeInfo collegeInfo = collegeInfoService.getCollegeInfoById(Id);

		if (collegeInfo != null) {

			return new ResponseEntity<CollegeInfo>(collegeInfo, HttpStatus.FOUND);
		} else {
			// return new ResponseEntity<>(HttpStatus.NOT_FOUND);

			throw new ResourceNotFoundException("resource not present with Id:-" + Id);

		}
	}

	@GetMapping("/get-staff-present-in-college-by-college-Id/{collegeId}")
	ResponseEntity<StaffDetails> getStaffAvailableInCollegeByCollegeId(@PathVariable long collegeId) {

		StaffDetails staffDetails = collegeInfoService.getStaffAvailableInCollegeByCollegeId(collegeId);

		if (staffDetails != null) {

			return new ResponseEntity<StaffDetails>(staffDetails, HttpStatus.OK);

		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}

	@GetMapping("/get-all-courses-available-by college-Id/{collegeId}")
	ResponseEntity<List<CourseInfo>> getAllCourseAvaialbeByCollegeId(@PathVariable long collegeId) {

		List<CourseInfo> courseInfo = collegeInfoService.getAllCoursesAvailableByCollegeId(collegeId);

		if (courseInfo != null) {

			return new ResponseEntity<List<CourseInfo>>(courseInfo, HttpStatus.OK);

		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}

	@GetMapping("/get-colleges-by-Ids")
	ResponseEntity<List<CollegeInfo>> getCOllegesByIds(@RequestParam List<Long> Ids) {
		List<CollegeInfo> collegeList = collegeInfoService.getCollegesByIds(Ids);

		if (!collegeList.isEmpty()) {
			return new ResponseEntity<List<CollegeInfo>>(collegeList, HttpStatus.OK);
		} else {
                  return null;
		}

		
	}

}
