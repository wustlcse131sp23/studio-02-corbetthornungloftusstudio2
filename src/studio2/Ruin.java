package studio2;

import java.util.Scanner;

public class Ruin {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("How much money are you starting with?");
		double startAmount = in.nextDouble();
		System.out.println("Win probability?");
		double winChance = in.nextDouble();
		System.out.println("Win limit?");
		double winLimit = in.nextDouble();
		
		System.out.println("How many days are you playing?");
		int totalSimulations = in.nextInt();
		
		int count = 0;
		double newAmount = startAmount;
		System.out.println(startAmount);
		for(int x = 1; x <= totalSimulations; x++) {
			
		while(newAmount > 0.0 && newAmount < winLimit) {
			//count = 0;
			double rand = Math.random();
		if(rand <= winChance) {
			newAmount++;
			count++;
			//Win Result
			System.out.println(newAmount);
		} 
		else {
			newAmount--;
			count ++;
			//Lose Result
		}
		System.out.println(newAmount);
		//System.out.println("Simulation" + x + ": " + count);
		}
		System.out.println("Simulation " + x + ": " + count);
		newAmount = startAmount;
		count = 0;
		}
		
	}
}
