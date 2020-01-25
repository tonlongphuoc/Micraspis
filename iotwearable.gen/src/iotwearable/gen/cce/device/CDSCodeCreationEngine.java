package iotwearable.gen.cce.device;

import java.util.LinkedList;

import iotwearable.gen.comanalyzer.Token;
import iotwearable.model.iotw.ArduinoWiFiESP8266WeMosD1;
import iotwearable.model.iotw.CDS;
import iotwearable.model.iotw.Mainboard;

public class CDSCodeCreationEngine extends DeviceCodeCreationEngine {

	private CDS device;
	private Mainboard mainboard;
	private DeviceCodeCreationEngine deviceCodeCreationEngine;

	public CDSCodeCreationEngine(CDS device) {
		this.device = device;
		mainboard = device.getMainboard();
		deviceCodeCreationEngine = CodeCreationEngineFactory.create(mainboard);
	}

	@Override
	public String createInclude() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String createDefine() {
		String pin = mainboard.findPin(device.getPinConnecteds().get(0)).getName();
		if(mainboard instanceof ArduinoWiFiESP8266WeMosD1)
		{
			ArduinoWiFiESP8266WeMosD1CodeCreationEngine _deviceCodeCreationEngine = (ArduinoWiFiESP8266WeMosD1CodeCreationEngine) deviceCodeCreationEngine;
			pin = _deviceCodeCreationEngine.mapPin(pin);
	    }
		return "// Define " + device.getName() + "  input\n" + "const int " + device.getId() + " = " + pin + ";\n";
	}

	@Override
	public String createInitSetup() {
		return "pinMode(" + device.getId() + ", INPUT_PULLUP);// define pin as Input  sensor";
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
		if (syntax.equals("Display <id>")) {
			code = "digitalWrite(" + tokens.get(1).instance + ", HIGH);";
		} else if (syntax.equals("Hidden <id>")) {
			code = "digitalWrite(" + tokens.get(1).instance + ", LOW);";
		} else if (syntax.equals("Blink <id>")) {
			code = "digitalWrite(" + tokens.get(1).instance + ", HIGH);" + "\ndelay(1000);" + "\ndigitalWrite("
					+ tokens.get(1).instance + ", LOW);" + "\ndelay(1000);";

		} else if (syntax.equals("Blink <id><integer> times")) {
			code = "for(int i=0;i< " + tokens.get(2).instance + ";i++){" + "\ndigitalWrite(" + tokens.get(1).instance
					+ ", HIGH);" + "\ndelay(1000);" + "\ndigitalWrite(" + tokens.get(1).instance + ", LOW);"
					+ "\ndelay(1000);" + "\n}";
		} else if (syntax.equals("<id> : Display") || syntax.equals("<id> : Hidden")) {
			code = "if(digitalRead(" + tokens.get(0).instance + ")==";
			if (tokens.get(2).instance.equals("Display")) {
				code += "HIGH";
			} else if (tokens.get(2).instance.equals("Hidden")) {
				code += "LOW";
			}
			code += "){\n<content>\n}";
		}
		return code;
	}

}
