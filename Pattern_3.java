/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author TARUN VERMA
 */
import java.util.*;

public class Pattern_3 {
    /*
    
    *
    **
    ***
    ****
    ***
    **
    *
    
    */
    public static void main(String []arg){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Number:-");
        int n=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.printf("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
