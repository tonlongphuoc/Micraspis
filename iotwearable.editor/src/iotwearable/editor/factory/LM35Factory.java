package iotwearable.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import iotwearable.model.iotw.IotwFactory;
import iotwearable.model.iotw.LM35;

/**
 * Used to create new LM35
 */
public class LM35Factory implements CreationFactory{
	@Override
	public Object getNewObject() {
		return IotwFactory.eINSTANCE.createLM35();
	}

	@Override
	public Object getObjectType() {
		return LM35.class;
	}
}
