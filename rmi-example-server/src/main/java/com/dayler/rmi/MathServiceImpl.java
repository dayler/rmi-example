/**
 * 
 */
package com.dayler.rmi;

import java.rmi.RemoteException;

/**
 * <p>The MathServiceImpl class.</p>
 * <p>NuevaTel PCS de Bolivia S.A. (c) 2017</p>
 * <p>El contenido de este archivo esta clasificado como: </p>
 * <p>INFORMACION DE CONFIDENCIALIDAD ALTA </p>
 * 
 * @author asalazar
 * @version 1.0 Jan 5, 2017
 * @since 1.8
 *
 */
public class MathServiceImpl implements MathService {
    
    public MathServiceImpl() throws RemoteException {
        // No op
    }
    
    /* (non-Javadoc)
     * @see com.dayler.rmi.MathService#add(int, int)
     */
    @Override
    public MathResult add(int a, int b) throws RemoteException {
        return new MathResult(a + b);
    }

    /* (non-Javadoc)
     * @see com.dayler.rmi.MathService#sub(int, int)
     */
    @Override
    public MathResult sub(int a, int b) throws RemoteException {
        return new MathResult(a - b);
    }
}
