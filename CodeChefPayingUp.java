/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codechefpayingup;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import java.util.Scanner;

/**
 *
 * @author harshanandrews
 */
public class CodeChefPayingUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);

        System.out.println("Input number of test cases:");
        int t = sc.nextInt();
        
        while (t != 0)
        {
            System.out.println("Input number of notes in wallet:");
            int n = sc.nextInt();

            System.out.println("Input money demanded by muggers");
            int m = sc.nextInt();

            System.out.println("Input value of banknotes:");
            int v[] = new int[n];

            int binary_array[] = new int[n];
            boolean res = FALSE;

            for (int i = 0; i < n; i++) {
                v[i] = sc.nextInt();
            }
            for (int i = 1; i < Math.pow(2,n); i++)
            {
                String s = Integer.toBinaryString(i);
                for (int j = s.length() - 1; j >= 0; j--)
                {
                    if(Character.isDigit(s.charAt(j)))
                    binary_array[n + j - s.length()] = Integer.parseInt(String.valueOf(s.charAt(j)));
                }
            
                int sum = 0;
                for (int j = 0; j < n; j++)
                    sum = sum + v[j] * binary_array[j];
            
                if (sum == m)
                {
                    res = TRUE;
                    break;
                }
            }
            System.out.println(res);
            t--;
        }
    }

}
