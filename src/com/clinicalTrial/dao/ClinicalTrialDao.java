package com.clinicalTrial.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.clinicalTrial.beans.ClinicalTrialBean;
import com.clinicalTrial.util.HibernateUtil;



public class ClinicalTrialDao {

	public static List<ClinicalTrialBean> getAllTrials(){ 
				
		 Session s = HibernateUtil.getHibernateSession(); 
		 String hql = " from ClinicalTrialBean";
		 List<ClinicalTrialBean> result =(List<ClinicalTrialBean> )s.createQuery(hql).getResultList();
		 s.close();
		 return result;
		
	}
}
