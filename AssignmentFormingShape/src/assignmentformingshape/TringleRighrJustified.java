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
public class TringleRighrJustified {
     public static void main(String[] args) {
  
    // System.out.println("Hasib");
     
     Scanner input=new Scanner(System.in);
     int number;
        System.out.println("Enter the number of Star:");
     number=input.nextInt();
     
     /*
     /* Iterate through rows */
    for(int i=1; i<=number; i++)
    {
        /* Print spaces in decreasing order of row */
        for(int j=i; j<number; j++)
        {
              System.out.printf(" ");
        }

        /* Print star in increasing order or row */
        for(int j=1; j<=i; j++)
        {
             System.out.printf("*");
        }

        /* Move to next line */
      System.out.println();
    }
    
    System.out.println();
     
     
    }
    
}
