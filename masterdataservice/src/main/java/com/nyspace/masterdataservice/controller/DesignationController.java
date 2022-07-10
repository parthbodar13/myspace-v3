package com.nyspace.masterdataservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myspace.commonservice.entity.DesignationEntity;
import com.nyspace.masterdataservice.service.DesignationService;

@RestController
@RequestMapping("api/master/designation")
public class DesignationController {

	@Autowired
	private DesignationService designationService;
	
	@PostMapping("/add-designation")
	public ResponseEntity<?> addDesignation(@RequestBody DesignationEntity designationEntity) {
		return ResponseEntity.ok().body(designationService.addDesignation(designationEntity));
	}
}
