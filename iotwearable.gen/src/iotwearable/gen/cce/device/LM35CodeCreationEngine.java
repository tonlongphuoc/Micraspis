package iotwearable.gen.cce.device;

import java.util.LinkedList;

import iotwearable.gen.comanalyzer.Token;
import iotwearable.model.iotw.LM35;

public class LM35CodeCreationEngine extends DeviceCodeCreationEngine{

	private LM35 device;
	
	public LM35CodeCreationEngine(LM35 device) {
		this.device = device;
	}
	
	@Override
	public String createInclude() {
		// TODO Auto-generated method stub
		return "#include " + DeviceLibrary.OneWire + ".h>\n"
		+ "#include " + DeviceLibrary.DallasTemperature + ".h>\n";
	}

	@Override
	public String createDefine() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String createInitSetup() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String createInitLoop() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String createPrototype() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String createMethodImpl() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String createFromCommand(String syntax, LinkedList<Token> tokens) {
		// TODO Auto-generated method stub
		return "";
	}

}
