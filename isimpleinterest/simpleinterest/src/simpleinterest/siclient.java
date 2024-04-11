/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simpleinterest;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.LocateRegistry.*;
import java.rmi.registry.Registry;
import java.util.Scanner;


public class siclient {
    public static void main(String[] args)throws RemoteException, NotBoundException {
        Registry reg = LocateRegistry.getRegistry(18888);
        isimpleinterest si = (isimpleinterest) reg.lookup("Simple Interest");
        Scanner input = new Scanner(System.in);
        double p, t, r;
        String ans = "n";
        do {
            System.out.println("Simple Interest Calculation");
            System.out.println("Principle: ");
            p = input.nextDouble();
            System.out.println("Time: ");
            t = input.nextDouble();
            System.out.println("Rate: ");
            r = input.nextDouble();
            System.out.println("Simple Interest is :"+si.ComputeInterest(p, t, r));
            System.out.println("Do you want to continue [y/n]?");
            input.nextLine();
            ans = input.nextLine();
            
            
        }while(ans.toLowerCase().charAt(0)== 'y');
        
        
    }
 
}


