package com.myspace.commonservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class DepartmentEntity extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2414938799417279177L;

	@Column(name = "department_name", nullable = false, unique = true)
	private String departmentName;

	public DepartmentEntity() {
		super();
	}

	public DepartmentEntity(String departmentName) {
		super();
		this.departmentName = departmentName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

}
