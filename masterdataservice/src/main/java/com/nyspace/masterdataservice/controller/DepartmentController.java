package com.nyspace.masterdataservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myspace.commonservice.entity.DepartmentEntity;
import com.nyspace.masterdataservice.service.DepartmentService;

@RestController
@RequestMapping("api/master/department")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/add-department")
	public ResponseEntity<?> addDepartment(@RequestBody DepartmentEntity departmentEntity) {
		return ResponseEntity.ok().body(departmentService.addDepartment(departmentEntity));
	}
	
	@GetMapping("/get-department")
	public ResponseEntity<List<DepartmentEntity>> getDepartment()
	{
		return ResponseEntity.ok(departmentService.getDepartment());
	}
	
	
}
