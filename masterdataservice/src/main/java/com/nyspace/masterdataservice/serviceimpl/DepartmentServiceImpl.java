package com.nyspace.masterdataservice.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myspace.commonservice.entity.DepartmentEntity;
import com.nyspace.masterdataservice.dao.DepartmentDAO;
import com.nyspace.masterdataservice.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentDAO departmentDAO;
	
	@Override
	public Object addDepartment(DepartmentEntity departmentEntity) {
		departmentDAO.save(departmentEntity);
		return "Department Saved Successfully";
	}

	@Override
	public List<DepartmentEntity> getDepartment() {

		return departmentDAO.findAll();
	}



}
