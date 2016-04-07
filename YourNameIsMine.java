/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yournameismine;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import java.util.Scanner;

/**
 *
 * @author harshanandrews
 */
public class YourNameIsMine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input number of test cases:");
        int t = sc.nextInt();
        
        while(t != 0)
        {
            System.out.println("Enter man's and won's names respectively:");
            String m = sc.next();
            String w = sc.next();
            
            boolean b = TRUE;
        
            char s1[] = m.toCharArray();
            char s2[] = w.toCharArray();
            
            if (s1.length < s2.length)
            {
                for(int i = 0; i < s1.length; i++)
                {
                    if(w.indexOf(s1[i]) == -1)
                    {
                        b = FALSE;
                        break;
                    }
                }
            }
            else
            {
                for(int i = 0; i < s2.length; i++)
                {
                    if(m.indexOf(s2[i]) == -1)
                    {
                        b = FALSE;
                        break;
                    }
                }
            }
            
            System.out.println(b);
            t--;
        }
    }
}
