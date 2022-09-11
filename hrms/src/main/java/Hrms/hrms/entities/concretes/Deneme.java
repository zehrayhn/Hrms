package Hrms.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "deneme")
@PrimaryKeyJoinColumn(name = "id",referencedColumnName = "id")
public class Deneme extends User {


@Column(name="first_namee")
private String state;


public Deneme() {}
public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

public Deneme(String state) {
		super();
		this.state = state;
	}



}
