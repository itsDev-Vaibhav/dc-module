package org.jrtp.dcmodule.service.impl;

import org.jrtp.dcmodule.rest.client.AppClient;
import org.jrtp.dcmodule.rest.response.SearchAppResponse;
import org.jrtp.dcmodule.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * @author vaibhav
 *@date 15-Oct-2022
 * 
 */

@Service
public class CaseServiceImpl implements CaseService{
	
	@Autowired
	private AppClient appClient;
	
	@Override
	public SearchAppResponse getAppId(Long appId) {
		ResponseEntity<?> app = appClient.getApp(appId);
		SearchAppResponse response = new SearchAppResponse();
		
	}

	@Override
	public Object getPlans() {
		
		return null;
	}


}
