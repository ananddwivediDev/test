package com.example.demo;

import java.rmi.RemoteException;

public interface HelloWorldRMI
{
    public String sayHelloRmi(String msg);
    boolean authenticate(String username, String password) throws RemoteException;

}