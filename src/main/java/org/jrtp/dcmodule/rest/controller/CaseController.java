package org.jrtp.dcmodule.rest.controller;

import org.jrtp.dcmodule.rest.request.DcRequest;
import org.jrtp.dcmodule.rest.response.SearchAppResponse;
import org.jrtp.dcmodule.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author vaibhav
 *@date 15-Oct-2022
 * 
 */

@RestController
public class CaseController {
	
	@Autowired
	private CaseService caseService;
	
	@GetMapping("/searchapp/{appId}")
	public ResponseEntity<SearchAppResponse> searchApplication(@PathVariable Long appId) {
		SearchAppResponse appId2 = caseService.getAppId(appId);
		
		
	}
	
	@GetMapping("/plan-list")
	public ResponseEntity<?> getPlans() {
		return new ResponseEntity<> (caseService.getPlans() , HttpStatus.OK );
	}
	

}
