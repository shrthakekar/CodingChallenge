package com.clinicalTrial.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.clinicalTrial.beans.ClinicalTrialBean;
import com.clinicalTrial.dao.ClinicalTrialDao;

@Produces(MediaType.APPLICATION_XML)
@Path("/service") 
public class ClinicalTrialService {	
	
	@GET	 
	@Produces(MediaType.TEXT_XML)
	@Path("/getAllTrials")
	public List<ClinicalTrialBean> getAllTrials(){
		
	      return ClinicalTrialDao.getAllTrials();
		
	   }  
	
}