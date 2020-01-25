package iotwearable.gen.cce.device;

import java.util.LinkedList;

import iotwearable.gen.comanalyzer.Token;
import iotwearable.model.iotw.ArduinoWiFiESP8266WeMosD1;
import iotwearable.model.iotw.LM35;
import iotwearable.model.iotw.Mainboard;

public class LM35CodeCreationEngine extends DeviceCodeCreationEngine{

	private LM35 device;
	private Mainboard mainboard;
	private DeviceCodeCreationEngine deviceCodeCreationEngine;
	
	public LM35CodeCreationEngine(LM35 device) {
		this.device = device;
		mainboard = device.getMainboard();
		deviceCodeCreationEngine = CodeCreationEngineFactory.create(mainboard);
	}
	
	@Override
	public String createInclude() {
		// TODO Auto-generated method stub
		return "#include <" + DeviceLibrary.OneWire + ".h>\n"
		+ "#include <" + DeviceLibrary.DallasTemperature + ".h>\n";
	}

	@Override
	public String createDefine() {
		String pin = mainboard.findPin(device.getPinConnecteds().get(0)).getName();
		if(mainboard instanceof ArduinoWiFiESP8266WeMosD1)
		{
			ArduinoWiFiESP8266WeMosD1CodeCreationEngine _deviceCodeCreationEngine = (ArduinoWiFiESP8266WeMosD1CodeCreationEngine) deviceCodeCreationEngine;
			pin = _deviceCodeCreationEngine.mapPin(pin);
	    }
		return "// Data wire is plugged into pin D1 on the ESP8266 12-E - GPIO "+ pin +" \n"
				+ "#define ONE_WIRE_BUS " + pin+ "\n"
				+ "// Setup a oneWire instance to communicate with any OneWire devices (not just Maxim/Dallas temperature ICs)\n"
				+ "OneWire oneWire(ONE_WIRE_BUS);\n"
				+ "// Pass our oneWire reference to Dallas Temperature.\n"
				+ "DallasTemperature DS18B20(&oneWire);\n";
	}

	@Override
	public String createInitSetup() {
		
		return "DS18B20.begin();";
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
