package org.jrtp.dcmodule.db.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
	
	@OneToOne( cascade = CascadeType.ALL)
	@JoinColumn(name = "LOCKERID_FK", unique = true)
	private CaseEducation caseEducation;
	
	@OneToOne( cascade = CascadeType.ALL)
	@JoinColumn(name = "LOCKERID_FK", unique = true)
	private CaseIncome caseIncome;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "CASE_ID_FK")
	private List<CaseChilds> childs;
}
