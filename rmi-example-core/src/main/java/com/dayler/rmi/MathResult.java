/**
 * 
 */
package com.dayler.rmi;

import java.io.Serializable;

/**
 * <p>The MathResult class.</p>
 * <p>NuevaTel PCS de Bolivia S.A. (c) 2017</p>
 * <p>El contenido de este archivo esta clasificado como: </p>
 * <p>INFORMACION DE CONFIDENCIALIDAD ALTA </p>
 * 
 * @author asalazar
 * @version 1.0 Jan 6, 2017
 * @since 1.8
 *
 */
public class MathResult implements Serializable {
    
    private static final long serialVersionUID = 20160106L;
    
    private int value;
    
    public MathResult() {
        // No op
    }
    
    public MathResult(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }
}
