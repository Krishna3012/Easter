/**
 * EasterView.java extends JLabel and implements the Observer to update when Easter is.
 */

import javax.swing.JLabel;
import java.util.Observable;
import java.util.Observer;

public class EasterView extends JLabel implements Observer
{
	private EasterModel model;
	private String[] months = new String[]{"January","February","March","April","May","June","July","August","September","October","November","December"};
	
/**
 * @param Parameter for the date Easter is on
 */
	
	public EasterView(EasterModel model)
	{
		super();
		
		this.model = model;
		int year = model.getYear();
		int month = model.getMonth();
		int day = model.getDay();
		setText("In the " + "year " +  year  + " Easter was on " + day + " " + months[month-1]);
	}
	/**
	 * Updates the the object
	 */
	public void update(Observable obs, Object obj)
	{
		int year = model.getYear();
		int month = model.getMonth();
		int day = model.getDay();
		setText("In the " + "year " +  year  + " Easter was on " + day + " " + months[month-1]);
	}
	

}
