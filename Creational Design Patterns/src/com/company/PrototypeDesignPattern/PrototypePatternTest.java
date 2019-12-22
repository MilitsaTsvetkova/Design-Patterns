package com.company.PrototypeDesignPattern;

import java.util.List;

public class PrototypePatternTest {
    public static void main(String[] args) throws CloneNotSupportedException{
        Employees emp = new Employees();
        emp.loadData();

        Employees empNew = (Employees)emp.clone();
        Employees empNew1 = (Employees)emp.clone();
        List<String> list = empNew.getEmployeeList();
        list.add("EmployeeNew");
        List<String> list1 = empNew1.getEmployeeList();
        list1.remove("Employee1");

        System.out.println("employee list:" + emp.getEmployeeList());
        System.out.println("employee listNew:" + list);
        System.out.println("employee listNew1:" + list1);
    }

//If the object cloning was not provided,
// we will have to make database call to fetch the employee list every time. Then do the manipulations that would have been resource and time consuming.
}
