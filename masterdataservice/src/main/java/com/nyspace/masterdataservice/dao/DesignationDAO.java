package com.nyspace.masterdataservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myspace.commonservice.entity.DesignationEntity;

@Repository
public interface DesignationDAO extends JpaRepository<DesignationEntity, Long> {

}
