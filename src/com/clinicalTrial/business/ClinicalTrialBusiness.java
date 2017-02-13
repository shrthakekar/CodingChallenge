package com.clinicalTrial.business;
import java.util.List;

import com.clinicalTrial.beans.ClinicalTrialBean;
import com.clinicalTrial.dao.ClinicalTrialDao;

public class ClinicalTrialBusiness {

	public List<ClinicalTrialBean>  getAllTrials(){
		return ClinicalTrialDao.getAllTrials();
	}
}
