/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simpleinterest;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class startserver {
    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        siserver si = new siserver();
        Registry reg = LocateRegistry.createRegistry(18888);
        reg.bind("Simple Interest",si); 
        System.out.println("Server is Started.......");
    }
}
