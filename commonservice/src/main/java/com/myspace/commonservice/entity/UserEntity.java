package com.myspace.commonservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Size;

@Entity
@Table(name = "user", uniqueConstraints = @UniqueConstraint(columnNames = "unique_username", name = "username"))
public class UserEntity extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7982000460615414033L;

	@Column(name = "username", nullable = false)
	@Size(min = 6, max = 100)
	private String username;

	@Column(name = "password")
	@Size(min = 8, max = 100)
	private String password;

	@Column(name = "first_name", nullable = false, length = 100)
	private String firstName;

	@Column(name = "middle_name", nullable = false, length = 100)
	private String middleName;

	@Column(name = "last_name", nullable = false, length = 100)
	private String lastName;

	public UserEntity() {
		super();
	}

	public UserEntity(String username, String password, String firstName, String middleName, String lastName) {
		super();
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
