package iotwearable.editor.part;

import org.eclipse.draw2d.IFigure;

import iotwearable.editor.figure.CDSFigure;

public class CDSEditPart extends IODeviceEditPart{
	@Override
	protected IFigure createFigure() {
		return new CDSFigure();
	}
}
