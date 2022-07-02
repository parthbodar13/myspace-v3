package com.myspace.commonservice.entity;

import java.io.Serializable;
import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.CreationTimestamp;

@MappedSuperclass
public class BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 39365510835254687L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id", nullable = false, updatable = false)
	private Long id;
	
	@Column (name = "createdBy")
	private UserEntity createdBy;
	
	@Column (name = "createdOn")
	@CreationTimestamp
	private ZonedDateTime createdOn;
	
	@Column (name = "updatedBy")
	private UserEntity updatedBy;
	
	@Column (name = "updatedOn")
	@CreationTimestamp
	private ZonedDateTime updatedOn;
	
	@Column (name = "enabled", columnDefinition = "tinyint(1) default 1")
	private Boolean enabled;

	public BaseEntity() {
		super();
	}

	public BaseEntity(Long id, UserEntity createdBy, ZonedDateTime createdOn, UserEntity updatedBy,
			ZonedDateTime updatedOn, boolean enabled) {
		super();
		this.id = id;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
		this.enabled = enabled;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UserEntity getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(UserEntity createdBy) {
		this.createdBy = createdBy;
	}

	public ZonedDateTime getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(ZonedDateTime createdOn) {
		this.createdOn = createdOn;
	}

	public UserEntity getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(UserEntity updatedBy) {
		this.updatedBy = updatedBy;
	}

	public ZonedDateTime getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(ZonedDateTime updatedOn) {
		this.updatedOn = updatedOn;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	
}
