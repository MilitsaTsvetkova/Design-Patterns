package com.company.FactoryDesignPattern.factory;

import com.company.FactoryDesignPattern.model.Computer;
import com.company.FactoryDesignPattern.model.PC;
import com.company.FactoryDesignPattern.model.Server;

public class ComputerFactory {

    public static Computer getComputer(ComputerType type, String ram, String hdd, String cpu){

        Computer computer = null;
        switch (type){
            case PC:
               computer= new PC(ram,hdd,cpu);
               break;
            case Server:
                computer = new Server(ram,hdd,cpu);
                break;

        }
        return computer;
    }
}
