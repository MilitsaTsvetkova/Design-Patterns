package com.company.AbstractFactoryPattern;

import com.company.AbstractFactoryPattern.factories.*;
import com.company.AbstractFactoryPattern.model.Computer;

public class TestAbstractFactoryDesignPattern {
    public static void main(String[] args) {
        testDesignPattern();

    }

    private static void testDesignPattern(){
        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
        Computer laptop = ComputerFactory.getComputer(new LaptopFactory("8 GB","16 GB","2.8 GHz"));

        System.out.println("AbstractFactory PC Config::"+pc);
        System.out.println("AbstractFactory Server Config::"+server);
        System.out.println("AbstractFactory Laptop Config::"+laptop);
    }
}
