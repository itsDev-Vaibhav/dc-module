package org.jrtp.dcmodule.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author vaibhav
 *@date 12-Oct-2022
 * 
 */

@Entity
@Table(name = "DC_CASES")
@Data
public class Case {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CASE_ID")
	private Long caseId;
	
	@Column(name = "CASE_NUM")
	private Long caseNumber;
	
	@Column(name = "APP_ID")
	private Long appId;
	
	@Column(name = "PLAN_ID")
	private Long planId;
	


}
