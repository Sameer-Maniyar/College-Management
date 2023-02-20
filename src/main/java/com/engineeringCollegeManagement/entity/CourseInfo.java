package com.engineeringCollegeManagement.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class CourseInfo {
	
	@Id
	long courseId;
	
	@Column(nullable = false)
	String courseName;
	
	@Column(nullable = false)
	long collegeId;
	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "courseId")
	private List<Subject> subject;

	
	@Column(nullable = false)
	int courseDuration;
	
	@Column(nullable = false)
	int courseFees;
	
	
	String courseDescription;
	
	
	
	public CourseInfo() {
		super();
		
	}



	public CourseInfo(long courseId, String courseName, long collegeId, List<Subject> subject, int courseDuration,
			int courseFees, String courseDescription) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.collegeId = collegeId;
		this.subject = subject;
		this.courseDuration = courseDuration;
		this.courseFees = courseFees;
		this.courseDescription = courseDescription;
	}




	
	public long getCourseId() {
		return courseId;
	}



	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}



	public String getCourseName() {
		return courseName;
	}



	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}



	public long getCollegeId() {
		return collegeId;
	}



	public void setCollegeId(long collegeId) {
		this.collegeId = collegeId;
	}



	public List<Subject> getSubject() {
		return subject;
	}



	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}



	public int getCourseDuration() {
		return courseDuration;
	}



	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}



	public int getCourseFees() {
		return courseFees;
	}



	public void setCourseFees(int courseFees) {
		this.courseFees = courseFees;
	}



	public String getCourseDescription() {
		return courseDescription;
	}



	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}



	@Override
	public String toString() {
		return "CourseInfo [courseId=" + courseId + ", courseName=" + courseName + ", collegeId=" + collegeId
				+ ", subject=" + subject + ", courseDuration=" + courseDuration + ", courseFees=" + courseFees
				+ ", courseDescription=" + courseDescription + "]";
	}



	
	
	
	

}
