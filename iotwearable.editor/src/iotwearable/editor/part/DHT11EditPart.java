package iotwearable.editor.part;

import org.eclipse.draw2d.IFigure;

import iotwearable.editor.figure.DHT11Figure;;

public class DHT11EditPart extends IODeviceEditPart{
	@Override
	protected IFigure createFigure() {
		return new DHT11Figure();
	}
}
