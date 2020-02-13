package com.example.Whathg_Database.repository;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Whathg_Database.model.Company;


@Repository
@Transactional
public interface CompanyRepository extends CrudRepository<Company, Integer>{
	 
	
	  @Modifying
	  
	  @Query("UPDATE Company company SET company.email = :email WHERE company.CR = :CR"
	  ) void updateEmail(@Param("CR") String CR, @Param("email") String email); //Company

	//Optional<Company> findById(String id);
	  
	  
	  
 // findByEmailAddress(String emailAddress);
	 	/*
	 * @Modifying
	 * 
	 * @Query("UPDATE Company company SET company.StartDate = :StartDate WHERE company.companyRefrence = :companyRefrence"
	 * ) void updateStartDate(@Param("companyRefrence") String
	 * companyRefrence, @Param("StartDate") String StartDate);
	 * 
	 * 
	 * @Modifying
	 * 
	 * @Query("UPDATE Company company SET company.EndDate = :EndDate WHERE company.companyRefrence = :companyRefrence"
	 * ) void updateEndDate(@Param("companyRefrence") String
	 * companyRefrence, @Param("EndDate") String EndDate);
	 * 
	 * 
	 * 
	 * @Modifying
	 * 
	 * @Query("UPDATE Company company SET company.phoneNumber = :phoneNumber WHERE company.companyRefrence = :companyRefrence"
	 * ) void updatePhoneNumber(@Param("companyRefrence") String
	 * companyRefrence, @Param("phoneNumber") String phoneNumber);
	 * 
	 * @Modifying
	 * 
	 * @Query("UPDATE Company company SET company.address = :address WHERE company.companyRefrence = :companyRefrence"
	 * ) void updateAddressr(@Param("companyRefrence") String
	 * companyRefrence, @Param("address") String address);
	 * 
	 * @Modifying
	 * 
	 * @Query("UPDATE Company company SET company.password = :password WHERE company.companyRefrence = :companyRefrence"
	 * ) void updatePassword(@Param("companyRefrence") String
	 * companyRefrence, @Param("password") String password);
	 */
	 
	
}


