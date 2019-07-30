/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labassignment;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author seu
 */
public class TenNumberInputReverseOutput_No_is_5 {
   public static void main(String []args){

Scanner in=new java.util.Scanner(System.in);

        int[]array=new int[10];

        

        for(int i=0;i<array.length;i++){

        System.out.println("Enter the "+(i+1)+" no number");

        array[i]=in.nextInt();
        }
      
System.out.println("Reverse array is : ");
     for(int i=array.length-1; i >=0 ;i--){
        
    System.out.println(array[i]);
        
     }     


   } 
}
