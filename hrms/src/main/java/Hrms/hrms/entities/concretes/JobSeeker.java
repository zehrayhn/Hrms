package Hrms.hrms.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;



@Entity
@PrimaryKeyJoinColumn(name="user_id",referencedColumnName = "id")
@EqualsAndHashCode(callSuper = false) 
@Table(name = "job_seekers")

public class JobSeeker extends User{
	
	
	//@Column(name="user_id")
	//private int id;
	
	//@Column(name="email")
	//private String email;
	
	//@Column(name="password")
	//private String password;
	
	@Column(name="first_name")
	private String fistName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="identity_number")
	private String identityNumber; 
	
	@Column(name="year_of_birth")
	private Date dateOfBirth;
	
	public JobSeeker( String fistName, String lastName, String nationalityId,
			Date dateOfBirth) {
		super();
		
		this.fistName = fistName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.dateOfBirth = dateOfBirth;
	}
	
	
    public JobSeeker() {}
	public String getFistName() {
		return fistName;
	}
	public void setFistName(String fistName) {
		this.fistName = fistName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getIdentityNumber() {
		return identityNumber;
	}
	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	

}
