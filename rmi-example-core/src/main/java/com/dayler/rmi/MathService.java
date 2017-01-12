/**
 * 
 */
package com.dayler.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MathService extends Remote {
    
    MathResult add(int a, int b) throws RemoteException;
    
    MathResult sub(int a, int b) throws RemoteException;
}
