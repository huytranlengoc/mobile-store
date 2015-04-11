package org.pearl.mobilepearl.domain;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "account", uniqueConstraints = @UniqueConstraint(columnNames = { "username" }))
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@Size(min = 5, max= 32)
	@Column(name = "username", nullable = false)
	private String username;
	
	@Size(min = 5, max= 32)
	@Column(name = "password", nullable = false)
	private String password;

	@NotEmpty
	@Column(name = "firstname")
	private String firstname;

	@NotEmpty
	@Column(name = "lastname")
	private String lastname;
	
	@NotNull
	@Column(name = "authority")
	private int authority;
	
	public Account(){
	}
	
	@Transient
	public String getFullname(){
		return firstname + " "+ lastname;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAuthority() {
		return authority;
	}

	public void setAuthority(int authority) {
		this.authority = authority;
	}

}