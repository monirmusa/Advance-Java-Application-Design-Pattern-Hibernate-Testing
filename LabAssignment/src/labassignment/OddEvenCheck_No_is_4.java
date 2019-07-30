/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labassignment;

import java.util.Scanner;

/**
 *
 * @author seu
 */
public class OddEvenCheck_No_is_4 {
     public static void main(String[] args) {
      int b;
      Scanner input = new Scanner(System.in);
       System.out.println("Enter a Number: ");
       b = input.nextInt();
      if (b % 2 == 0)
         System.out.println("The number is even.");
      else
         System.out.println("The number is odd.");
      
    }
    
    
}
