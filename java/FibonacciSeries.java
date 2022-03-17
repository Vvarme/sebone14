 package com.practice.java;
 import java.util.Scanner;
 /**
  *class name-FibonacciSeries ;
  *author-@Vinod Varme;
  *objective-this class is mainly created for display the fibonacci series up to given number;
  *date-17/03/2022;
 */
 public class FibonacciSeries {
  /**
   *method name-fibonacci_series ;
   *return_type-void ;
   *@author name-Vinod Varme;
   *input parameter-this method takes one int type of argument in the parameter.
   *objective -this method display all the fibonacci number till the given number in the parameter;
  */
 public void printfibonacciseries(int Number)
 {
   int number1=0,number2=1,number3=0;
   System.out.print(number1+" "+number2);
   for(int temp=3;temp<=Number;temp++)
    {
     number3=number1+number2;
     System.out.print(" "+number3);
     number1=number2;
     number2=number3;
     }
 }
 public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
  //creating object of FibonacciSeries class;
   FibonacciSeries fibonacciseries=new FibonacciSeries(); 
   System.out.println("Enter number for print number of fibonacci number:");
   int Number=scanner.nextInt();
   fibonacciseries.printfibonacciseries(Number);                
 }
}