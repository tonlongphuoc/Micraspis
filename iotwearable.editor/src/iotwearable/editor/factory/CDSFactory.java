package iotwearable.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import iotwearable.model.iotw.CDS;
import iotwearable.model.iotw.IotwFactory;

/**
 * Used to create new CDS
 */
public class CDSFactory implements CreationFactory{
	@Override
	public Object getNewObject() {
		return IotwFactory.eINSTANCE.createCDS();
	}

	@Override
	public Object getObjectType() {
		return CDS.class;
	}
}
