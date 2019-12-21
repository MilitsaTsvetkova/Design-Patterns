package com.company.SingleTonDesignPattern;

//The problem with serialized singleton class is that whenever we deserialize it, it will create a new instance of the class.

import java.io.*;

public class SingletonSerializedTest {

    protected Object readresolve(){
        return SerializedSingleton.getInstance();
    }

    public static void main(String[] args) throws FileNotFoundException, IOException,ClassNotFoundException {


        SerializedSingleton instanceOne = SerializedSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
        out.writeObject(instanceOne);
        out.close();

//        deserialize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
        SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
        in.close();

        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());

//        it destroys the singleton pattern, to overcome this scenario all we need to do it provide the implementation of readResolve() method.

    }


}
