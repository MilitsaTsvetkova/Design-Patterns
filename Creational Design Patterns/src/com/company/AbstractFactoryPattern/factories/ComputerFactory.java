package com.company.AbstractFactoryPattern.factories;

import com.company.AbstractFactoryPattern.model.Computer;

//consumer class that will provide the entry point for the client classes to create sub-classes

public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
