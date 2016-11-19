public class Lotto {
	
	
    
	public static void main(String[] args) {
	
	int[] AusgabeZiehung=drawLottery();
	
	for(int q=0;q<AusgabeZiehung.length;q++){
	System.out.println(AusgabeZiehung[q]);
	}
	
	readPlayerTip();

	
	
	
		
		
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
		
		int[] SpielerZahl=new int [6];
		int ZahlReihenfolge;
		int abFrageReihenfolge;
		int g=0;
		
		
		for(ZahlReihenfolge=0;ZahlReihenfolge<6;ZahlReihenfolge++){
			
			g++;
		    System.out.println("Bitte geben Sie die " +g+ ". Zahl ein");
		    SpielerZahl[ZahlReihenfolge]= In.readInt();
		    
		    if (SpielerZahl[ZahlReihenfolge]<=0 || SpielerZahl[ZahlReihenfolge]>49){
			    System.out.println("Zahl nicht gültig");
			    System.exit( 0 );}
		    
		
		for(abFrageReihenfolge=0;abFrageReihenfolge<ZahlReihenfolge;abFrageReihenfolge++){
			
			if(SpielerZahl[ZahlReihenfolge] == SpielerZahl[abFrageReihenfolge]){
				System.out.println("Keine doppelten Zahlen");
				System.exit( 0 );
				
		
			}
		}
		}
		return SpielerZahl;
		
	
		

	
	
		
	}
	
	
}