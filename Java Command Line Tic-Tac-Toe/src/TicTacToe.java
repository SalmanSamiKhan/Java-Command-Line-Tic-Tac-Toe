import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

	static Scanner sc = new Scanner(System.in);
//	String [][] ar = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
	Random random = new Random();
	static String[] ar = { "0", "1", "2", "3", "4", "5", "6", "7", "8" };
	
	static int tie_count=0;
	static String player;
	boolean result_flag = true;
	TicTacToe() {
		
		firstTurn();
//		System.out.println("Player "+player+" turn: \n");
		print();
		while(result_flag) {
		
		System.out.println("Player "+player+" turn -->");
		int s = input();
		System.out.println();
		check();
		print();
		}
		
//		update(player);
//		boolean b = valid_input(s);



	}

	public void firstTurn() {

		if (random.nextInt(2) == 0) {
			player = "X";
//			System.out.println("P1's turn --> X ");
		}

		else {

			player= "O";
//			System.out.println("P2's turn --> O");

		}

	}

	public static int input() {
//		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int i = 999;
		while (flag) {

			System.out.print("\ninput num: \n");
			i = sc.nextInt();
			if (i < 0 || i > 8) {
				System.out.println("Please enter from 0..8");
			}

			else {
				if (ar[i] == "X" || ar[i] == "O") {
					System.out.println("Already used! Input another number");
				} else {
					ar[i]= player;
					if(player=="X") {
						player="O";
						
					}
					else{
						player="X";
//						System.out.println("Player "+player+" turn: ");
					}
					flag = false;
					tie_count++;
				}
			}

		}
		return i;
	}

	public void print() {
		
//		System.out.println();
		
		for(int i=0; i<ar.length; i++) {
			System.out.print("| "+ar[i]+" ");	
			if(i==2 || i==5 || i==8){
				System.out.println("|");

			}
		}
		System.out.println();
		
	}

	public void check() {

		// X win condition
		if (ar[0] == "X" && ar[1] == "X" && ar[2] == "X") {
			xWins();
			
		}
		if (ar[3] == "X" && ar[4] == "X" && ar[5] == "X") {
			xWins();
		}
		if (ar[6] == "X" && ar[7] == "X" && ar[8] == "X") {
			xWins();
		}
		if (ar[0] == "X" && ar[3] == "X" && ar[6] == "X") {
			xWins();
		}
		if (ar[1] == "X" && ar[4] == "X" && ar[7] == "X") {
			xWins();
		}
		if (ar[2] == "X" && ar[5] == "X" && ar[8] == "X") {
			xWins();
		}
		if (ar[0] == "X" && ar[4] == "X" && ar[8] == "X") {
			xWins();
		}
		if (ar[2] == "X" && ar[4] == "X" && ar[6] == "X") {
			xWins();
		}
		
		
		//O win condition
		
		if (ar[0] == "O" && ar[1] == "O" && ar[2] == "O") {
			oWins();
			
		}
		if (ar[3] == "O" && ar[4] == "O" && ar[5] == "O") {
			oWins();
		}
		if (ar[6] == "O" && ar[7] == "O" && ar[8] == "O") {
			oWins();
		}
		if (ar[0] == "O" && ar[3] == "O" && ar[6] == "O") {
			oWins();
		}
		if (ar[1] == "O" && ar[4] == "O" && ar[7] == "O") {
			oWins();
		}
		if (ar[2] == "O" && ar[5] == "O" && ar[8] == "O") {
			oWins();
		}
		if (ar[0] == "O" && ar[4] == "O" && ar[8] == "O") {
			oWins();
		}
		if (ar[2] == "O" && ar[4] == "O" && ar[6] == "O") {
			oWins();
		}
		
		// Tie condition
		
		if(tie_count>8) {
			System.out.println("Tied!\n");
			result_flag=false;
		}
		
	

	}

	public void xWins() {
		System.out.println("X wins!\n");
		result_flag=false;

	}
	
	public void oWins() {
		System.out.println("O wins!\n");
		result_flag=false;

	}

}
