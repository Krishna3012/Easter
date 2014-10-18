/**
 *  This class represents the the calculations for which the day, month and year Easter lands on and notifys the observers.
 */
import java.util.Observable;

public class EasterModel extends Observable 
{

	private Easter east;
	
	/**
	 * 
	 * @param east The calculation for which day easter lands on
	 */
	public EasterModel(Easter east)
	{
		super();
		this.east = east;
	}
	/** 
	 * @return Gets the year for easter
	 */
	public int getYear()
	{
		return east.getYear();
	}
	/**
	 * @return Gets the month for easter
	 */
	public int getMonth()
	{
		return east.getMonth();
	}
	/**
	 * @return Gets the day for easter
	 */
	public int getDay()
	{
		return east.getDay();
	}
	/**
	 * @param year Sets the year for easter
	 */
	public void setYear(int year)
	{
		east.setYear(year);
		setChanged();
		notifyObservers();
	}
	
}

