package org.jrtp.dcmodule.rest.request;

import lombok.Data;

/**
 * @author vaibhav
 *@date 15-Oct-2022
 * 
 */

@Data
public class IncomeRequest {
	private Long monthlySalary;
	private Long rentIncome;
	private Long propertyIncome;
}
