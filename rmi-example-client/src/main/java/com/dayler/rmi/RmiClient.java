package com.dayler.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Hello world!
 *
 */
public class RmiClient 
{
    public static void main( String[] args ) {
        if (args.length < 2) {
            System.out.println("use: java RmiClient a b");
            return;
        }
        // set up security manager
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new SecurityManager());
        }
        // 
        try {
            // get registry instance
            Registry registry = LocateRegistry.getRegistry("10.47.17.229");
            // lookup service
            MathService service = (MathService) registry.lookup("rmi-mathService");
            Integer a = Integer.valueOf(args[0]);
            Integer b = Integer.valueOf(args[1]);
            System.out.println("add " + a + "+" + b + "=" + service.add(a, b).getValue());
        } catch (Exception ex) {
            // TODO Auto-generated catch block
            ex.printStackTrace();
        }
    }
}
