package org.jrtp.dcmodule.db.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author vaibhav
 *@date 15-Oct-2022
 * 
 */

@Entity
@Table(name = "CASE_INCOME")
@Data
public class CaseIncome {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long incomeId;
	private Long monthlySalary;
	private Long rentIncome;
	private Long propertyIncome;

}
