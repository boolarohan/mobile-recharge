package com.capg.mra.customermanagementsystem.service;

import java.util.List;

import com.capg.mra.customermanagementsystem.dto.Plans;




/**
 * @author Boola Rohan
 * @author Sumani
 *
 */
public interface IPlansService {
	
	public Plans addPlans(Plans plan);

	public boolean removePlans(Long planId);
	
	public Plans findByPlansPriceAndOperatorAndCircle(Long price, String operator,String circle);

	public List<Plans> getAllPlans();

	public List<Plans> getPlansByPrize(Long planPrize);

}
