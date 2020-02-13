package com.example.Whathg_Database.DTO;

import java.sql.Timestamp;

import javax.validation.constraints.Email;

import com.example.Whathg_Database.model.Individual;
import com.example.Whathg_Database.model.User_W;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class CompanyDTO  extends User_W{
	
	
	
	  private int Company_ID;
	  private String CR;
	  private String  comanyName;
	
	  private Timestamp StartDate;
	
	 
	  private Timestamp EndDate;






	public CompanyDTO() {
		super();
		// TODO Auto-generated constructor stub
	}










	public CompanyDTO(String email, String phone_number, String address, String password, String cR, String comanyName,
			Timestamp startDate, Timestamp endDate) {
		super(email, phone_number, address, password);
		CR = cR;
		this.comanyName = comanyName;
		StartDate = startDate;
		EndDate = endDate;
	}










	public int getCompany_ID() {
		return Company_ID;
	}





	public void setCompany_ID(int company_ID) {
		Company_ID = company_ID;
	}





	public String getCR() {
		return CR;
	}


	public void setCR(String cR) {
		CR = cR;
	}


	public String getComanyName() {
		return comanyName;
	}


	public void setComanyName(String comanyName) {
		this.comanyName = comanyName;
	}


	public Timestamp getStartDate() {
		return StartDate;
	}


	public void setStartDate(Timestamp startDate) {
		StartDate = startDate;
	}


	public Timestamp getEndDate() {
		return EndDate;
	}


	public void setEndDate(Timestamp endDate) {
		EndDate = endDate;
	}

	  
	  
	  
	
}