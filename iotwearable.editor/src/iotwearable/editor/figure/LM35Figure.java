package iotwearable.editor.figure;

import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.swt.graphics.Image;

public class LM35Figure extends InputDeviceFigure{
	public LM35Figure() {
		image = new Image(null, this.getClass().getResourceAsStream("lm35.png"));
		figure = new ImageFigure(image, PositionConstants.CENTER);
		add(figure);
	}
}
