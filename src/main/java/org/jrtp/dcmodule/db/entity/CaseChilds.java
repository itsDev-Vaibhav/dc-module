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
@Table(name = "CASE_CHILDS")
@Data
public class CaseChilds {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long childId;
	private String childName;
	private Integer childAge;
	private String childSSN;
}
