package com.dayler.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RmiServer 
{
    /**
     * 
     * @param args
     */
    public static void main( String[] args )
    {
        // export object
        try {
         // get an instance of the service implementation.
            MathServiceImpl service = new MathServiceImpl();
            MathService stub = (MathService) UnicastRemoteObject.exportObject(service, 0);
            Registry registry = LocateRegistry.getRegistry();
            // publish the service. Assign name.
            registry.rebind("rmi-mathService", stub);
            System.out.println("Published rmi-mathService");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
