/**
 * Creates slider for when Easter is
 */
import javax.swing.JSlider;
import javax.swing.event.*;

public class SliderListener implements ChangeListener
{
	private JSlider slider;
	private EasterModel model;
	/**
	 * @param model The calculations for when easter is 
	 * @param slider The slider to choose when easter is 
	 */
	public SliderListener(EasterModel model, JSlider slider)
	{
		this.model = model;
		this.slider = slider;
	}
	
	public void stateChanged(ChangeEvent e)
	{
		int value = slider.getValue();
		model.setYear(value);
	}

}
