package com.company.SingleTonDesignPattern;

import java.io.Serializable;
//Sometimes in distributed systems, we need to implement Serializable interface in Singleton class so that we can store its state in the file system and retrieve it at a later point of time
public class SerializedSingleton implements Serializable {

    private static final long serialversionUID = -7604766932017737115L;

    private SerializedSingleton(){}

    protected Object readresolve(){
        return getInstance();
    }

    private static class SingletonHelper{
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance(){
        return SingletonHelper.instance;
    }
}
