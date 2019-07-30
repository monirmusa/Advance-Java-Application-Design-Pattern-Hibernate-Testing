/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labassignment;

import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author seu
 */
public class CurrentCalculation_2_No_Assignment {
       public static void main(String []args){

Scanner in=new java.util.Scanner(System.in);
 double I,E,R,L,C,F,A,B,X;
     
    System.out.println("Enter the Voltage" );
      E = in.nextDouble();
        ///
        System.out.println("Enter the Resestance");
       R=in.nextDouble();
       ///
    System.out.println("Enter the Inductance");
       L=in.nextDouble();
       ///
         System.out.println("Enter the Capacitance");
       C=in.nextDouble(); 
       ///
         System.out.println("Enter the Frequency");
       F=in.nextDouble(); 
        
      A=((2*PI*F*L)-(1/(2*PI*F*C)));
      B=R*R+A;
      X=Math.sqrt(B);
      I=E/X;
        
           System.out.println("Curreni is: "+I+" Amperes");
        
     } 
}
