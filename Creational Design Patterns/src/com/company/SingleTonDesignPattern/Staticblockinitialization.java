package com.company.SingleTonDesignPattern;

public class Staticblockinitialization {
    private static Staticblockinitialization instance;

    //static block initialization for exception handling

    static {
        try {
            instance = new Staticblockinitialization();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static Staticblockinitialization getInstance() {
        return instance;
    }
}
