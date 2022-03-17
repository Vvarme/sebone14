package com.practice.java;
import java.util.Scanner;
/**
 *class name-SumOfnumber;
 *@author-Vinod Varme;
 *objective-this class is mainly created for calculating sum of all the numbers from 0 to number-1;  *date-17/03/2022;
 */
 public class SumOfnumber {
/**
 *method name-Sumofnumber;
 *return_type-int;
 *@author name-Vinod Varme;
 *input parameter-this method takes one int type of argument in the parameter;
 *objective-this method return the sum of all 0 to given number-1;
*/
 public int getsumofnumber(int number) {
  int sumofnumber=0;      
  for(int temp=1;temp<number;temp++){
    sumofnumber=sumofnumber+temp;  
    }
   return sumofnumber;   
  }
 public static void main(String[] args)
 {
   Scanner scanner=new Scanner(System.in);
   // creating object of SumOfnumber class; 
   SumOfnumber sumofnumber=new SumOfnumber();    
   System.out.println("Enter number for sum :");
   int Number=scanner.nextInt();
   int result=sumofnumber.getsumofnumber(Number);
   System.out.print("number of digit is :"+result);
  }
 }
