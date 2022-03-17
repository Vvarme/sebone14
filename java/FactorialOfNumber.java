package com.practice.java;
import java.util.Scanner;
/**
 *class name-FactorialOfNumber;
 *@author-Vinod Varme;
 *objective-this class is mainly created for display the factorial of the number;
 *date -17/03/2022;
 */
 public class FactorialOfNumber {
 /**
  *method name-factorialOFNumber; 
  *return_type-void;
  *author name-@Vinod Varme;
  *input parameter-this method takes one int type of argument in the parameter;
  *objective -this method display the;
  */
 public int getfactorial(int Number)
 {
  int result=1;
   for(int temp=Number;temp>0;temp--)
   {
    result=result*temp;
   }
  return result;
 }
 public static void main(String[] args)
 {
   Scanner scanner=new Scanner(System.in);
// creating object of FactorialOfNumber  class;
   FactorialOfNumber factorialofnumber=new FactorialOfNumber(); 
   System.out.println("Enter number for factorial :");
   int Number=scanner.nextInt();
   int result=factorialofnumber.getfactorial(Number);
   System.out.print("factorial of number is :"+result);
  }
}
