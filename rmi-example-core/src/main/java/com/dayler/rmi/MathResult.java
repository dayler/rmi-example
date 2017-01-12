/**
 * 
 */
package com.dayler.rmi;

import java.io.Serializable;

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
