package q5;

import java.util.Random;

public class Craps {

	public static int throwDices() {
		
		Random random = new Random();
		
		int diceSides = 6;
		int diceOne = (int)(diceSides * Math.random() + 1.0);
		int diceTwo = (int)(diceSides * Math.random() + 1.0);

		return diceOne + diceTwo;
	}
	
	public static void main(String[] args) {
		
		int rounds = 30;
		while(rounds-- > 0) {
			
			int diceSum = throwDices();
			System.out.println("Pontuacao: " + diceSum);
			
			switch (diceSum) {
			
				case 2: case 3: case 12:
					System.out.println("CRAPS! Banca venceu! Primeiro lance de 2,3 ou 12!");
					break;
			
				case 7: case 11:
					System.out.println("Usuario venceu! Primeiro lance de 7 ou 11!");
					break;
		
				default:
					int playerPoints = diceSum;
					
					do {
						diceSum = throwDices();
						System.out.println("Pontuacao: " + diceSum);
					} while (diceSum != 7 && diceSum != playerPoints);
		
					if (diceSum == playerPoints)
						System.out.println("Usuario venceu! Pontuacao repetida!");
					else
						System.out.println("Banca venceu! Dado rolou 7!");
		
			}
		}
	}
}
