package com.bridgelabz.core;
import java.util.Scanner;
public class Harmonic {
	

		   public static void main(String[] args) { 

		     // Create a Scanner Object to obtain
		     // User Input from console
		     Scanner sc = new Scanner(System.in);
		     
		      System.out.println("Enter the No. of terms in series : ");
		      // Give the total no. of terms in series in int
		      int noOfTerms = sc.nextInt();
		        
		      // initial sum assigned to be zero
		      double sum = 0.0;
		        
		     // applying the formula 
		     // as : compute (1/1 + 1/2 + 1/3 + ... + 1/N)        
		     for (int a = 1; a <= noOfTerms; a++) {
		         sum = sum + 1.0 / a;
		     }

		     // printing out the Harmonic Sum of series
		     System.out.println("Sum of Harmonic Series is : ");
		     System.out.println(sum);
		    }

		}


