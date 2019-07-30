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
public class RectangleShape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
    // System.out.println("Hasib");
     
     Scanner input=new Scanner(System.in);
     int number;
        System.out.println("Enter the number of Star:");
     number=input.nextInt();
      for(int i=0; i<=3; i++)
    {
        
        for(int j=0; j<number; j++)
        {
            
           System.out.printf("*");
        }
         System.out.println();
     }
     System.out.println();
    }
    
    
    
}

