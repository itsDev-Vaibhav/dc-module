package org.jrtp.dcmodule.rest.request;

import java.util.List;

import lombok.Data;

/**
 * @author vaibhav
 *@date 15-Oct-2022
 * 
 */

@Data
public class DcRequest {
	private Long appId;
	private Long caseNum;
	private String planName;
	private CaseEducation education;
	private CaseIncome income;
	private List<CaseChilds> childs;
}
