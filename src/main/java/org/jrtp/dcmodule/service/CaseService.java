package org.jrtp.dcmodule.service;

import org.jrtp.dcmodule.rest.response.SearchAppResponse;

/**
 * @author vaibhav
 *@date 15-Oct-2022
 * 
 */
public interface CaseService {
	
	/**
	 * @return
	 */
	SearchAppResponse getAppId(Long appId);

	/**
	 * @return
	 */
	Object getPlans();


}
