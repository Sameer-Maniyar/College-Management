package com.engineeringCollegeManagement.daoIMPL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.engineeringCollegeManagement.dao.CourseInfoDao;

import com.engineeringCollegeManagement.entity.CourseInfo;

@Repository
public class CourseInfoDaoIMPL implements CourseInfoDao {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean addCourseInfo(CourseInfo courseInfo) {

		Session session = sessionFactory.openSession();
		org.hibernate.Transaction transaction = session.beginTransaction();
		boolean isPresent = false;
		try {

			CourseInfo dbCourseInfo = session.get(CourseInfo.class, courseInfo.getCourseId());
			if (dbCourseInfo != null) {
				return isPresent;
			} else {
				session.save(courseInfo);
				transaction.commit();
				isPresent = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (session!=null) {
				session.close();
			}
		}

//		CourseInfo courseInfo2 = session.get(CourseInfo.class, courseInfo.getCourseId());
//		System.err.println(courseInfo2);

		return isPresent;
	}

	@Override
	public CourseInfo getCourseInfoByCourseId(long Id) {
		Session session = sessionFactory.openSession();
		CourseInfo courseInfo=null;
		
		
		try {
			
		   courseInfo = session.get(CourseInfo.class, Id);
		
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		
		return courseInfo;
	}

}
