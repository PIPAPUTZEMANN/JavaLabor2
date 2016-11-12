public class Lotto {
	
	
    
	public static void main(String[] args) {
	
	int[] AusgabeZiehung=drawLottery();
	
	for(int q=0;q<AusgabeZiehung.length;q++){
	System.out.println(AusgabeZiehung[q]);
	}
	
	
	int[] EingabeZahlen=readPlayerTip();{
		
		
	}
	
	
		
		
	}
	
	public static int  drawLotteryNumber(){
	
	int z;
	
	z=(int) (Math.random() * 49 + 1); 
	
	return z;
	
}
	
	public static int[] drawLottery(){
		
		int i;
		int[] feld=new int [6];
		
		for(i=0;i<feld.length;i++){
			
			
			feld[i]=drawLotteryNumber();
			
			
			
		}
		return feld;
		
	}

	public static int[] readPlayerTip(){
		
	int r=0;
	int zaehler;
	int y=0;
	
	int[] eingabeZahl= new int[6];
	
	for(zaehler=0;zaehler<6;zaehler++){
		
		r++;
	
	System.out.println("Bitte geben sie die "+r+" . ein!");
		y=In.readInt();
		
		if (y<=0 || y>49){
		    System.out.println("Zahl nicht gültig");
		    System.exit( 0 );}
		

	
	else {
		eingabeZahl[zaehler]=y;
	}
		
	
	}
		return eingabeZahl;
		
	}
	
	
}