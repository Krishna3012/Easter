/** 
 * This class represents the the calculations for which the day, month and year Easter lands on
 */
public class Easter {
	private int day;
	private int month;
	private int year;
	/**
	 * @param year Parameter for the year easter is on
	 */
	public Easter (int year)
	{
		this.year = year;
		int a = year % 19;
		int b =  (year / 100);
		int c = year % 100;
		int d =  ( b / 4);
		int e = b % 4;
		int f =  ((b + 8) / 25);
		int g =  ((b - f + 1) / 3);
		int h = (19*a + b - d - g + 15) % 30;
		int i =  ( c / 4);
		int k = c % 4;
		int L = (32 +2*e + 2*i - h - k) % 7;
		int m =  ((a + 11*h + 22*L) / 451);
		this.month =  ((h + L - 7*m + 114) / 31);
		this.day = ((h + L - 7*m + 114) % 31) + 1;
	}
	
	/**
	 * @return returns the day of easter
	 */
	public int getDay()
	{
		return this.day;
	}
	/**
	 * @return returns the month of easter
	 */
	public int getMonth()
	{
		return this.month;
	}
	/** 
	 * @return returns the year of easter
	 */
	public int getYear()
	{ 	
		return this.year;
	}
	/**
	 * @param year sets the year of easter according to gregorian algorithm
	 */
	public void setYear(int year)
	{
		this.year = year;
		int a = year % 19;
		int b =  (year / 100);
		int c = year % 100;
		int d =  ( b / 4);
		int e = b % 4;
		int f =  ((b + 8) / 25);
		int g =  ((b - f + 1) / 3);
		int h = (19*a + b - d - g + 15) % 30;
		int i =  ( c / 4);
		int k = c % 4;
		int L = (32 +2*e + 2*i - h - k) % 7;
		int m =  ((a + 11*h + 22*L) / 451);
		this.month =  ((h + L - 7*m + 114) / 31);
		this.day = ((h + L - 7*m + 114) % 31) + 1;
	}
		


}
