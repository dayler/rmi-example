package com.dayler.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * 
 * <p>The RmiServer class.</p>
 * <p>NuevaTel PCS de Bolivia S.A. (c) 2017</p>
 * <p>El contenido de este archivo esta clasificado como: </p>
 * <p>INFORMACION DE CONFIDENCIALIDAD ALTA </p>
 * 
 * @author asalazar
 * @version 1.0 Jan 5, 2017
 * @since 1.8
 *
 */
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
