package com.nyspace.masterdataservice.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myspace.commonservice.entity.DesignationEntity;
import com.nyspace.masterdataservice.dao.DesignationDAO;
import com.nyspace.masterdataservice.service.DesignationService;

@Service
public class DesignationServiceImpl implements DesignationService {

	@Autowired
	private DesignationDAO designationDAO;
	
	@Override
	public Object addDesignation(DesignationEntity designationEntity) {
		designationDAO.save(designationEntity);
		return "Designation Saved Successfully";
	}

}
