package com.myspace.commonservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "designation", uniqueConstraints = @UniqueConstraint(columnNames = "unique_designation_name", name = "designationName"))
public class DesignationEntity extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7505052930722396558L;

	@Column(name = "designation_name", nullable = false)
	private String designationName;

	public DesignationEntity() {
		super();
	}

	public DesignationEntity(String designationName) {
		super();
		this.designationName = designationName;
	}

	public String getDesignationName() {
		return designationName;
	}

	public void setDesignationName(String designationName) {
		this.designationName = designationName;
	}

}
