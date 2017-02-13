package com.clinicalTrial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.clinicalTrial.business.ClinicalTrialBusiness;

@Controller
public class ClinicalTrialServlet {

	@RequestMapping("/welcome")
	public ModelAndView getAllClinicalTrials(){
		ClinicalTrialBusiness obj = new ClinicalTrialBusiness();
		return new ModelAndView("welcome", "trialList", obj.getAllTrials());
	}
}
