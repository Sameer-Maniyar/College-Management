package com.engineeringCollegeManagement.daoIMPL;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.engineeringCollegeManagement.dao.CollegeInfoDao;
import com.engineeringCollegeManagement.entity.CollegeInfo;
import com.engineeringCollegeManagement.entity.CourseInfo;
import com.engineeringCollegeManagement.entity.StaffInfo;
import com.engineeringCollegeManagement.model.StaffDetails;

@Repository
public class CollegeInfoDaoIMPL implements CollegeInfoDao {
	@Autowired
	SessionFactory factory;

	@Override
	public boolean addCollegeInfo(CollegeInfo collegeInfo) {

		Session session = factory.openSession();
		org.hibernate.Transaction transaction = session.beginTransaction();
		boolean isPresent = false;

		try {
			CollegeInfo dbCollegeInfo = session.get(CollegeInfo.class, collegeInfo.getCollegeId());
			if (dbCollegeInfo != null) {

				return isPresent;

			} else {
				session.save(collegeInfo);
				transaction.commit();
				isPresent = true;
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			if (session != null) {
				session.close();
			}
		}

		return isPresent;
	}

	@Override
	public CollegeInfo getCollegeInfoById(long collegeId) {
		Session session = factory.openSession();
		CollegeInfo collegeInfo = null;
		try {
			System.out.println(collegeId);
			collegeInfo = session.get(CollegeInfo.class, collegeId);

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			if (session != null) {
				session.close();
			}
		}
		return collegeInfo;
	}

	@Override
	public StaffDetails getStaffDetailsByCollegeId(long collegeId) {

		// Session session = factory.openSession();
		// org.hibernate.Transaction transaction = session.beginTransaction();
		// session.create

		return null;
	}

	@Override
	public List<CourseInfo> getAllCoursesAvailableByCollegeId(long collegeId) {

		List<CourseInfo> courseInfo = null;
		Session session = factory.openSession();

		try {
			Criteria criteria = session.createCriteria(CourseInfo.class);
			criteria.add(Restrictions.eq("collegeId", collegeId));
			courseInfo = criteria.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}

		System.err.println("in dao");
		return courseInfo;
	}

	@Override
	public List<CollegeInfo> getCollegesByIds(List<Long> Ids) {
		
		List<CollegeInfo> collegeList = new ArrayList<CollegeInfo>();

		Session session = factory.openSession();
		
		try {

			for (Long Id : Ids) {

				CollegeInfo collegeInfo = session.get(CollegeInfo.class, Id);
				
				if (collegeInfo!=null) {
					
					collegeList.add(collegeInfo);
				}else{
					System.err.println("college with this Id is not Present "+Id);
			    }
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}

		return collegeList;
	}

}
