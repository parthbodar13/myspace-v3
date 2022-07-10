package com.nyspace.masterdataservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myspace.commonservice.entity.DepartmentEntity;

@Repository
public interface DepartmentDAO extends JpaRepository<DepartmentEntity, Long> {

}
