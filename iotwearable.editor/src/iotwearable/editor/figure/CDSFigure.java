package iotwearable.editor.figure;

import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.swt.graphics.Image;

public class CDSFigure extends InputDeviceFigure{
	public CDSFigure() {
		image = new Image(null, this.getClass().getResourceAsStream("cds.png"));
		figure = new ImageFigure(image, PositionConstants.CENTER);
		add(figure);
	}
}
