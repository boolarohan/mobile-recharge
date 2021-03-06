package com.capg.mra.adminmanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.capg.mra.adminmanagementsystem.dto.Plans;

public interface PlansRepo extends JpaRepository<Plans, Long>{

	public List<Plans> findByPlansPrice(Long plansPrice);
	
	public Plans findByPlansName(String plansName);
	
	@Query("From Plans As plans where plans.plansPrice= :price AND plans.operator= :operator AND plans.circle= :circle")
	public Plans findByPlansPriceAndOperatorAndCircle(@Param("price")  Long price,@Param("operator") String operator, @Param("circle") String circle);
	
}
