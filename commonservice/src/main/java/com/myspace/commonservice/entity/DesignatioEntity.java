package com.myspace.commonservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Size;

@Entity
@Table (name = "Designation", uniqueConstraints = @UniqueConstraint(columnNames = "designationName", name = "designationName"))
public class DesignatioEntity extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7505052930722396558L;

	@Column (name = "designationName", nullable = false)
	@Size (min = 6, max = 100)
	private String designationName;

	public DesignatioEntity() {
		super();
	}

	public String getDesignationName() {
		return designationName;
	}

	public void setDesignationName(String designationName) {
		this.designationName = designationName;
	}

	
	

	
	
	
	
	
	
	
}
