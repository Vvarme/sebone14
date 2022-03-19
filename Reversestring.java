   package com.practice.java;
   import java.util.Scanner;
   /**
     *class name-Reversestring;
     *@author-Vinod Varme;
     *objective-this class is mainly created for reverse the string; 
     *date-17/03/2022;
   */
   public class Reversestring {
   /**
     *method name-getreversestring;
     *return_type-String;
     *@author name-Vinod Varme;
     *input parameter-this method takes one string type of argument in the parameter;
     *objective-this method return the revesrse of the given string;
   */
  public String getreversestring(String string)
  {
       String tempstring="";
       if(string.length()==0) {
		 return string;
       }
       else {
		 for(int temp=string.length()-1;temp>=0;temp--) {
			 tempstring=tempstring+string.charAt(temp);
         }
       }
	 return tempstring;
   }
   public static void main(String[] args)
   {                                                                             
       Scanner scanner=new Scanner(System.in);
       // creating object of Reversestring class; 
       Reversestring reversestring=new Reversestring();    
       System.out.println("Enter string for reverse :");
       String string=scanner.nextLine();
       String result=reversestring.getreversestring(string);
       System.out.print("reverse of given string is : "+result);
       scanner.close();
   }
 }

