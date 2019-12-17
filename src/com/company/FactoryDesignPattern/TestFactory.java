package com.company.FactoryDesignPattern;

import com.company.FactoryDesignPattern.factory.ComputerFactory;
import com.company.FactoryDesignPattern.model.Computer;

public class TestFactory {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("PC","2 GB","500 GB","2.4 GHz");
        Computer server = ComputerFactory.getComputer("Server","16 GB","1 TB","2.9 GHz");
        System.out.println("Factory PC Configuration: "+ pc);
        System.out.println("Factory Server Configuration: "+ server);
    }
}