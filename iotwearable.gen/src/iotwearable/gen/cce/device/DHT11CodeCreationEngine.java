package iotwearable.gen.cce.device;

import java.util.LinkedList;

import iotwearable.gen.comanalyzer.Token;
import iotwearable.model.iotw.ArduinoWiFiESP8266WeMosD1;
import iotwearable.model.iotw.DHT11;
import iotwearable.model.iotw.Mainboard;

public class DHT11CodeCreationEngine extends DeviceCodeCreationEngine {

	private DHT11 device;
	private Mainboard mainboard;
	private DeviceCodeCreationEngine deviceCodeCreationEngine;

	public DHT11CodeCreationEngine(DHT11 device) {
		this.device = device;
		mainboard = device.getMainboard();
		deviceCodeCreationEngine = CodeCreationEngineFactory.create(mainboard);
	}

	@Override
	public String createInclude() {
		// TODO Auto-generated method stub
		return "#include <"+DeviceLibrary.DHT+".h>";
	}

	@Override
	public String createDefine() {
		String pin = mainboard.findPin(device.getPinConnecteds().get(0)).getName();
		if(mainboard instanceof ArduinoWiFiESP8266WeMosD1)
		{
			ArduinoWiFiESP8266WeMosD1CodeCreationEngine _deviceCodeCreationEngine = (ArduinoWiFiESP8266WeMosD1CodeCreationEngine) deviceCodeCreationEngine;
			pin = _deviceCodeCreationEngine.mapPin(pin);
	    }
		String dhtPin = device.getId() +"_DHTPIN";
		String dhtType = device.getId() + "_DHTTYPE";
		String content = "//Define DHT11 - <id> \n";
		content += "const int " + dhtPin +" = " + pin + ";\n";
		content += "const int " + dhtType + " = DHT11;\n";
		content += "DHT dht("+dhtPin+", "+dhtType+");\n";
		return content;
	}

	@Override
	public String createInitSetup() {
		String content = " Serial.begin(9600);\n" + 
				"dht.begin();";
		return content;
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
		String code = "";
		return code;
	}

}
