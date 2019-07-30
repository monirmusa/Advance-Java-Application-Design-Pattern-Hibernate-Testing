/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentformingshape;

import java.util.Scanner;

/** 
 *
 * @author seu
 */
public class TringleLeftJustified {
    
     public static void main(String[] args) {
  
    // System.out.println("Hasib");
     
     Scanner input=new Scanner(System.in);
     int number;
        System.out.println("Enter the number of Star:");
     number=input.nextInt();
     
      for(int i=1; i<=number; i++)
    {
        /* Print i number of stars */
        for(int j=1; j<=i; j++)
        {
           System.out.printf("*");
        }

       System.out.println();
    }
        System.out.println();
     
     
    }
}
