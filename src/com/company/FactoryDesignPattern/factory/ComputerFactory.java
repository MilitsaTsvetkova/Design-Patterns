package com.company.FactoryDesignPattern.factory;

import com.company.FactoryDesignPattern.model.Computer;
import com.company.FactoryDesignPattern.model.PC;
import com.company.FactoryDesignPattern.model.Server;

public class ComputerFactory {

    public static Computer getComputer(String type, String ram, String hdd, String cpu){
        switch (type){
            case "PC":
                return new PC(ram,hdd,cpu);
            case "Server":
                return new Server(ram,hdd,cpu);
                default:
                    return null;
        }
    }
}
