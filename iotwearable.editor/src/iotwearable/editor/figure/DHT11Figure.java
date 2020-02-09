package iotwearable.editor.figure;

import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.swt.graphics.Image;

public class DHT11Figure extends InputDeviceFigure{
	public DHT11Figure() {
		image = new Image(null, this.getClass().getResourceAsStream("dht11.png"));
		figure = new ImageFigure(image, PositionConstants.CENTER);
		add(figure);
	}
}
