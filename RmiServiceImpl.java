package com.example.demo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RmiServiceImpl extends UnicastRemoteObject implements RmiService {

    protected RmiServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public String sayHello(String name) throws RemoteException {
        return "Hello, " + name + "!";
    }
}