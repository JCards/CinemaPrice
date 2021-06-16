//Program Name: Cinema Price
//Author: Joshua Young
//Date: 6/15/2021
//Class: CSC110
//Brief Description: This program will determine how much a person will pay to go to the cinema 

package ch4;

	import java.util.Scanner;
	import java.util.Random;
	import java.text.NumberFormat;
	
public class CinemaPrice {
	
	public static void main(String[] args) {
		
		int age = 0;
		double price = 0.00;
		
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		
		System.out.println("Please enter the cinema ticket price: ");
		price = scan.nextDouble();
		
		System.out.println("Your age: ");
		System.out.println(generator.nextInt( 100 - 1 ) + 1 );
		
		if ( age <= 5 ) {
			NumberFormat fmt = NumberFormat.getCurrencyInstance();
			System.out.println("Your ticket price is " + fmt.format(price) + " which is free.");
		}	
			
		if ( age >= 6 && age <= 12 ) {
	        NumberFormat fmt = NumberFormat.getCurrencyInstance();
	        System.out.println("Your ticket price is " + fmt.format(price) + " which is half price.");
	    }    
		
		if ( age >= 13 && age <= 54 ) {
            NumberFormat fmt = NumberFormat.getCurrencyInstance();
            System.out.println("Your ticket price is " + fmt.format(price) + " which is full price.");
		}
		
		if ( age >= 55) { 
            NumberFormat fmt = NumberFormat.getCurrencyInstance();
            System.out.println("Your ticket price is " + fmt.format(price) + " which is free.");
		}
	}
}

