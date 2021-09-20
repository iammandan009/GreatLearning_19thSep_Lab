package com.greatlearning.main;
import  java.util.Scanner;

public class MinimumNotes 
{
   public static void main(String args[])
   {
	   Scanner usrInput= new Scanner(System.in);
	   System.out.println("Please enter the number of denominations");
	    int denomination=  usrInput.nextInt();
	    int[] notes = new int[denomination];
	    System.out.println("Please enter the currency denominations value");
	    
	    for(int i=0; i<denomination; i++)
	        {
	    	 notes[i]= usrInput.nextInt();
	        }
	   System.out.println("Enter the amount to Pay");
	   int amountToPay= usrInput.nextInt();
	   
	   MergeSortImplementation ms = new MergeSortImplementation();
	   ms.sort(notes, 0, notes.length-1);
	   
	   int[] numNotes= new int[denomination];
	   
	   for(int i=0; i< notes.length; i++)
	       {
		     	numNotes[i] = (int)(amountToPay / notes[i]);
		       amountToPay= amountToPay % notes[i]; // remaining amount
	       }
	  
	   if(amountToPay !=0) {
		   System.out.println("Not Possible to Pay");
	   }else {
		   
		   for(int i= 0;i< denomination; i++)
	       {
		     System.out.println(notes[i]+":"+ numNotes[i]);
	       }
	   
	         }
		   
	  usrInput.close();
	   
	   
   }
}
