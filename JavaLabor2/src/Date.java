
public class Date {
	
	private int day;
	private int month;
	private int year;
	
	private static int[] lastDayInMonth={31, 28, 31, 30, 31, 30, 31, 31, 30, 31 ,30, 31};
	
	
	public Date(){
		
		setDate(1,1,1970);
	}
	
	public Date(int myDay, int myMonth, int myYear){
		
		this();
		
		setDate(myDay,myMonth,myYear);
		
		
	}
	
	public Date(Date other){
		
		this();
		
		if(other != null){
			
			setDate(other.day, other.month, other.year);
			
		}
	}
	 public boolean setDate(int newDay, int newMonth, int newYear){
		 if(isValidDate(day, month, year)){
			 
		 
		 this.day=newDay;
		 this.month=newMonth;
		 this.year=newYear;
		 
		 return true;}
		 
		 else {
			 
			 return false;
		 }
		 
	 }
	 
	 public static boolean isValidDate(int anyDay, int anyMonth, int anyYear){
		 
		 if(anyYear%400 == 0 || (anyYear%4 == 0 && anyYear%100 != 0)){
			 
			 lastDayInMonth[1]=29;
		 }
		 
		 else{
			 
			 lastDayInMonth[1]=28;
			 
		 }
		 
	 
	return (anyYear >= 1582 && anyMonth >=1 && anyMonth <=12 && anyDay >=1 && anyDay <= lastDayInMonth[anyMonth-1]);

	 }
	 
	 public String toString(){
		 
		 return String.format("02d.%02d.%04d", day, month, year);
	 }
	 
//	 public boolean equals(Object other){
//		 
//		 Date o= (Date)other;
//		 
//	 return (day ==o.day && month == o.month && year ==o.year);
//	 }
	 
	 public boolean isBefore(Date other){
		 
		 if(other == null){
			 
			 return false;
		 }
		 
		 else{
			 
			 return(this.year < other.year || (this.year == other.year && this.month < other.month) || (this.year == other.year && this.month == other.month && this.day < other.day));
			 
		 }
	 }
	 
	 public Date nextDay(){
		 
		 if (isValidDate(day+1,month,year)){
			 
			 return new Date(day+1,month,year);}
			 
			 
			 else if(isValidDate(1, month+1,year)){
				 
				 return new Date(1,month+1,year);}
				 
				 else {
					 
					 return new Date(1,month,year+1);
			 }
		 }
	 }
	 

