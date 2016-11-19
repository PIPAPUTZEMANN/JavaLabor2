import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {
		int nspieler;
		int activePlayer=03;
		int[][] correctGuesses;
		int matches = 0;
		int[][] tip;
		int[] lottery = new int[6];
		boolean winner = false;
		int gamecounter = 0;
		nspieler = In.readInt("Wie viele Spieler? "); //read number of players from console
		tip = new int[nspieler][];
		correctGuesses = new int[nspieler][];
		for(int i = 0; i < nspieler; i++) {
			correctGuesses[i]=new int[7];
			tip[i] = readPlayerTip();	//read a guess for each player
		}
		while(winner==false) {
			gamecounter++;
			lottery=drawLottery();	//draw lottery
			for(activePlayer=0; activePlayer<nspieler && winner==false; //for all players, but stop if winner is found
					activePlayer++) {
				matches=checkPlayerTip(tip[activePlayer], lottery);	//check for matches
				correctGuesses[activePlayer][matches]++;
				if(matches==6)	//check for winner
					winner = true;
			}
		}
		activePlayer--;//for loop counts up one when a winner was found
		Arrays.sort(lottery); //sorts draw from low to high numbers
		System.out.printf("Wir haben einen Gewinner: Spieler %d\nAnzahl der Ziehungen: %d\nNumbers: ", activePlayer, gamecounter);
		for(int i = 0; i < 6; i++) {
			System.out.printf("%d ", lottery[i]);
		}
		System.out.printf("\n\nSpieler");
		for(int i = 0; i < 7; i++) 
			System.out.printf("\t%d Richtige", i);
		for(int i = 0; i < nspieler; i++) {
			System.out.printf("\n%d\t",i);
			for(int j = 0; j < 7; j++)
				System.out.printf("%d\t\t", correctGuesses[i][j]);
		}
	}
	
	public static int drawLotteryNumber() {
		int number;
		number = (int) Math.floor(Math.random() * 49 + 1); //integer from 1 to 49
		return number;
	}
	
	public static int[] drawLottery() {
		boolean possible = false;
		int[] draw = new int[6];			
		for(int i = 0; i < 6; i++) {		//draw 6 numbers
			possible = true;
			do {		//check if number is valid
				draw[i] = drawLotteryNumber();
				possible = true;
				for(int j = 0; j < i; j++)	
					if(draw[i] == draw[j])	   //number has been drawn before
						possible = false;
			}while(possible==false);
		}
		return draw;
	}
	public static int[] readPlayerTip() {
		boolean possible = false;
		int[] tip = new int[6];
		System.out.println("Geben Sie 6 Zahlen ein.");
		for(int i = 0; i < 6; i++) {
			do {
				tip[i] = In.readInt(i+". "); //read a number from console
				possible = true;
				for(int j = 0; j < i && possible == true; j++)
					if(tip[i] == tip[j] || tip[i] < 1 || tip[i] > 49) { //check is number is valid
						possible = false;
						System.out.println("Zahl nicht gueltig."+
						"Bitte nocheinmal versuchen.");
					}
			}while(possible==false);
			}
		return tip;
	}
	public static int checkPlayerTip(int[] tip, int[] lotteryNumbers) {
		int correct = 0;
		for(int i = 0; i < 6; i++)
			for(int j = 0; j < 6; j++) //check all possible positions
				if(tip[i] == lotteryNumbers[j])
					correct++;	//count correct guesses
		return correct;
	}

}
