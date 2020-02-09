package iotwearable.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import iotwearable.model.iotw.DHT11;
import iotwearable.model.iotw.IotwFactory;

/**
 * Used to create new DHT11
 */
public class DHT11Factory implements CreationFactory{
	@Override
	public Object getNewObject() {
		return IotwFactory.eINSTANCE.createDHT11();
	}

	@Override
	public Object getObjectType() {
		return DHT11.class;
	}
}
