/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codechefbrackets;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author harshanandrews
 */
public class CodeChefBrackets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("input number of test cases:");
        int n = sc.nextInt();
        String str[] = new String[n];
        int max_balance[] = new int[n];
        int count;
        StringBuilder s_beg;
        StringBuilder s_end;
        
        for(int i = 0; i < n; i++)
        {
            count = 0;
            s_beg = new StringBuilder("");
            s_end = new StringBuilder("");        
            System.out.println("Input string "+(i+1));
            str[i] = sc.next();
            max_balance[i] = valid_par(str[i]);
            count = max_balance[i];
            
            while(count != 0)
            {
                s_beg.append("(");
                s_end.append(")");
                count--;
            }
            
            System.out.println(s_beg + "" + s_end);
        }
    }
    
    public static int valid_par(String s)
    {
        int bal = 0;
        int max_bal = 0;
        char s_arr[] = s.toCharArray();
                
        for(int i = 0; i < s_arr.length; i++)
        {
            if(s_arr[i] == '(')
                bal = bal + 1;
            if(s_arr[i] == ')')
                bal = bal - 1;
            if(bal > max_bal)
                max_bal = bal;
        }
        
        return max_bal;
    }
    
}
