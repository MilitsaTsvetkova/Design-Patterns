package com.company.FactoryDesignPattern.CalculateElectricityBill.factory;

import com.company.FactoryDesignPattern.CalculateElectricityBill.models.CommercialPlan;
import com.company.FactoryDesignPattern.CalculateElectricityBill.models.DomesticPlan;
import com.company.FactoryDesignPattern.CalculateElectricityBill.models.InstitutionalPlan;
import com.company.FactoryDesignPattern.CalculateElectricityBill.models.Plan;

public class GetPlanFactory {

    public Plan getPlan(String planType){
        if (planType==null){
            return null;
        }else if (planType.equalsIgnoreCase("DOMESTICPLAN")){
            return new DomesticPlan();
        }else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){
            return new CommercialPlan();
        }else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")){
            return new InstitutionalPlan();
        }
        return null;
    }

}
