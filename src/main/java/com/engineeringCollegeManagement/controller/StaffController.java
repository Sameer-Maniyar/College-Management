package com.engineeringCollegeManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.engineeringCollegeManagement.entity.StaffInfo;
import com.engineeringCollegeManagement.service.StaffInfoService;

@RestController
@RequestMapping("/staff-info")
public class StaffController {
	@Autowired
	StaffInfoService staffInfoService;
	
	
	@PostMapping("/add-staff-info")
	ResponseEntity<Boolean> addStaffInfo(@RequestBody StaffInfo staffInfo){
		
		Boolean isSaved= staffInfoService.addStaffInfo(staffInfo);
		
		if (isSaved!=null) {
			
			return new ResponseEntity<Boolean>(true, HttpStatus.OK);
			
		}
		else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
	
	}
	
	
	@GetMapping("/get-all-staff-details-by-college-Id/{collegeId}")
	ResponseEntity<List<StaffInfo>> getAllStaffDetailsBycollegeId(@PathVariable long collegeId){
		
	List<StaffInfo> staffInfo = staffInfoService.getAllStaffDetailsBycollegeId(collegeId);
		
		if (staffInfo!=null) {
			
			return new ResponseEntity<List<StaffInfo>>(staffInfo, HttpStatus.OK);
			
		}
		else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		
		
	}

}
