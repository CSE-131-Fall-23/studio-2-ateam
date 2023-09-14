package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("start Amount is?: ");
		int startAmount= in.nextInt();
		System.out.println("Win chance?: ");
		double winChance= in.nextDouble();
		System.out.println("Win limit?: ");
		int winLimit= in.nextInt();
		System.out.println("Toltal games?: ");
		int totalSimulations= in.nextInt();
		int start=0;
		int wins=0;
		while( totalSimulations>0 && startAmount>0 && startAmount<winLimit) {
			totalSimulations--;
			start++;
			double rand= Math.random();
			if(rand<winChance) {
				startAmount++;
				wins++;
				System.out.println("Round: " +start+ ". You won!  You have: $" +startAmount);
			}else {
				startAmount--;
				System.out.println("Round: " +start+ ". You lost :(  You have: $" +startAmount);
			}
			
		}
		System.out.println("Day done :). You have: $" +startAmount+ " after " +start+ " rounds. Ruin rate: "+(Math.round(wins/totalSimulations)*100.0)/100.0) +"Expected ruin rate: " +(wins/totalSimulations));
			
		
	}
	

}
