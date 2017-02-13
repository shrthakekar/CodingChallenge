package com.clinicalTrial.test;

import java.util.List;

import org.junit.Test;

import com.clinicalTrial.beans.ClinicalTrialBean;
import com.clinicalTrial.dao.ClinicalTrialDao;

import junit.framework.Assert;

public class ClinicalTrialDaoTest {
	@Test
	public void getAllTrials(){
		List<ClinicalTrialBean> result = ClinicalTrialDao.getAllTrials();
		Assert.assertNotNull(result);
	}
}
