	package com.practice.java;
	import java.util.Scanner;
	/**
	  *class name-Checkprime
	  *@author-Vinod Varme
	  *Objective-this class is mainly created for checking given number is prime or not
      *date-17/03/2022
    */
	public class Checkprime {
	/**
	  *method name-isprime 
      *return_type-boolean
      *input parameter-this method takes one int type of argument in the parameter
      *objective-this method check that given number is prime or not
    */
    public boolean isprime(int Number) {  
    	if (Number<=1) {  
      	return false;                                                              
        }  
    for (int temp=2;temp<=Number/2;temp++) {  
     if(Number%temp==0) {  
      return false;  
     }  
    }  
    return true;  
   }
   public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    Checkprime checkprime=new Checkprime();
    // creating object of Checkprime class
    System.out.println("Enter number for checking prime:");
    int Number=scanner.nextInt();
    if(checkprime.isprime(Number)==true) {		  
      System.out.println("Given number is prime");
    }
    else {
       System.out.println("Given number not prime");  
    }
  }
 }