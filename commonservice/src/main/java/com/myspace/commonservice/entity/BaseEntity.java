package com.myspace.commonservice.entity;

import java.io.Serializable;
import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@MappedSuperclass
public class BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 39365510835254687L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;

	@Column(name = "created_by", updatable = false)
	private UserEntity createdBy;

	@Column(name = "created_at", updatable = false)
	@CreationTimestamp
	private ZonedDateTime createdAt;

	@Column(name = "updated_by")
	private UserEntity updatedBy;

	@Column(name = "updated_At")
	@UpdateTimestamp
	private ZonedDateTime updatedAt;

	@Column(name = "enabled", columnDefinition = "tinyint(1) default 1")
	private Boolean enabled = true;

	public BaseEntity() {
		super();
	}

	public BaseEntity(Long id, UserEntity createdBy, ZonedDateTime createdAt, UserEntity updatedBy,
			ZonedDateTime updatedAt, Boolean enabled) {
		super();
		this.id = id;
		this.createdBy = createdBy;
		this.createdAt = createdAt;
		this.updatedBy = updatedBy;
		this.updatedAt = updatedAt;
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

	public ZonedDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(ZonedDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public UserEntity getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(UserEntity updatedBy) {
		this.updatedBy = updatedBy;
	}

	public ZonedDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(ZonedDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

}
