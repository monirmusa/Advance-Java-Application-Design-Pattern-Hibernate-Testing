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
public class FiveNumberInputEvenOutput_No_is_6 {
     public static void main(String []args){

        Scanner in=new java.util.Scanner(System.in);

        int[]array=new int[5];

        

        for(int i=0;i<array.length;i++){

        System.out.println("Enter the "+(i+1)+" no number");

        array[i]=in.nextInt();
        }
      
         System.out.println("Entered Even Number is : ");
        for(int i=0; i<array.length ;i++){
            if( array[i] %2 == 0){
                 System.out.println(array[i]);
            }
        
         
        
     }     


   } 
}
