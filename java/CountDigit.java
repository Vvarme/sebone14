package com.practice.java;
import java.util.Scanner;
/**
 *class name-CountDigit;
 *@author-Vinod Varme;
 *objective-this class is mainly created for counting the number of digits are available in given number;
 *date-17/03/2022;
*/
public class CountDigit {
/**
 *method name-getcountdigit;   
 *return_type-void;
 *author name-@Vinod Varme;
 *input parameter-this method takes one int type of argument in the parameter;
 *objective -this method return the of digits available in the given number ;
*/
public int getcountdigit(int number) {
 int numberofdigit=0;
 while(number>0)
  {
  number=number/10;
  numberofdigit++;
  }
 return numberofdigit;
}
public static void main(String[] args)
{
  Scanner scanner=new Scanner(System.in);
 //creating object of CountDigit class;
  CountDigit countdigit=new CountDigit();      
  System.out.println("Enter number for count digit :");
  int Number=scanner.nextInt();
  int result=countdigit.getcountdigit(Number);
  System.out.print("number of digit is :"+result);
 }
}	
	
