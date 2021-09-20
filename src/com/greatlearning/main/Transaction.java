package com.greatlearning.main;
import  java.util.Scanner;

public class Transaction 
{

	public static void main(String[] args) 
	
	{
		 Scanner usrInput = new Scanner(System.in);
		 
		 System.out.println("Please Enter the number of transactions");
		 
		 int transactionSize=  usrInput.nextInt();
		 
		 int[] transactionArray = new int[transactionSize];
		 
		 
		 System.out.println("Please enter the transactions");
		 
		 	for(int i=0; i< transactionArray.length; i++ )
		 	{
		 		transactionArray[i]= usrInput.nextInt(); 
		 		
		 	}
		 
		 System.out.println("Please enter the number of targets");
		  
		 int numTargets = usrInput.nextInt();
		   
		   for(int i=0; i< numTargets; i++)
		   {
		      System.out.println("Enter the target");
		      int target= usrInput.nextInt(); 
		      
		      int sum =0;
		      
		      for(int j=0; j<transactionArray.length; j++)
		      {
		    	  sum= sum+transactionArray[j];
		    	  
		    	  if(sum>= target)
		    	  {
		    		  System.out.println("Target Achieved after "+ (j+1) + " transactions");
		    		  break;
		    	  }
		    	  
		    	  if(j== transactionArray.length -1)
		    	  {
		    		  	System.out.println("Target not achieved");
		    	  }
		      }	
		     
		   }
		
		
		
		

	}

}
