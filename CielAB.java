/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cielab;

import java.util.Scanner;

/**
 *
 * @author harshanandrews
 */
public class CielAB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 1st number:");
        int n1 = sc.nextInt();
        
        System.out.println("Enter 2nd number:");
        int n2 = sc.nextInt();
        
        int ans;
        
        if(n1>n2)
            ans = n1 - n2;
        else
            ans = n2 - n1;
        
        int temp = ans % 10;
        
        ans = ans - temp;
        
        if(temp != 0)
            temp = temp - 1;
        else
            temp = temp + 1;
        
        ans = ans + temp;
        
        System.out.println(ans);
    }
    
}
