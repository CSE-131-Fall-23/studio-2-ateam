package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Start Amount is?: $");
		int startAmount= in.nextInt();
		System.out.println("Win chance?: ");
		double winChance= in.nextDouble();
		System.out.println("Win limit? (per day): ");
		int winLimit= in.nextInt();
		System.out.println("Total simulations (days)?: ");
		int totalSimulations= in.nextInt();
		
		
		//initial values
		int start=0;
		int wins=0;
		int losses=0;
		int currentBalance= startAmount;
		int rounds=0;
		boolean won=false;
		
		//run number of days
		for(int i=1;i<=totalSimulations; i++) {
			// play each day
			
			
			while(currentBalance>0 && currentBalance<winLimit ) {
				double rand= Math.random();
				if(rand<winChance) {
					currentBalance++;
				}else {
					currentBalance--;
				}
				rounds++;
			}
			
			//after each game
			if(currentBalance<=0) {
				losses++; //you lost if you ended with $0
				won=false;
			}else {
				wins++; // you won if you ended with more than $0 (for some reason...)
				won=true;
			}
			
			//print number of rounds played before losing or winning
			System.out.println("On day "+i+ " you played " +rounds+ " and you won: " +won );
			
		
			//reset current balance to start amount
			currentBalance=startAmount;
			rounds=0; 
			
		}
		
		System.out.println("Ruin rate is " + ((double)losses)/(losses+wins));
		
	}
	

}
