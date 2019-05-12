package iotwearable.editor.part;

import org.eclipse.draw2d.IFigure;

import iotwearable.editor.figure.LM35Figure;

public class LM35EditPart extends IODeviceEditPart{
	@Override
	protected IFigure createFigure() {
		// TODO Auto-generated method stub
		return new LM35Figure();
	}
}
