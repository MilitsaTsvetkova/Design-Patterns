package com.company.SingleTonDesignPattern;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Objects;

import static com.company.SingleTonDesignPattern.EnumSingleton.INSTANCE;

//Sometimes in distributed systems, we need to implement Serializable interface in Singleton class so that we can store its state in the file system and retrieve it at a later point of time
public class SerializedSingleton implements Serializable {

    private static final long serialversionUID = -7604766932017737115L;

    private SerializedSingleton(){
    }

    private static class SingletonHelper{
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance(){
        return SingletonHelper.instance;
    }

    protected Object readresolve() throws ObjectStreamException {
        return getInstance();
    }
}
