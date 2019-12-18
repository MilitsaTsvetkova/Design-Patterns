package com.company.FactoryDesignPattern.CalculateElectricityBill.models;

public class InstitutionalPlan extends Plan{
    @Override
   public void getRate() {
        rate=5.50;
    }
}
