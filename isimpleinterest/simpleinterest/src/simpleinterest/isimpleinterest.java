/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package simpleinterest;

import java .rmi.*;


public interface isimpleinterest extends Remote {
    double ComputeInterest(double p, double t, double r) throws RemoteException;
    
 
    
}
