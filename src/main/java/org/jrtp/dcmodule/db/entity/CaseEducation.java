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
@Table(name = "CASE_EDUCATION")
@Data
public class CaseEducation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long educationId;
	private String highestDegree;
	private Integer graduationYear;
	private String university;
}
