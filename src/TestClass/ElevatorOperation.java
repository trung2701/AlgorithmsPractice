package TestClass;

import java.util.Scanner;

public class ElevatorOperation {
	
	private static class Elevator {
		int buildingTop = 10, buildingBot = -1;
		Scanner reader;
		
		public void SetUpElevator(){
			reader = new Scanner(System.in);
		}
		
		public void FinalizeElevator(){
			reader.close();
		}
				
		public int elevatorDown(int departLvl){
			int arrLvl = 0;
			int step = 0;
			int actualLvl = 0;
			
			while(true){
				if (step == 0) {
					System.out.println("Enter level you are going to: ");
					arrLvl = reader.nextInt();
				} else {
					if (arrLvl >= buildingBot && arrLvl < departLvl) {
						System.out.println("Level " + arrLvl + " is selected. Going down...");
						break;
					} else {
						System.out.println("Level is not existed. Enter level again: ");
						arrLvl = reader.nextInt();
					}
				}
				
				step++;				
			}
			
			System.out.println("Depart from level " + departLvl + " to level " + arrLvl);

			for (int i = departLvl; i >= arrLvl; --i) {
				System.out.println("currently you are here: " + i);
				actualLvl = i;
			}
			
			return actualLvl;
		}
		
		public void elevatorUp(int departLvl){
			int arrLvl = 0;
			int step = 0;
			while(true){
				if (step == 0) {
					System.out.println("Enter level you are going to: ");
					arrLvl = reader.nextInt();
				} else {
					if (arrLvl <= buildingTop && arrLvl > departLvl) {
						System.out.println("Level " + arrLvl + " is selected. Going up...");
						break;
					} else {
						System.out.println("Level is not existed. Enter level again: ");
						arrLvl = reader.nextInt();
					}
				}
				
				step++;				
			}
			
			System.out.println("Depart from level " + departLvl + " to level " + arrLvl);
			
			for (int i = departLvl; i <= arrLvl; i++) {
				System.out.println("currently you are here: " + i);
			}
		}
	}
	
	
	
	public static void main(String[] args){
		Elevator test = new Elevator();
		test.SetUpElevator();
		int currentlv = test.elevatorDown(5);
		test.elevatorUp(currentlv);
		test.FinalizeElevator();
	}
}
