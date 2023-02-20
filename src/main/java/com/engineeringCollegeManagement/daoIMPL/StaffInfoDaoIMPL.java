package com.engineeringCollegeManagement.daoIMPL;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.engineeringCollegeManagement.dao.StaffInfoDao;
import com.engineeringCollegeManagement.entity.StaffInfo;

@Repository
public class StaffInfoDaoIMPL implements StaffInfoDao {
  @Autowired 
  SessionFactory sessionFactory;
	@Override
	public boolean addStaffInfo(StaffInfo staffInfo) {
         Session session= sessionFactory.openSession();
        org.hibernate.Transaction transaction= session.beginTransaction();
        boolean isPresent=false;
        
        try {
        	StaffInfo dbStaffInfo= session.get(StaffInfo.class, staffInfo.getStaffId());
        	if (dbStaffInfo!=null) {
        		return isPresent;
				
			}else {
				session.save(staffInfo);
				transaction.commit();
				isPresent=true;
			}
        	
        	
			
		} catch (Exception e) {
	          e.printStackTrace();
		}
        
        finally {
			if (session!=null) {
				session.close();
			}
		}
        
		return isPresent;
	}
	
	
	public List<StaffInfo> getAllStaffDetailsBycollegeId(long collegeId) {
		
        List<StaffInfo> staffInfo = null;		
        Session session = sessionFactory.openSession(); 
        
        try {
		      Criteria criteria= session.createCriteria(StaffInfo.class);
		      criteria.add(Restrictions.eq("collegeId", collegeId));
		       staffInfo= criteria.list();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (session!=null) {
				session.close();
			}
		}
		   
		     System.err.println("in dao");
		
		return staffInfo;
	}

}
