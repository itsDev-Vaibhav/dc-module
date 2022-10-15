package org.jrtp.dcmodule.rest.request;

import lombok.Data;

/**
 * @author vaibhav
 *@date 15-Oct-2022
 * 
 */

@Data
public class CaseEducation {
	private String highestDegree;
	private Integer graduationYear;
	private String university;
}
