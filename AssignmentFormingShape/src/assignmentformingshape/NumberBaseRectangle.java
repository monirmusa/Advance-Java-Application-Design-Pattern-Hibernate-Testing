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
public class NumberBaseRectangle {
     public static void main(String[] args) {
         
    
     int rows,cols;
     System.out.println("Enter the number rows and column:");
     Scanner input1=new Scanner(System.in);
     Scanner input2=new Scanner(System.in);
     rows=input1.nextInt();
     cols=input2.nextInt();
     ///
     for(int i=1; i<=rows; i++)
    {
        for(int j=1; j<=cols; j++)
        {
            // Print the current column number
            System.out.print(j);
        }

        System.out.println();
    }
 
     System.out.println();
    }
}
