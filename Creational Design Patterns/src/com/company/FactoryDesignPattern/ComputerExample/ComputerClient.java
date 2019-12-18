package com.company.FactoryDesignPattern.ComputerExample;

import com.company.FactoryDesignPattern.ComputerExample.factory.ComputerFactory;
import com.company.FactoryDesignPattern.ComputerExample.factory.ComputerType;
import com.company.FactoryDesignPattern.ComputerExample.model.Computer;

public class ComputerClient {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer(ComputerType.PC,"2 GB","500 GB","2.4 GHz");
        Computer server = ComputerFactory.getComputer(ComputerType.Server,"16 GB","1 TB","2.9 GHz");
        System.out.println("Factory PC Configuration: "+ pc);
        System.out.println("Factory Server Configuration: "+ server);
    }
}
