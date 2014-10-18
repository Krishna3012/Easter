/**
 * Tests Easter.java to see if the correct days and months for easter are produced. 
 */
public class Test {

	public static void main(String [] args)
	
	{
		Easter easter = new Easter(2014);
		
		System.out.println("In the year " + easter.getYear() + " Easter Sunday is on day = " + easter.getDay() + " and on month = " + easter.getMonth());
	}
}

