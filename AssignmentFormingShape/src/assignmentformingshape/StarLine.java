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
public class StarLine {
    public static void main(String[] args) {
    
      Scanner input=new Scanner(System.in);
       int number;
        System.out.println("Enter the number of Star:");
     number=input.nextInt();
      for(int i=0; i<number; i++)
    {
          System.out.print("*");
     
     }
     System.out.println();
    }
}
