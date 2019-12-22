package com.company.PrototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

    private List<String> employeeList;

    public Employees() {
        employeeList = new ArrayList<String>();
    }

    public Employees(List<String> list){
        this.employeeList=list;
    }

    public void loadData(){
        employeeList.add("Employee1");
        employeeList.add("Employee2");
        employeeList.add("Employee3");
        employeeList.add("Employee4");
    }

    public List<String> getEmployeeList(){
        return employeeList;
    }

//    the clone method is overridden to provide a deep copy of the employees list.
    @Override
    public Object clone() throws CloneNotSupportedException{
        List<String> temp = new ArrayList<String>();
        for (String s:this.getEmployeeList()) {
            temp.add(s);
        }
        return new Employees(temp);
    }
}
