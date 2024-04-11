/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simpleinterest;

import java.rmi.RemoteException;
import java .rmi.server.UnicastRemoteObject;

public class siserver extends UnicastRemoteObject implements isimpleinterest {
public siserver() throws RemoteException{
   super();
}  
        @Override
    public double ComputeInterest(double p, double t, double r) throws RemoteException {
        
        return (p*t*r)/100;
    }

    
}
