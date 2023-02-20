package com.engineeringCollegeManagement.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Subject {
	
	@Id
	String subjectId;
	
	@Column(nullable = false)
	String subjectName;
	
	@Column(nullable = false)
	short semister;
	
//    @ManyToOne
//    @JoinColumn(name = "foreign_key")
//	CourseInfo courseInfo;

	public Subject() {
		super();
	
	}

	public Subject(String subjectId, String subjectName, short semister, CourseInfo courseInfo) {
		super();
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.semister = semister;
//		this.courseInfo = courseInfo;
	}

	public String getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public short getSemister() {
		return semister;
	}

	public void setSemister(short semister) {
		this.semister = semister;
	}

	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", subjectName=" + subjectName + ", semister=" + semister + "]";
	}

//	public CourseInfo getCourseInfo() {
//		return courseInfo;
//	}
//
//	public void setCourseInfo(CourseInfo courseInfo) {
//		this.courseInfo = courseInfo;
//	}


	
	
	
	
	
	
	
	

}
