/**
 * EasterComponents creates the slider interface for when easter is.
 */
import javax.swing.JPanel;
import javax.swing.JSlider;

public class EasterComponent extends JPanel 
{
/**
 * 
 * @param east Calculates when easter is
 * @param min smallest date for easter
 * @param max biggest date for easter
 * @param initial initial date for easter
 */
	public EasterComponent(Easter east, int min, int max, int initial)
	
	{
		super();
		EasterModel model = new EasterModel(east);
		
		
		EasterView year = new EasterView(model);
		
		model.addObserver(year);
		
		
		
		JSlider slider = new JSlider(min, max, initial);
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing((max - min)/4);
		slider.setPaintLabels(true);
		slider.setLabelTable(
			slider.createStandardLabels((max - min)/4));
		
		SliderListener listen = new SliderListener(model, slider);
		
		slider.addChangeListener(listen);
		
		
		add(slider);
		add(year);
		
		
		
}
}

