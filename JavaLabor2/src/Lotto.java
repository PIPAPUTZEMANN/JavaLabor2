public class Lotto {
	
	
    
	public static void main(String[] args) {
	
	int[] test=drawLottery();
	
	for(int q=0;q<test.length;q++){
	System.out.println(test[q]);
	}
		
		
	}
	
	public static int  drawLotteryNumber(){
	
	int z;
	
	z=(int) (Math.random() * 49 + 1); 
	
	return z;
	
}
	
	public static int [] drawLottery(){
		
		int i;
		int[] feld=new int [6];
		
		for(i=0;i<feld.length;i++){
			
			
			feld[i]=drawLotteryNumber();
			
			
			
		}
		return feld;
		
	}

		
}