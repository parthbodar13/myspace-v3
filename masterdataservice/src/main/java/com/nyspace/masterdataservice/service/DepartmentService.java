package com.nyspace.masterdataservice.service;

import java.util.List;

import com.myspace.commonservice.entity.DepartmentEntity;

public interface DepartmentService {

	Object addDepartment(DepartmentEntity departmentEntity);

	List<DepartmentEntity> getDepartment();

	

}
