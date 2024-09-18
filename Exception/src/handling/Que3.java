package handling;

import java.util.Scanner;

class Invalidageexception extends Exception{
	
	Invalidageexception(String ns){
		System.out.println(ns);
		
	
	}}
		public class Que3 {
	 public static void main(String[] args) {
			Scanner nm = new Scanner(System.in);
			int age = nm.nextInt();
			
		try {
			vote(age);
		}
		catch (Exception e) {
		System.out.println("Age should be above 18");
		}
	}

	private static void vote(int age) throws Exception {
	
	if (age < 18) {
		throw new Invalidageexception("Not eligible");
		
	}
	
	else { 
		System.out.println("Eligible");
	}
	}}