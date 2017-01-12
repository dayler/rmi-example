/**
 * 
 */
package com.dayler.rmi;

import java.rmi.RemoteException;

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
