package iotwearable.gen.cce.device;

import iotwearable.gen.comanalyzer.Token;
import iotwearable.model.iotw.ArduinoWiFiESP8266WeMosD1;
import iotwearable.model.iotw.Button;
import iotwearable.model.iotw.Mainboard;

import java.util.LinkedList;

public class PushButtonCodeCreationEngine extends DeviceCodeCreationEngine{
	private Button button;
	private Mainboard mainboard;
	private DeviceCodeCreationEngine deviceCodeCreationEngine;
	
	public PushButtonCodeCreationEngine(Button button) {
		super();
		this.button = button;
		mainboard = button.getMainboard();
		deviceCodeCreationEngine = CodeCreationEngineFactory.create(mainboard);
	}

	@Override
	public String createInclude() {
		return "";
	}

	@Override
	public String createDefine() {
		String pin = mainboard.findPin(button.getPinConnecteds().get(0)).getName();
		if(mainboard instanceof ArduinoWiFiESP8266WeMosD1)
		{
			ArduinoWiFiESP8266WeMosD1CodeCreationEngine _deviceCodeCreationEngine = (ArduinoWiFiESP8266WeMosD1CodeCreationEngine) deviceCodeCreationEngine;
			pin = _deviceCodeCreationEngine.mapPin(pin);
	    }
		StringBuilder content = new StringBuilder();
		 content.append("// Define "+button.getName()+"  output\n");
		 content.append("const int " + button.getId()+" = "+ pin +";");
		return content.toString();
	}

	@Override
	public String createInitSetup() {
	return	"pinMode("+button.getId()+", INPUT);";
	}

	@Override
	public String createInitLoop() {
		return "";
	}

	@Override
	public String createFromCommand(String syntax, LinkedList<Token> tokens) {
		String code = "";
		if (syntax.equals("<id> push")) {
			code = "if(digitalRead("+button.getId()+") == HIGH){\n"
					+ "<content>"
					+ "\n}";
		}
		return code;
	}

	@Override
	public String createPrototype() {
		return "";
	}

	@Override
	public String createMethodImpl() {
		return "";
	}
}