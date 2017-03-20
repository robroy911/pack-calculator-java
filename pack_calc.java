/*
 * pack_calc.java
 * 
 * Copyright 2017 Robert York <ryork@debian>
 * 
  */
 
 import java.util.Scanner;
 

public class pack_calc {
	
	public static void main (String args[]) {
		
		
		System.out.println("Welcome to Pack Calc!");

		Scanner user_input = new Scanner(System.in);
		
		System.out.println("Enter you name:");
		System.out.println("----------------");
		String name;
		name = user_input.next();

		System.out.println("Enter you weight:");
		System.out.println("----------------");
		String weightStr;
		weightStr = user_input.next();
		int weight = Integer.parseInt(weightStr);
		
		
		
		System.out.println("Enter you Build:");
		System.out.println("----------------");
		System.out.println("Skinny:");
		System.out.println("Average");
		System.out.println("Athletic");
		System.out.println("Large");
		System.out.println("----------------");
		
		
		String build;
		build = user_input.next();	

	
	if (build.equals("Skinny")) {
		
		double minPackWeight = weight * .17;
		double maxPackWeight = weight * .20;
		
		System.out.println(name + ", your pack should be between " +  minPackWeight + " and "+ maxPackWeight + " lbs.");
		
						}
		
	else if (build.equals(build == "Average")) {
		
		
		double minPackWeight = weight * .19;
		double maxPackWeight = weight * .23;
		
		System.out.println(name + ", your pack should be between " +  minPackWeight + " and "+ maxPackWeight + " lbs.");
		
		}
		
	else if (build.equals("Athletic")) {
		
		double minPackWeight = weight * .25;
		double maxPackWeight = weight * .30;
		
		System.out.println(name + ", your pack should be between " +  minPackWeight + " and "+ maxPackWeight + " lbs.");
		
		}
		
	else if (build.equals("Large")) {
				
		double minPackWeight = weight * .20;
		double maxPackWeight = weight * .25;
		
		System.out.println(name + ", your pack should be between " +  minPackWeight + " and "+ maxPackWeight + " lbs.");
		
		}
		
	else {
		
			System.out.println("Something went wrong!");
		
		}	
		
		
	}
	
	
}

