package com.company.FactoryDesignPattern.CalculateElectricityBill.models;

public class DomesticPlan extends Plan {
    @Override
    public void getRate() {
        rate=3.50;
    }
}
