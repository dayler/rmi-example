/**
 * 
 */
package com.dayler.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * <p>The MathService class.</p>
 * <p>NuevaTel PCS de Bolivia S.A. (c) 2017</p>
 * <p>El contenido de este archivo esta clasificado como: </p>
 * <p>INFORMACION DE CONFIDENCIALIDAD ALTA </p>
 * 
 * @author asalazar
 * @version 1.0 Jan 5, 2017
 * @since 1.8
 *
 */
public interface MathService extends Remote {
    
    MathResult add(int a, int b) throws RemoteException;
    
    MathResult sub(int a, int b) throws RemoteException;
}
