/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereadandsort;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.lang.NumberFormatException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 *@author monirujjaman
 */
public class FileReadAndSort {

   public FileReadAndSort() {
   //attempt1();//java 6/7
   attempt2();//Java 8 ...
   }
   public void attempt1() {
       try {
           RandomAccessFile input=new RandomAccessFile("number.txt","r");
           RandomAccessFile output=new RandomAccessFile("distinct_sorted.txt","rw");
           output.setLength(0);
                   
                   
           String line;
           List<Integer> numberList=new ArrayList();
           
           while((line=input.readLine()) !=  null){
          try{
            int number=Integer.parseInt(line);
            numberList.add(number);
             //System.out.printf("[%s] %d\n",line,number);
           }catch(NumberFormatException nfe){
             // System.err.printf("Not a  number\n",line);
           }
           }
          Collections.sort(numberList) ;
           System.out.println("Sorted Output");
             for(Integer number:numberList){
              System.out.println(number);
          
          }
          
          List<Integer>distinctList=new ArrayList<>();
          for(int i=0;i<numberList.size() - 1;i++)
           if(!numberList.get(i).equals(numberList.get(i+1)))
              distinctList.add(numberList.get(i));
           
           
          // if(!numberList.get(numberList.size()-1).equals(distinctList.get(distinctList.size()-1)))
          if(numberList.size()!=0) 
          distinctList.add(numberList.get(numberList.size()-1));
           
//         System.out.println("Distinct Output");
//         for(Integer number: distinctList){
//              System.out.println(number);
//       }

        for(Integer number: distinctList) 
            output.writeBytes(number + "\n");
 

           
       } catch (FileNotFoundException ex) {
           Logger.getLogger(FileReadAndSort.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(FileReadAndSort.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
    public void attempt2(){
        //Java 8     kalma 
       try {
                List<Integer> distinctList=Files
                   .lines(Paths.get("number.txt"))
                    //.mapToInt(string->Integer.parseInt(string))//convert string toint
                    .map(string->Integer.parseInt(string))//More  powerful thanmapInt;convert all data to anything
                     .filter(number->number>100)               //if we want  those number  whose   are more    than    100
                        .sorted()    // for Sort  
                   .distinct()  //To Erase Mul tiple Copy 
                   .collect(Collectors.toList());//forEach is Tarmianting command 
                  // .forEach(string -> System.out.println(string));// each data  stream wise reading
               //file is printed  by 1  line code
               distinctList.stream().forEach(string -> System.out.println(string));
           try ( //HW................
                   FileWriter writer = new FileWriter("distinct_sorted2.txt")) {
               for(int str: distinctList) {
                   writer.write(str + System.lineSeparator());
               }
           }
                 
                 
                 
                          System.out.println("Maximum value :");         
                         Integer i = Collections.max(distinctList) ;  
                         System.out.println(i); 
                         
                           System.out.println("minimum value :");         
                         Integer j = Collections.min(distinctList) ;  
                         System.out.println(j); 
                         
                          System.out.println("Sum of  the Total value :");
                          double sum = distinctList.stream()
                                   .mapToDouble(a -> a)
                                     .sum();

                        System.out.println(sum); 
                         
               
               
       //////
       } catch (IOException ex) {
           Logger.getLogger(FileReadAndSort.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    
    public static void main(String[] args) {
        new FileReadAndSort();
    }
    
}
