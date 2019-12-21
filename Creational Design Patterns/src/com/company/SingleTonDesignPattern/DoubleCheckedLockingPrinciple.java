package com.company.SingleTonDesignPattern;

public class DoubleCheckedLockingPrinciple {

    private static DoubleCheckedLockingPrinciple instance;

    private DoubleCheckedLockingPrinciple() {
    }

    public static DoubleCheckedLockingPrinciple getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingPrinciple.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingPrinciple();
                }
            }
        }

        return instance;
    }
}
