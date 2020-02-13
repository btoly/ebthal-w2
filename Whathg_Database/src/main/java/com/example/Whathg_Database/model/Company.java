package com.example.Whathg_Database.model;


import java.io.Serializable;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import com.example.Whathg_Database.model.Individual.IndividualBuilder;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

@Entity
@Table(name = "Company")
public class Company extends User_W implements Serializable  {
	private static final long serialVersionUID = -3009157732242241606L;
	  
	  @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int Company_ID;
	
	
	
	  public Company(@Email(message = "Email should be valid") String email, String phoneNumber, String address,
			String password) {
		super(email, phoneNumber, address, password);
		// TODO Auto-generated constructor stub
	}
	//@Id
	//comanyRefrance
	  @Column(name = "CR", unique=true)
	  private String CR;
	
	  @NotNull(message = " cannot be Empty ")
	  @Column(name = "comanyName", nullable = false)
	  private String comanyName;
	  
	  @NotNull(message = " cannot be Empty ")
	  @Column(name = "StartDate", nullable = false)
	  private Timestamp StartDate;
	  
	  @NotNull(message = " cannot be Empty ")
	  @Column(name = "EndDate", nullable = false)
	  private Timestamp EndDate;
	  
	  
	
	
		

		
		
		public Company() {
		super();
		// TODO Auto-generated constructor stub
	}








		@Builder
		

	public Company(@Email(message = "Email should be valid") String email, String phoneNumber, String address,
			String password, int company_ID, String cR, @NotNull(message = " cannot be Empty ") String comanyName,
			@NotNull(message = " cannot be Empty ") Timestamp startDate,
			@NotNull(message = " cannot be Empty ") Timestamp endDate) {
		super(email, phoneNumber, address, password);
		Company_ID = company_ID;
		CR = cR;
		this.comanyName = comanyName;
		StartDate = startDate;
		EndDate = endDate;
	}
		
		
	

}
	  
	  