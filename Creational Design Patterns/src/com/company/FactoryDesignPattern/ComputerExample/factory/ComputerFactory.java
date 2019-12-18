package com.company.FactoryDesignPattern.ComputerExample.factory;

import com.company.FactoryDesignPattern.ComputerExample.model.Computer;
import com.company.FactoryDesignPattern.ComputerExample.model.PC;
import com.company.FactoryDesignPattern.ComputerExample.model.Server;

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
