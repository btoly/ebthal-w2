package com.example.Whathg_Database.controller;



import java.sql.Timestamp;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Whathg_Database.DTO.CompanyDTO;
import com.example.Whathg_Database.DTO.IndividualDTO;
import com.example.Whathg_Database.Error.ValidationError;
import com.example.Whathg_Database.model.Company;
import com.example.Whathg_Database.repository.CompanyRepository;
import com.example.Whathg_Database.service.CompanyService;
import com.example.Whathg_Database.service.IndividualService;

@RestController
public class Company_Contoller {


@Autowired
CompanyService companyService;





CompanyDTO companyDTO =new CompanyDTO("ebhal23@gmail.com", "054523893", "Riyadd", "1631", "154s131" 
		,"Elm", Timestamp.valueOf("2019-11-12 02:02:03.123456789"),Timestamp.valueOf("2019-11-12 02:02:03.123456789"));




@RequestMapping("/ADD_Componyy")

public String ADD_Compony() {

	companyService.createCompanyDTO(companyDTO);

	return "Done";

	
	
}

	  @RequestMapping("/updateCompany")
	  
	  public CompanyDTO update()
	  
	  { 
	  
	  return companyService.updateEmailcompanyDTO("111","ppppppppppppppppppppppp@gmail.com");
	  
	  }
	  
	  
	

	  
	  
		  @RequestMapping("/FindCompany")
		  
		  public String FindbyID() throws Exception{
		  
		  companyService. getById(76);
		  
		  return "Find  Companyy";
		  
		  }
		 
	  
		  
}
