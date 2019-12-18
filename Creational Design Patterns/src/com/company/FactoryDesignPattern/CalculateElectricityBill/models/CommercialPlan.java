package com.company.FactoryDesignPattern.CalculateElectricityBill.models;

public class CommercialPlan extends Plan {
    @Override
   public void getRate() {
        rate=7.50;
    }
}
